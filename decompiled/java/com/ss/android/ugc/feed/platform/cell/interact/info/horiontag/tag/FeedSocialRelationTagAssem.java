package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C01GW;
import X.C0HHT;
import X.C0RF0;
import X.C0RZI;
import X.C123100dR;
import X.C1308910kAL;
import X.C1378990lzN;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1AF0;
import X.C2217381BqS;
import X.C294810Bh1;
import X.C299590Boj;
import X.C418440Gaw;
import X.C452501pT;
import X.C475630Ikz;
import X.C690430R6j;
import X.C690870R8b;
import X.C698200Ra6;
import X.C704010RjT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS146S0100000_11;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedSocialRelationTagAssem extends DynamicComponent<FeedSocialRelationTagAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public TuxTag LLL;
    public final C01GW LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedSocialRelationTagAssem.class, "videoTagVM", "getVideoTagVM()Lcom/ss/android/ugc/feed/platform/cell/interact/info/horiontag/tag/FeedSocialTagViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedSocialRelationTagAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSocialTagViewModel.class);
        this.LLJZIJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 308), null, AFwS243S0000000_11.get$arr$(571));
        this.LLLF = C452501pT.LIZIZ(new AwS548S0100000_4(this, 309));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bae;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        List<AwemeHybridLabelModel> hybridLabels;
        List listLLIIII;
        AwemeHybridLabelModel awemeHybridLabelModel;
        Integer numLIZJ;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && (hybridLabels = aweme.getHybridLabels()) != null && (listLLIIII = C13LP.LLIIII(hybridLabels)) != null && (awemeHybridLabelModel = (AwemeHybridLabelModel) C13LP.LJJJLL(listLLIIII)) != null) {
            getContentView().setBackground((Drawable) this.LLLF.getValue());
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            C786410Ut5.LJLLLLLL(0, getContentView());
            List<AwemeLabelModel> list = aweme.videoLabels;
            TuxTag tuxTag = this.LLL;
            String str = null;
            if (tuxTag == null) {
                tuxTag = null;
            }
            C0RZI.LIZ(tuxTag, list, awemeHybridLabelModel);
            if (C294810Bh1.LIZ()) {
                TuxTag tuxTag2 = this.LLL;
                if (tuxTag2 == null) {
                    tuxTag2 = null;
                }
                tuxTag2.setTagTextColor(C475630Ikz.LIZIZ(R.attr.zi, getContext()));
                TuxTag tuxTag3 = this.LLL;
                if (tuxTag3 == null) {
                    tuxTag3 = null;
                }
                tuxTag3.setBackgroundColor(C475630Ikz.LIZIZ(R.attr.il, getContext()));
                TuxTag tuxTag4 = this.LLL;
                if (tuxTag4 == null) {
                    tuxTag4 = null;
                }
                C1378990lzN.LIZIZ(tuxTag4, Float.valueOf(C418440Gaw.LIZIZ(4)), null, null, null, null, 30);
            } else {
                Context context = getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ej, context)) != null) {
                    int iIntValue = numLIZJ.intValue();
                    TuxTag tuxTag5 = this.LLL;
                    if (tuxTag5 == null) {
                        tuxTag5 = null;
                    }
                    tuxTag5.setTagTextColor(iIntValue);
                }
            }
            C698200Ra6 c698200Ra6 = C698200Ra6.LIZ;
            View contentView = getContentView();
            c698200Ra6.getClass();
            if (C123100dR.LIZ(awemeHybridLabelModel.refUrl)) {
                C786410Ut5.I7(new ACListenerS146S0100000_11(awemeHybridLabelModel, 44), contentView);
            }
            View contentView2 = getContentView();
            VideoItemParams videoItemParams2 = (VideoItemParams) ((AssemViewModelWithItem) this.LLJZIJLIL.getValue(this, LLLFF[0])).getItem();
            if (videoItemParams2 != null) {
                str = videoItemParams2.mEventType;
            }
            C698200Ra6.LIZ(aweme, listLLIIII, contentView2, str, false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        String str;
        super.onViewCreated(view);
        this.LLL = (TuxTag) view.findViewById(R.id.zt1);
        setComponentClickStatusExperimental(getContentView(), EnumC700430Rdh.POSITIVE);
        TuxTag tuxTag = null;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        } else {
            str = null;
        }
        if (C704010RjT.LJ(str)) {
            TuxTag tuxTag2 = this.LLL;
            if (tuxTag2 == null) {
                tuxTag2 = null;
            }
            tuxTag2.setTagSize(2);
            TuxTag tuxTag3 = this.LLL;
            if (tuxTag3 != null) {
                tuxTag = tuxTag3;
            }
            C704010RjT.LIZIZ(tuxTag);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
