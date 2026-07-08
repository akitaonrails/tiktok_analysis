package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C1697810uHb;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicState {
    public static final Companion Companion = new Companion();
    public static final List<String> stateString = C1697810uHb.LJIIJJI("idle", "initialized", "waiting", "joining_channel", "joined_channel", "frame_linked", "finished");

    public static final class Companion {
        public final boolean isFinished(int i) {
            return i == 6;
        }

        public final boolean isFrameLinked(int i) {
            return i == 5;
        }

        public final boolean isIdle(int i) {
            return i == 0;
        }

        public final boolean isInitialized(int i) {
            return i == 1;
        }

        public final boolean isJoinedChannel(int i) {
            return i == 4;
        }

        public final boolean isJoiningChannel(int i) {
            return i == 3;
        }

        public final boolean isWaiting(int i) {
            return i == 2;
        }

        public final String castStateToString(int i) {
            List<String> list = LinkMicState.stateString;
            if (i < list.size()) {
                return (String) ListProtector.get(list, i);
            }
            return "";
        }

        public final boolean isIdleOrFinished(int i) {
            if (!isIdle(i) && !isFinished(i)) {
                return false;
            }
            return true;
        }

        public final boolean isIdleOrInitOrWaiting(int i) {
            if (!isIdle(i) && !isInitialized(i) && !isWaiting(i)) {
                return false;
            }
            return true;
        }

        public final boolean isJoinedOrLinked(int i) {
            if (!isJoinedChannel(i) && !isFrameLinked(i)) {
                return false;
            }
            return true;
        }

        public final boolean isJoiningOrJoinedOrLinked(int i) {
            if (!isJoiningChannel(i) && !isJoinedChannel(i) && !isFrameLinked(i)) {
                return false;
            }
            return true;
        }

        public final boolean isJoiningOrJoinedOrLinkedOrFinish(int i) {
            if (!isJoiningOrJoinedOrLinked(i) && !isFinished(i)) {
                return false;
            }
            return true;
        }

        public final boolean isWaitingOrJoiningOrJoinedOrLinked(int i) {
            if (!isWaiting(i) && !isJoiningOrJoinedOrLinked(i)) {
                return false;
            }
            return true;
        }
    }
}
