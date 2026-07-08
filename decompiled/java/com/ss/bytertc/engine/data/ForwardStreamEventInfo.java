package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public class ForwardStreamEventInfo {
    public ForwardStreamEvent event;
    public String roomId;

    public enum ForwardStreamEvent {
        FORWARD_STREAM_EVENT_DISCONNECTED(0),
        FORWARD_STREAM_EVENT_CONNECTED(1),
        FORWARD_STREAM_EVENT_INTERRUPT(2),
        FORWARD_STREAM_EVENT_DST_ROOM_UPDATED(3),
        FORWARD_STREAM_EVENT_UN_EXPECT_API_CALL(4);

        public int value;

        public int value() {
            return this.value;
        }

        public static ForwardStreamEvent fromId(int i) {
            for (ForwardStreamEvent forwardStreamEvent : values()) {
                if (forwardStreamEvent.value() == i) {
                    return forwardStreamEvent;
                }
            }
            return null;
        }

        public static ForwardStreamEvent valueOf(String str) {
            return (ForwardStreamEvent) C08FF.LIZ(ForwardStreamEvent.class, str);
        }

        ForwardStreamEvent(int i) {
            this.value = i;
        }
    }

    public ForwardStreamEventInfo(String str, ForwardStreamEvent forwardStreamEvent) {
        this.roomId = str;
        this.event = forwardStreamEvent;
    }

    public static ForwardStreamEventInfo create(String str, int i) {
        return new ForwardStreamEventInfo(str, ForwardStreamEvent.fromId(i));
    }
}
