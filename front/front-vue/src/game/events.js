const { Events } = require("phaser");
const events = new Events.EventEmitter();
events.on("meetMonster", () => {
  events.store.commit("phaser/setIsMeet", true);
  events.store.commit("ringfit/setIdx", events.store.state.ringfit.idx + 1);
});

events.on("saveScene", scene => {
  events.store.commit("phaser/setScene", scene);
});
events.on("setCoin", coin => {
  events.store.commit("ringfit/setCoin", coin);
});
export default events;
