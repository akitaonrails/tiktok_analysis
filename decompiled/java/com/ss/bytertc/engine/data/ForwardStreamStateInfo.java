package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public class ForwardStreamStateInfo {
    public ForwardStreamError error;
    public String roomId;
    public ForwardStreamState state;

    public enum ForwardStreamError {
        FORWARD_STREAM_ERROR_OK(0),
        FORWARD_STREAM_ERROR_INVALID_ARGUMENT(1201),
        FORWARD_STREAM_ERROR_INVALID_TOKEN(1202),
        FORWARD_STREAM_ERROR_RESPONSE(1203),
        FORWARD_STREAM_ERROR_REMOTE_KICKED(1204),
        FORWARD_STREAM_ERROR_NOT_SUPPORT(1205);

        public int value;

        public int value() {
            return this.value;
        }

        public static ForwardStreamError fromId(int i) {
            for (ForwardStreamError forwardStreamError : values()) {
                if (forwardStreamError.value() == i) {
                    return forwardStreamError;
                }
            }
            return null;
        }

        public static ForwardStreamError valueOf(String str) {
            return (ForwardStreamError) C08FF.LIZ(ForwardStreamError.class, str);
        }

        ForwardStreamError(int i) {
            this.value = i;
        }
    }

    public enum ForwardStreamState {
        FORWARD_STREAM_STATE_IDLE(0),
        FORWARD_STREAM_STATE_SUCCESS(1),
        FORWARD_STREAM_STATE_FAILURE(2);

        public int value;

        public int value() {
            return this.value;
        }

        public static ForwardStreamState fromId(int i) {
            for (ForwardStreamState forwardStreamState : values()) {
                if (forwardStreamState.value() == i) {
                    return forwardStreamState;
                }
            }
            return null;
        }

        public static ForwardStreamState valueOf(String str) {
            return (ForwardStreamState) C08FF.LIZ(ForwardStreamState.class, str);
        }

        ForwardStreamState(int i) {
            this.value = i;
        }
    }

    public ForwardStreamStateInfo(String str, ForwardStreamState forwardStreamState, ForwardStreamError forwardStreamError) {
        this.roomId = str;
        this.state = forwardStreamState;
        this.error = forwardStreamError;
    }

    public static ForwardStreamStateInfo create(String str, int i, int i2) {
        return new ForwardStreamStateInfo(str, ForwardStreamState.fromId(i), ForwardStreamError.fromId(i2));
    }
}
