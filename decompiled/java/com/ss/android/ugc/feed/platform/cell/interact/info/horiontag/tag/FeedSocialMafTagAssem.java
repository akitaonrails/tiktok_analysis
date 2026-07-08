package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C523420Kfs;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedSocialMafTagAssem extends DynamicComponent<FeedSocialMafTagAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public int LLLFZ;
    public String LLLI;
    public boolean LLLII;
    public final InterfaceC1731706qJ LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedSocialMafTagAssem.class, "videoTagVM", "getVideoTagVM()Lcom/ss/android/ugc/feed/platform/cell/interact/info/horiontag/tag/FeedSocialTagViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FeedSocialMafTagAssem.class, "exposedCommentVM", "getExposedCommentVM()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FeedSocialMafTagAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSocialTagViewModel.class);
        this.LLJZIJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 306), null, AFwS243S0000000_11.get$arr$(568));
        this.LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1268));
        this.LLLF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1267));
        this.LLLFF = C452501pT.LIZIZ(new AwS548S0100000_4(this, 307));
        this.LLLFFI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1266));
        this.LLLFZ = -1;
        this.LLLI = "";
        CommentService.LIZ.getClass();
        this.LLLIIII = C523420Kfs.LIZ().LJJLIIIJJI(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bad;
    }

    public final LinearLayout Fp() {
        return (LinearLayout) this.LLLF.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r19) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialMafTagAssem.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
