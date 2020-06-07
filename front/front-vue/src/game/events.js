const { Events } = require("phaser");
const events = new Events.EventEmitter();
events.on("meetMonster", () => {
  events.store.commit("phaser/setIsMeet", true);
});

events.on("saveScene", scene => {
  events.store.commit("phaser/setScene", scene);
});

export default events;
