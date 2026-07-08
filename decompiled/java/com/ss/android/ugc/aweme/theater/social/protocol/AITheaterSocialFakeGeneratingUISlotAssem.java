package com.ss.android.ugc.aweme.theater.social.protocol;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C03IT;
import X.C0I6Y;
import X.C0MU2;
import X.C0MXF;
import X.C0MXG;
import X.C0MXH;
import X.C0MXK;
import X.C0MXN;
import X.C0MXX;
import X.C0MXY;
import X.C0PEM;
import X.C0VSJ;
import X.C0ZHB;
import X.C1017903yT;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1602160rnK;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C1AF0;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C461530I7z;
import X.C546890Lcd;
import X.C547860LeC;
import X.C547930LeJ;
import X.C548360Lf0;
import X.C548430Lf7;
import X.C549150LgH;
import X.C549720LhC;
import X.C550970LjD;
import X.C554730LpH;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC528960Koo;
import X.InterfaceC550020Lhg;
import X.InterfaceC550750Lir;
import X.InterfaceC558600LvW;
import X.InterfaceC712990Rxx;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.vm.SkeletonLayoutCellFragmentScopeViewModel;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.zhiliaoapp.musically.R;
import irm.AkS53S0200000_8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterSocialFakeGeneratingUISlotAssem extends ReusedUISlotAssem<AITheaterSocialFakeGeneratingUISlotAssem> implements InterfaceC712990Rxx<C0MXN> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC550020Lhg LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public AnonymousClass0956 LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AITheaterSocialFakeGeneratingUISlotAssem.class, "skeletonLayoutCellFragmentScopeViewModel", "getSkeletonLayoutCellFragmentScopeViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/messagelist/skeleton/vm/SkeletonLayoutCellFragmentScopeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AITheaterSocialFakeGeneratingUISlotAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkeletonLayoutCellFragmentScopeViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS552S0100000_8(c19719912DlLIZ, 456), null, AFwS239S0000000_8.get$arr$(155));
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        this.LLJL = iAITheaterFeatureServiceLIZ != null ? iAITheaterFeatureServiceLIZ.LJIIIZ() : null;
        this.LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 455));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 454));
        this.LLJLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 448));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 447));
        this.LLJLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 446));
        this.LLJZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 452));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 451));
        this.LLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 449));
        this.LLLF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 450));
        this.LLLFF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 453));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.nl;
    }

    public final boolean op() {
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && !fragmentLJI.isRemoving() && !fragmentLJI.isDetached() && fragmentLJI.getFragmentManager() != null) {
                SkeletonLayoutCellFragmentScopeViewModel skeletonLayoutCellFragmentScopeViewModel = (SkeletonLayoutCellFragmentScopeViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLFZ[0]);
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (skeletonLayoutCellFragmentScopeViewModel.LL.add(C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)).getUuid())) {
                    return true;
                }
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AITheaterSocialFakeGeneratingUISlotAssem: ");
            sbLIZ.append(getParent());
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void Fp() {
        String string;
        Integer numLIZJ;
        C786410Ut5.LLZILL((TuxSpinner) this.LLJLIL.getValue(), 0);
        TuxSpinner tuxSpinner = (TuxSpinner) this.LLJLIL.getValue();
        Context context = getContext();
        tuxSpinner.LIZ(R.raw.icon_spinner_thin, (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, context)) == null) ? 0 : numLIZJ.intValue());
        View view = (View) this.LLJLLL.getValue();
        int visibility = view.getVisibility();
        view.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, view);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLJZ.getValue(), 0);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLJZIJLIL.getValue(), 0);
        C786410Ut5.LLLLLLZZ((TuxIconView) this.LLL.getValue(), 8);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLLF.getValue(), 8);
        C786410Ut5.LLLLLLJ(sp(), 8);
        C786410Ut5.U8(sp(), null);
        C786410Ut5.LLLLLLZZ(tp(), 8);
        C786410Ut5.a9(tp(), null);
        tp().setBackground(null);
        Context context2 = getContext();
        if (context2 == null || (string = context2.getString(2131826030, 0)) == null) {
            string = "";
        }
        TextView textView = (TextView) this.LLJZ.getValue();
        if (u.LJJIIJZLJL(string, "%", false) || Intrinsics.LJFF(string, "")) {
            string = "0%";
        }
        textView.setText(string);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        AnonymousClass0956 anonymousClass0956 = this.LLLFFI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLFFI = null;
        Fp();
    }

    public final C197039127h sp() {
        return (C197039127h) this.LLLFF.getValue();
    }

    public final TuxIconView tp() {
        return (TuxIconView) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        AnonymousClass0956 anonymousClass0956 = this.LLLFFI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLFFI = null;
        Fp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        view.setTag(R.id.k__, C0ZHB.FIRST_ITEM_FILL_TOP);
        C554730LpH.LIZJ(C786410Ut5.ne(new ContextThemeWrapper(((View) this.LLJLL.getValue()).getContext(), R.style.y0)), R.layout.nk, (ViewGroup) this.LLJLL.getValue(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    @Override // X.InterfaceC712990Rxx
    public final void up(C0MXN c0mxn) {
        int iIntValue;
        int iIntValue2;
        ?? arrayList;
        int iLJIJI;
        String string;
        String str;
        boolean z;
        boolean z2;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        List<MentionDataItem> list;
        Integer numLIZJ;
        Fp();
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C418440Gaw.LIZIZ(12);
        C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(12));
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.z_, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        gradientDrawable.setColor(iIntValue);
        C547860LeC.LIZ.getClass();
        String strLIZ = C547860LeC.LJI().LIZ(C548430Lf7.LIZJ);
        if (strLIZ != null && !a0.LJJJIL(strLIZ) && new C0VSJ(strLIZ).exists()) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(new C0VSJ(strLIZ).toURI().toString())));
            c1331670kl3LJIIJ.LJJI = c1331730kl9;
            c1331670kl3LJIIJ.LJJ((SmartImageView) this.LLJLLIL.getValue());
            c1331670kl3LJIIJ.LJJIIZI(gradientDrawable);
            C786410Ut5.h3(c1331670kl3LJIIJ);
        } else {
            ((SmartImageView) this.LLJLLIL.getValue()).setPlaceholderImage(gradientDrawable);
        }
        View view = (View) this.LLJLLIL.getValue();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(12));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, ((View) this.LLJLLIL.getValue()).getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        gradientDrawable2.setStroke(iLIZIZ, iIntValue2);
        view.setBackground(gradientDrawable2);
        ((View) this.LLJLLIL.getValue()).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        AIGCSocialModel aIGCSocialModel = c0mxn.LLILLL;
        if (aIGCSocialModel != null && (list = aIGCSocialModel.participantCameoInfo) != null) {
            arrayList = new ArrayList();
            Iterator<MentionDataItem> it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().iconUrl;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        int size = arrayList.size();
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) != null) {
            iLJIJI = interfaceC558600LvWLIZIZ.LJIJI();
        } else {
            iLJIJI = 3;
        }
        int iMin = Math.min(size, iLJIJI);
        C0MXX c0mxx = new C0MXX();
        c0mxx.avatars(C13LP.LL(arrayList, iMin));
        c0mxx.avatarSizeDp(56);
        c0mxx.hollowContentSizePx(0);
        c0mxx.hollowIconSizePx(0);
        c0mxx.hollowOffsetPx(0, 0);
        c0mxx.showLimit(iMin);
        c0mxx.outlineWidthPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        c0mxx.overlapSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        c0mxx.build();
        ((C0MXY) this.LLJLLL.getValue()).LIZ(c0mxx);
        Context context2 = getContext();
        if (context2 == null || (string = context2.getString(2131826030, 0)) == null) {
            string = "";
        }
        TextView textView = (TextView) this.LLJZ.getValue();
        if (u.LJJIIJZLJL(string, "%", false) || Intrinsics.LJFF(string, "")) {
            string = "0%";
        }
        textView.setText(string);
        ((TextView) this.LLJZIJLIL.getValue()).setText(C547930LeJ.LIZ(2131826029, new Object[0]));
        AnonymousClass0956 anonymousClass0956 = this.LLLFFI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AIGCSocialModel aIGCSocialModel2 = c0mxn.LLILLL;
        if (aIGCSocialModel2 != null && (str = aIGCSocialModel2.taskId) != null) {
            int iLIZ = C0MXG.LIZ(c0mxn.LL.LIZ.LIZ.getUuid());
            C0MXF c0mxf = C0MXF.EXPIRED;
            if (iLIZ == c0mxf.getType()) {
                Bp(c0mxf, c0mxn, null, -1L);
                return;
            }
            if (C0MXG.LIZ(c0mxn.LL.LIZ.LIZ.getUuid()) != C0MXF.NOT_FAIL.getType()) {
                z = true;
            } else {
                z = false;
            }
            String uuid = c0mxn.LL.LIZ.LIZ.getUuid();
            if (uuid != null && uuid.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            long j = 0;
            if (!z2) {
                j = ((Keva) C0MXG.LIZIZ.getValue()).getLong(uuid, 0L);
            }
            if (j < System.currentTimeMillis() && z) {
                if (C0MXG.LIZ(c0mxn.LL.LIZ.LIZ.getUuid()) != c0mxf.getType()) {
                    Ap(c0mxn, 10006);
                    C0MU2 c0mu2 = C0MU2.LIZ;
                    String uuid2 = c0mxn.LL.LIZ.LIZ.getUuid();
                    c0mu2.getClass();
                    C0MU2.LJFF(0, 10006, uuid2, null, str);
                }
                Bp(c0mxf, c0mxn, null, -1L);
                return;
            }
            this.LLLFFI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C550970LjD(c0mxn, this, str, null), 2);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0MXN c0mxn) {
        return true;
    }

    public final void yp(AIGCSocialModel aIGCSocialModel) {
        boolean z;
        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
        AITheaterProfileService aITheaterProfileService;
        InterfaceC528960Koo interfaceC528960KooJ9;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) != null && interfaceC558600LvWLIZIZ.LJ()) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        Activity activityLIZIZ = null;
        if (!z) {
            C549150LgH c549150LgH = C549150LgH.LIZ;
            Context context = getContext();
            if (context != null) {
                activityLIZIZ = C737910Sx3.LIZIZ(context);
            }
            c549150LgH.getClass();
            C549150LgH.LIZJ(activityLIZIZ);
            return;
        }
        C0MU2.LIZ.getClass();
        IAITheaterCreationLauncher.EnterParams enterParamsLIZ = C0MU2.LIZ(aIGCSocialModel, true, null, true);
        Context context2 = getContext();
        if (context2 != null) {
            C0MU2.LJI(enterParamsLIZ);
            AIGCSocialModel aIGCSocialModel2 = enterParamsLIZ.socialParams;
            if (aIGCSocialModel2 != null) {
                str = aIGCSocialModel2.conversationId;
            }
            C0MU2.LIZJ(1, str, "generate_aitheater_outdate_fail");
            String strLIZ = C1017903yT.LIZ();
            AIGCEntranceInfo aIGCEntranceInfo = enterParamsLIZ.entranceInfo;
            if (aIGCEntranceInfo != null && (aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null)) != null && (interfaceC528960KooJ9 = aITheaterProfileService.j9()) != null) {
                interfaceC528960KooJ9.LIZLLL(strLIZ, aIGCEntranceInfo);
            }
            IAITheaterFeatureService iAITheaterFeatureServiceLIZ2 = C549720LhC.LIZ();
            if (iAITheaterFeatureServiceLIZ2 != null && (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ2.LIZ()) != null) {
                iAITheaterCreationLauncherLIZ.LIZ(enterParamsLIZ, context2, strLIZ, false, null);
            }
        }
    }

    public final void zp(C0MXN c0mxn) {
        boolean z;
        String str;
        String str2;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) != null && interfaceC558600LvWLIZIZ.LJ()) {
            z = true;
        } else {
            z = false;
        }
        String str3 = null;
        Activity activityLIZIZ = null;
        if (!z) {
            C549150LgH c549150LgH = C549150LgH.LIZ;
            Context context = getContext();
            if (context != null) {
                activityLIZIZ = C737910Sx3.LIZIZ(context);
            }
            c549150LgH.getClass();
            C549150LgH.LIZJ(activityLIZIZ);
            return;
        }
        AIGCSocialModel aIGCSocialModel = c0mxn.LLILLL;
        if (aIGCSocialModel != null && (str = aIGCSocialModel.taskId) != null) {
            C546890Lcd.LIZ.getClass();
            AIQuotaService aIQuotaServiceLIZIZ = C546890Lcd.LIZIZ();
            Source source = Source.AI_THEATER;
            aIQuotaServiceLIZIZ.LJFF(source, null);
            if (aIQuotaServiceLIZIZ.LIZ(source)) {
                C0MU2 c0mu2 = C0MU2.LIZ;
                AIGCSocialModel aIGCSocialModel2 = c0mxn.LLILLL;
                c0mu2.getClass();
                IAITheaterCreationLauncher.EnterParams enterParamsLIZ = C0MU2.LIZ(aIGCSocialModel2, false, null, false);
                AIGCSocialModel aIGCSocialModel3 = enterParamsLIZ.socialParams;
                if (aIGCSocialModel3 != null) {
                    str2 = aIGCSocialModel3.conversationId;
                } else {
                    str2 = null;
                }
                C0MU2.LIZJ(1, str2, "generate_aitheater_local_fail");
                AIGCSocialModel aIGCSocialModel4 = enterParamsLIZ.socialParams;
                if (aIGCSocialModel4 != null) {
                    str3 = aIGCSocialModel4.conversationId;
                }
                C0MU2.LIZLLL(1, str3, "generating_aitheater_video");
                Fp();
                C0MXG.LIZLLL(C0MXF.NOT_FAIL.getType(), c0mxn.LL.LIZ.LIZ.getUuid());
                C546890Lcd.LIZ().z1(str);
                Keva keva = C548360Lf0.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("generate_result_mob_");
                sbLIZ.append(str);
                C548360Lf0.LIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                return;
            }
            Bp(C0MXF.QUOTA, c0mxn, null, -1L);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0MXN c0mxn) {
    }

    public final void Ap(C0MXN c0mxn, int i) {
        String str;
        InterfaceC550020Lhg interfaceC550020Lhg;
        AIGCSocialModel aIGCSocialModel = c0mxn.LLILLL;
        if (aIGCSocialModel != null && (str = aIGCSocialModel.taskId) != null && (interfaceC550020Lhg = this.LLJL) != null) {
            Integer numValueOf = Integer.valueOf(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("message_uuid: ");
            sbLIZ.append(c0mxn.LLILII().LIZ.LIZ.getUuid());
            interfaceC550020Lhg.LIZLLL(numValueOf, str, "update_msg_by_local", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0MXK c0mxk;
        C0MXN c0mxn = (C0MXN) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C0MXK) && (c0mxk = (C0MXK) obj2) != null && c0mxk.LIZ) {
                    up(c0mxn);
                }
            }
            return;
        }
        up(c0mxn);
    }

    public final void Bp(C0MXF c0mxf, C0MXN c0mxn, String str, Long l) {
        int iIntValue;
        String str2;
        InterfaceC550750Lir interfaceC550750LirG9;
        boolean z;
        String str3;
        String str4;
        String str5;
        InterfaceC550750Lir interfaceC550750LirG92;
        C786410Ut5.LLZILL((TuxSpinner) this.LLJLIL.getValue(), 8);
        View view = (View) this.LLJLLL.getValue();
        int visibility = view.getVisibility();
        view.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, view);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLJZ.getValue(), 8);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLJZIJLIL.getValue(), 8);
        C786410Ut5.LLLLLLZZ(tp(), 0);
        Activity activityLIZIZ = null;
        String str6 = null;
        tp().setBackground(null);
        C786410Ut5.LLLLLLZZ((TuxIconView) this.LLL.getValue(), 0);
        View view2 = (View) this.LLL.getValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, ((View) this.LLL.getValue()).getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        gradientDrawable.setColor(iIntValue);
        view2.setBackground(gradientDrawable);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLLF.getValue(), 0);
        C786410Ut5.LLLLLLJ(sp(), 0);
        sp().LJJJJL(AFwS239S0000000_8.get$arr$(154));
        sp().setTextColorRes(R.attr.a0o);
        sp().setIconTintColorRes(R.attr.a0o);
        sp().LJJLI(true);
        int i = C0MXH.LIZ[c0mxf.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        AITheaterProfileService aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
                        if (aITheaterProfileService != null && (interfaceC550750LirG92 = aITheaterProfileService.g9()) != null) {
                            interfaceC550750LirG92.LJIILL();
                        }
                        if (op() || C0MXG.LIZ(c0mxn.LLILII().LIZ.LIZ.getUuid()) != C0MXF.NOT_FOUND.getType()) {
                            C0MU2 c0mu2 = C0MU2.LIZ;
                            AIGCSocialModel aIGCSocialModel = c0mxn.LLILLL;
                            if (aIGCSocialModel != null) {
                                str5 = aIGCSocialModel.conversationId;
                            } else {
                                str5 = null;
                            }
                            c0mu2.getClass();
                            C0MU2.LIZLLL(1, str5, "generate_aitheater_outdate_fail");
                        }
                        C0MXG.LIZLLL(C0MXF.NOT_FOUND.getType(), c0mxn.LLILII().LIZ.LIZ.getUuid());
                        ((TextView) this.LLLF.getValue()).setText(C547930LeJ.LIZ(2131826026, new Object[0]));
                        sp().setButtonStartIcon(null);
                        sp().setText(C547930LeJ.LIZ(2131826025, new Object[0]));
                        C786410Ut5.I7(new AkS53S0200000_8(this, c0mxn, 8), sp());
                        C786410Ut5.I7(new AkS53S0200000_8(this, c0mxn, 9), tp());
                        return;
                    }
                    return;
                }
                int iLIZ = C0MXG.LIZ(c0mxn.LLILII().LIZ.LIZ.getUuid());
                C0MXF c0mxf2 = C0MXF.NETWORK;
                if (iLIZ != c0mxf2.getType()) {
                    z = true;
                } else {
                    z = false;
                }
                if (op() || z) {
                    Keva keva = C548360Lf0.LIZ;
                    AIGCSocialModel aIGCSocialModel2 = c0mxn.LLILLL;
                    if (aIGCSocialModel2 != null) {
                        str3 = aIGCSocialModel2.taskId;
                    } else {
                        str3 = null;
                    }
                    if (C548360Lf0.LIZ(str3, null)) {
                        C0MU2 c0mu22 = C0MU2.LIZ;
                        AIGCSocialModel aIGCSocialModel3 = c0mxn.LLILLL;
                        c0mu22.getClass();
                        IAITheaterCreationLauncher.EnterParams enterParamsLIZ = C0MU2.LIZ(aIGCSocialModel3, false, null, false);
                        AIGCSocialModel aIGCSocialModel4 = c0mxn.LLILLL;
                        if (aIGCSocialModel4 != null) {
                            str4 = aIGCSocialModel4.conversationId;
                        } else {
                            str4 = null;
                        }
                        C0MU2.LJII(enterParamsLIZ, str, l, str4);
                    }
                    C0MU2 c0mu23 = C0MU2.LIZ;
                    AIGCSocialModel aIGCSocialModel5 = c0mxn.LLILLL;
                    if (aIGCSocialModel5 != null) {
                        str6 = aIGCSocialModel5.conversationId;
                    }
                    c0mu23.getClass();
                    C0MU2.LIZLLL(1, str6, "generate_aitheater_local_fail");
                }
                C0MXG.LIZLLL(c0mxf2.getType(), c0mxn.LLILII().LIZ.LIZ.getUuid());
                ((TextView) this.LLLF.getValue()).setText(C547930LeJ.LIZ(2131826040, new Object[0]));
                sp().setText(C547930LeJ.LIZ(2131826027, new Object[0]));
                C786410Ut5.I7(new AkS53S0200000_8(this, c0mxn, 6), sp());
                C786410Ut5.I7(new AkS53S0200000_8(this, c0mxn, 7), tp());
                return;
            }
            AITheaterProfileService aITheaterProfileService2 = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
            if (aITheaterProfileService2 != null && (interfaceC550750LirG9 = aITheaterProfileService2.g9()) != null) {
                interfaceC550750LirG9.LJIILL();
            }
            if (op() || (C0MXG.LIZ(c0mxn.LLILII().LIZ.LIZ.getUuid()) != C0MXF.EXPIRED.getType() && C0MXG.LIZ(c0mxn.LLILII().LIZ.LIZ.getUuid()) != C0MXF.NOT_FOUND.getType())) {
                C0MU2 c0mu24 = C0MU2.LIZ;
                AIGCSocialModel aIGCSocialModel6 = c0mxn.LLILLL;
                if (aIGCSocialModel6 != null) {
                    str2 = aIGCSocialModel6.conversationId;
                } else {
                    str2 = null;
                }
                c0mu24.getClass();
                C0MU2.LIZLLL(1, str2, "generate_aitheater_outdate_fail");
            }
            C0MXG.LIZLLL(C0MXF.EXPIRED.getType(), c0mxn.LLILII().LIZ.LIZ.getUuid());
            ((TextView) this.LLLF.getValue()).setText(C547930LeJ.LIZ(2131826026, new Object[0]));
            sp().setButtonStartIcon(null);
            sp().setText(C547930LeJ.LIZ(2131826025, new Object[0]));
            C786410Ut5.I7(new AkS53S0200000_8(this, c0mxn, 4), sp());
            C786410Ut5.I7(new AkS53S0200000_8(this, c0mxn, 5), tp());
            return;
        }
        Context context = getContext();
        if (context != null) {
            activityLIZIZ = C737910Sx3.LIZIZ(context);
        }
        C547930LeJ.LIZIZ(activityLIZIZ, 2131826232, new Object[0]);
    }
}
