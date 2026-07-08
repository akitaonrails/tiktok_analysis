package com.bytedance.android.livesdk.comp.api.pcs.data.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TetrisBaParam {

    @C09CT("anchor_id")
    public final String anchorId;

    @C09CT("anchor_item_id")
    public final String anchorItemId;

    @C09CT("ba_avator")
    public final String baAvatar;

    @C09CT("ba_id")
    public final String baId;

    @C09CT("bs_id")
    public final String bsId;

    @C09CT("form_intro")
    public final String formIntro;

    @C09CT("is_ba")
    public final boolean isBa;

    @C09CT("live_smb_extra")
    public final String liveSMBExtra;

    @C09CT("placement")
    public final long placement;

    @C09CT("room_id")
    public final String roomId;

    public TetrisBaParam() {
        this(0L, null, null, "", "", "", false, "", "", "");
    }

    public TetrisBaParam(long j, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8) {
        this.placement = j;
        this.anchorId = str;
        this.anchorItemId = str2;
        this.roomId = str3;
        this.baId = str4;
        this.formIntro = str5;
        this.isBa = z;
        this.baAvatar = str6;
        this.bsId = str7;
        this.liveSMBExtra = str8;
    }
}
