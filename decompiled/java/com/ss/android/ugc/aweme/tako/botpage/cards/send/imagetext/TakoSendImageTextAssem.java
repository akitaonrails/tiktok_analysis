package com.ss.android.ugc.aweme.tako.botpage.cards.send.imagetext;

import X.C01GW;
import X.C0DSB;
import X.C0HZQ;
import X.C13LC;
import X.C13LP;
import X.C14J2;
import X.C1558520qew;
import X.C1857100yQW;
import X.C1857420yR2;
import X.C1857750yRZ;
import X.C1859620yUa;
import X.C1859930yV5;
import X.C1863850ybP;
import X.C1918907fP;
import X.C1919007fQ;
import X.C339410DSh;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C687700QyG;
import X.C723830SaL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1860040yVG;
import X.InterfaceC665370Q7z;
import X.ViewOnLongClickListenerC1864620yce;
import Y.ACListenerS44S0210000_27;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSendImageTextAssem extends TakoSendBaseAssem<C1857100yQW> {
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 761));
    public C339410DSh LLLJL;
    public AIBotInfo LLLL;
    public FrameLayout LLLLII;
    public View LLLLIIIILLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fnf;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(TakoFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final View iy1() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Wp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void up(C1857100yQW c1857100yQW) {
        boolean z;
        int size;
        int size2;
        boolean z2;
        List<BaseVideo> list;
        List<BaseImage> imageList;
        List<BaseImage> imageList2;
        int iIntValue;
        int iIntValue2;
        BaseVideo baseVideo;
        Integer num;
        BaseVideo baseVideo2;
        Integer num2;
        BaseVideo baseVideo3;
        BaseImage baseImage;
        List<String> list2;
        List<BaseVideo> list3;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        super.up(c1857100yQW);
        C339410DSh c339410DSh = this.LLLJL;
        if (c339410DSh != null) {
            c339410DSh.LIZ(c1857100yQW.LLILZIL);
        }
        List<String> list4 = null;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            long j = c1863850ybP.LLJJ;
            int i = c1863850ybP.LLJJI;
            String str = c1863850ybP.LLJJIII;
            if (str == null) {
                str = "";
            }
            this.LLLL = new AIBotInfo(j, str, null, i, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null);
        }
        C14J2 c14j2 = this.LLLIL;
        if (c14j2 != null) {
            c14j2.setOnLongClickListener(new ViewOnLongClickListenerC1864620yce(this, c1857100yQW, 4));
        }
        String str2 = c1857100yQW.LLJ;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        int i2 = 8;
        if (z) {
            C14J2 c14j22 = this.LLLIL;
            if (c14j22 != null) {
                C786410Ut5.LJZL(8, c14j22);
            }
        } else {
            C14J2 c14j23 = this.LLLIL;
            if (c14j23 != null) {
                C786410Ut5.LJZL(0, c14j23);
            }
        }
        List<BaseImage> imageList3 = c1857100yQW.getImageList();
        if (imageList3 != null) {
            size = imageList3.size();
        } else {
            size = 0;
        }
        List<ConvertStyleItem> list5 = c1857100yQW.LLJI;
        if (list5 != null) {
            size2 = list5.size();
        } else {
            size2 = 0;
        }
        if (size + size2 == 1 && c1857100yQW.LLJILJILJ && (list3 = c1857100yQW.LLJILJIL) != null && !list3.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c1857100yQW.LLJILJILJ && (list = c1857100yQW.LLJILJIL) != null && !list.isEmpty() && (imageList = c1857100yQW.getImageList()) != null && !imageList.isEmpty() && ((imageList2 = c1857100yQW.getImageList()) == null || (baseImage = (BaseImage) C13LP.LJJJLL(imageList2)) == null || (list2 = baseImage.urlList) == null || list2.isEmpty())) {
            List<BaseVideo> list6 = c1857100yQW.LLJILJIL;
            if (list6 != null && (baseVideo3 = (BaseVideo) C13LP.LJJJLL(list6)) != null) {
                list4 = baseVideo3.urlList;
            }
            List<BaseVideo> list7 = c1857100yQW.LLJILJIL;
            if (list7 != null && (baseVideo2 = (BaseVideo) C13LP.LJJJLL(list7)) != null && (num2 = baseVideo2.width) != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            List<BaseVideo> list8 = c1857100yQW.LLJILJIL;
            if (list8 != null && (baseVideo = (BaseVideo) C13LP.LJJJLL(list8)) != null && (num = baseVideo.height) != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 0;
            }
            if (list4 != null && !list4.isEmpty()) {
                try {
                    if (c1857100yQW.LLIZLLLIL.LLILLL.LJIIIZ() != null) {
                        c1857100yQW.LLIZLLLIL.LLILLL.LJIIJJI(new AwS606S0100000_27(new BaseImage(null, null, list4, null, iIntValue, iIntValue2, null, null, null, null, null, null, null, null, null, 0, 0, null, 262091, null), 234));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        View view = this.LLLLIIIILLL;
        if (view != null) {
            if (z2) {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
        View view2 = this.LLLLIIIILLL;
        if (view2 != null) {
            view2.setOnLongClickListener(new ViewOnLongClickListenerC1864620yce(this, c1857100yQW, 5));
        }
        View view3 = this.LLLLIIIILLL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS44S0210000_27(c1857100yQW, this, z2, 2), view3);
        }
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZ() && c1857100yQW.LLIZ.length() > 0) {
            C0DSB.LIZJ(this.LLLLII);
        } else {
            C0DSB.LIZIZ(this.LLLLII);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Resources resources;
        C339410DSh c339410DSh;
        super.onViewCreated(view);
        this.LLLJL = (C339410DSh) view.findViewById(R.id.o_4);
        if (C1859620yUa.LIZ() && (c339410DSh = this.LLLJL) != null) {
            C1857750yRZ.LJIILL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), c339410DSh);
        }
        C339410DSh c339410DSh2 = this.LLLJL;
        if (c339410DSh2 != null) {
            c339410DSh2.setOnNotSentClickCallback(new AwS606S0100000_27(this, 235));
        }
        C723830SaL.LIZ(this, null, new AwS606S0100000_27(this, 236));
        this.LLLLIIIILLL = view.findViewById(R.id.video_click_overlay);
        View viewFindViewById = view.findViewById(R.id.kd6);
        if (up()) {
            C1857750yRZ.LJIILJJIL(C1918907fP.LIZ(), viewFindViewById);
            C1857750yRZ.LJIIJJI(C1918907fP.LIZ(), viewFindViewById);
        } else {
            Context context = viewFindViewById.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                int dimension = (int) resources.getDimension(R.dimen.ada);
                C1857750yRZ.LJIILJJIL(dimension, viewFindViewById);
                C1857750yRZ.LJIIJJI(dimension, viewFindViewById);
            }
        }
        this.LLLLII = (FrameLayout) view.findViewById(R.id.et0);
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZ()) {
            C723830SaL.LIZ(this, null, new AwS606S0100000_27(this, 237));
            FrameLayout frameLayout = this.LLLLII;
            if (frameLayout != null) {
                C1857750yRZ.LJIIJJI(C1918907fP.LIZ(), frameLayout);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem
    public final List Gp(View view, InterfaceC665370Q7z interfaceC665370Q7z, Message message) {
        TakoMixFeed takoMixFeedLJIIIZ;
        String strLIZLLL;
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        ArrayList arrayList = new ArrayList();
        InterfaceC1860040yVG interfaceC1860040yVG = this.LLLILZLLLI;
        if (interfaceC1860040yVG == null ? (takoMixFeedLJIIIZ = message.LJIIIZ()) == null || (strLIZLLL = takoMixFeedLJIIIZ.text) == null : (strLIZLLL = C1859930yV5.LIZLLL(interfaceC1860040yVG)) == null) {
            strLIZLLL = "";
        }
        C1857420yR2.LIZIZ(arrayList, view, strLIZLLL, message, interfaceC665370Q7z, null, null, 48);
        C1857420yR2.LJI(arrayList, message, interfaceC665370Q7z);
        C1857420yR2.LJIILL(arrayList, this.LLLILZLLLI, message, interfaceC665370Q7z, false);
        C1857420yR2.LJIILLIIL(24, view, interfaceC665370Q7z, message, null, arrayList, null);
        C1857420yR2.LIZLLL(arrayList, getContext(), message, Qp(message), interfaceC665370Q7z);
        C1857420yR2.LIZJ(interfaceC665370Q7z, arrayList);
        return arrayList;
    }
}
