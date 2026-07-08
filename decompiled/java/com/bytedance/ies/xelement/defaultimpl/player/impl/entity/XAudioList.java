package com.bytedance.ies.xelement.defaultimpl.player.impl.entity;

import X.C09CT;
import X.C13BV;
import X.InterfaceC2179131AQd;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class XAudioList {

    @C09CT("list")
    public List<XAudioSrc> mDataSet;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String mId = "";

    @C09CT("position")
    public Integer mPosition = 0;

    public final InterfaceC2179131AQd toPlaylist() {
        final String str = this.mId;
        if (str == null) {
            str = "";
        }
        final List list = this.mDataSet;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        Integer num = this.mPosition;
        final int iIntValue = num != null ? num.intValue() : 0;
        return new InterfaceC2179131AQd(str, list, iIntValue) { // from class: X.1AQa
            public final String LIZ;
            public final List<InterfaceC2179261AQq> LIZIZ;
            public int LIZJ;

            @Override // X.InterfaceC2179131AQd
            public final List<InterfaceC2179261AQq> LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC2179131AQd
            public final int LJLJJL() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC2179131AQd
            public final String getId() {
                return this.LIZ;
            }

            @Override // X.InterfaceC2179131AQd
            public final void LIZ(int i) {
                this.LIZJ = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = str;
                this.LIZIZ = list;
                this.LIZJ = iIntValue;
            }
        };
    }
}
