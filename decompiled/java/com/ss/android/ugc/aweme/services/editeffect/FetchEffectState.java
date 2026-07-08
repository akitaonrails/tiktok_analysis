package com.ss.android.ugc.aweme.services.editeffect;

import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public abstract class FetchEffectState {

    public static final class INIT extends FetchEffectState {
        public static final INIT INSTANCE = new INIT();
    }

    public static final class LOADING extends FetchEffectState {
        public static final LOADING INSTANCE = new LOADING();
    }

    public static final class ERROR extends FetchEffectState {
        public final int code;
        public final String message;

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public ERROR(int i, String str) {
            this.code = i;
            this.message = str;
        }
    }

    public static final class SUCCESS extends FetchEffectState {
        public final List<EditEffectAnchorInfo> data;

        public final List<EditEffectAnchorInfo> getData() {
            return this.data;
        }

        public SUCCESS(List<EditEffectAnchorInfo> list) {
            this.data = list;
        }
    }
}
