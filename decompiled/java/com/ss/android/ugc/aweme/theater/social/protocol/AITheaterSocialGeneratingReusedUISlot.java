package com.ss.android.ugc.aweme.theater.social.protocol;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C0I6Y;
import X.C0MXK;
import X.C0MXT;
import X.C0MXX;
import X.C0MXY;
import X.C0ZHB;
import X.C1308910kAL;
import X.C13LE;
import X.C1602160rnK;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C1AF0;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C461530I7z;
import X.C549150LgH;
import X.C549720LhC;
import X.C554730LpH;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC550020Lhg;
import X.InterfaceC558600LvW;
import X.InterfaceC712990Rxx;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.vm.SkeletonLayoutCellFragmentScopeViewModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard;
import com.ss.android.ugc.tools.chat.data.TaskInfo;
import com.ss.android.ugc.tools.chat.data.TaskProgress;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterSocialGeneratingReusedUISlot extends ReusedUISlotAssem<AITheaterSocialGeneratingReusedUISlot> implements InterfaceC712990Rxx<C0MXT> {
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
        C2217381BqS c2217381BqS = new C2217381BqS(AITheaterSocialGeneratingReusedUISlot.class, "skeletonLayoutCellFragmentScopeViewModel", "getSkeletonLayoutCellFragmentScopeViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/messagelist/skeleton/vm/SkeletonLayoutCellFragmentScopeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AITheaterSocialGeneratingReusedUISlot() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkeletonLayoutCellFragmentScopeViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS552S0100000_8(c19719912DlLIZ, 469), null, AFwS239S0000000_8.get$arr$(157));
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        this.LLJL = iAITheaterFeatureServiceLIZ != null ? iAITheaterFeatureServiceLIZ.LJIIIZ() : null;
        this.LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 468));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 467));
        this.LLJLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 461));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 460));
        this.LLJLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 459));
        this.LLJZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 465));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 464));
        this.LLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 462));
        this.LLLF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 463));
        this.LLLFF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 466));
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
            sbLIZ.append("AITheaterSocialGeneratingReusedUISlot: ");
            sbLIZ.append(getParent());
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void Ep() {
        Integer numLIZJ;
        C786410Ut5.LLZILL((TuxSpinner) this.LLJLIL.getValue(), 0);
        TuxSpinner tuxSpinner = (TuxSpinner) this.LLJLIL.getValue();
        Context context = getContext();
        tuxSpinner.LIZ(R.raw.icon_spinner_thin, (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, context)) == null) ? 0 : numLIZJ.intValue());
        C0MXY c0mxySp = sp();
        int visibility = c0mxySp.getVisibility();
        c0mxySp.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c0mxySp);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLJZ.getValue(), 0);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLJZIJLIL.getValue(), 0);
        C786410Ut5.LLLLLLZZ((TuxIconView) this.LLL.getValue(), 8);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLLF.getValue(), 8);
        C786410Ut5.LLLLLLJ(tp(), 8);
        C786410Ut5.U8(tp(), null);
        C786410Ut5.LLLLLLZZ(up(), 8);
        C786410Ut5.a9(up(), null);
        up().setBackground(null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        AnonymousClass0956 anonymousClass0956 = this.LLLFFI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLFFI = null;
        sp().setConfig(new C0MXX());
        sp().LIZIZ();
        Ep();
    }

    public final C0MXY sp() {
        return (C0MXY) this.LLJLLL.getValue();
    }

    public final C197039127h tp() {
        return (C197039127h) this.LLLFF.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        AnonymousClass0956 anonymousClass0956 = this.LLLFFI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLFFI = null;
        sp().setConfig(new C0MXX());
        sp().LIZIZ();
        Ep();
    }

    public final TuxIconView up() {
        return (TuxIconView) this.LLJLILLLLZIIL.getValue();
    }

    public final void Bp(C0MXT c0mxt) {
        int iIntValue;
        TaskInfo taskInfo;
        String str;
        InterfaceC550020Lhg interfaceC550020Lhg;
        TaskInfo taskInfo2;
        TaskProgress taskProgress;
        Integer num;
        TaskInfo taskInfo3;
        Integer num2;
        IcAigcCommonMessageCard icAigcCommonMessageCardLJJIII = c0mxt.LJJIII();
        int iIntValue2 = -1;
        if (icAigcCommonMessageCardLJJIII != null && (taskInfo3 = icAigcCommonMessageCardLJJIII.taskInfo) != null && (num2 = taskInfo3.status) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = -1;
        }
        IcAigcCommonMessageCard icAigcCommonMessageCardLJJIII2 = c0mxt.LJJIII();
        if (icAigcCommonMessageCardLJJIII2 != null && (taskInfo2 = icAigcCommonMessageCardLJJIII2.taskInfo) != null && (taskProgress = taskInfo2.progress) != null && (num = taskProgress.stage) != null) {
            iIntValue2 = num.intValue();
        }
        IcAigcCommonMessageCard icAigcCommonMessageCardLJJIII3 = c0mxt.LJJIII();
        if (icAigcCommonMessageCardLJJIII3 != null && (taskInfo = icAigcCommonMessageCardLJJIII3.taskInfo) != null && (str = taskInfo.taskId) != null && (interfaceC550020Lhg = this.LLJL) != null) {
            interfaceC550020Lhg.LIZ(str, C2097608Jq.LJIIJ(new Pair("msg_scene", "real_message_update"), new Pair("message_uuid", c0mxt.LLILII().LIZ.LIZ.getUuid()), new Pair("task_status", String.valueOf(iIntValue)), new Pair("stage", String.valueOf(iIntValue2))));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        view.setTag(R.id.k__, C0ZHB.FIRST_ITEM_FILL_TOP);
        C554730LpH.LIZJ(C786410Ut5.ne(new ContextThemeWrapper(((View) this.LLJLL.getValue()).getContext(), R.style.y0)), R.layout.nk, (ViewGroup) this.LLJLL.getValue(), true);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0MXT c0mxt) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06ec A[PHI: r0 r8
      0x06ec: PHI (r0v70 java.util.ArrayList) = (r0v55 java.util.ArrayList), (r0v55 java.util.ArrayList), (r0v71 java.util.ArrayList) binds: [B:218:0x0706, B:220:0x070a, B:206:0x06e9] A[DONT_GENERATE, DONT_INLINE]
      0x06ec: PHI (r8v15 java.lang.String) = (r8v11 java.lang.String), (r8v11 java.lang.String), (r8v16 java.lang.String) binds: [B:218:0x0706, B:220:0x070a, B:206:0x06e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06f0 A[PHI: r7 r8
      0x06f0: PHI (r7v21 java.lang.String) = 
      (r7v19 java.lang.String)
      (r7v19 java.lang.String)
      (r7v19 java.lang.String)
      (r7v19 java.lang.String)
      (r7v19 java.lang.String)
      (r7v22 java.lang.String)
     binds: [B:223:0x0714, B:225:0x0718, B:227:0x071c, B:229:0x0720, B:231:0x0724, B:209:0x06ed] A[DONT_GENERATE, DONT_INLINE]
      0x06f0: PHI (r8v14 java.lang.String) = 
      (r8v12 java.lang.String)
      (r8v12 java.lang.String)
      (r8v12 java.lang.String)
      (r8v12 java.lang.String)
      (r8v12 java.lang.String)
      (r8v15 java.lang.String)
     binds: [B:223:0x0714, B:225:0x0718, B:227:0x071c, B:229:0x0720, B:231:0x0724, B:209:0x06ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Iterable, java.util.List] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: yp, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C0MXT r56) {
        /*
            Method dump skipped, instruction units count: 2153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingReusedUISlot.up(X.0MXT):void");
    }

    public final void zp(IAITheaterCreationLauncher.EnterParams enterParams) {
        Activity activityLIZIZ;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ;
        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ2 = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ2 != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ2.LIZIZ()) != null && interfaceC558600LvWLIZIZ.LJ()) {
            Context context = getContext();
            if (context != null && (iAITheaterFeatureServiceLIZ = C549720LhC.LIZ()) != null && (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ.LIZ()) != null) {
                iAITheaterCreationLauncherLIZ.LJFF(enterParams, context, false);
                return;
            }
            return;
        }
        C549150LgH c549150LgH = C549150LgH.LIZ;
        Context context2 = getContext();
        if (context2 != null) {
            activityLIZIZ = C737910Sx3.LIZIZ(context2);
        } else {
            activityLIZIZ = null;
        }
        c549150LgH.getClass();
        C549150LgH.LIZJ(activityLIZIZ);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0MXT c0mxt) {
    }

    public final void Ap(C0MXT c0mxt, Integer num) {
        int iIntValue;
        TaskInfo taskInfo;
        String str;
        InterfaceC550020Lhg interfaceC550020Lhg;
        TaskInfo taskInfo2;
        TaskProgress taskProgress;
        Integer num2;
        IcAigcCommonMessageCard icAigcCommonMessageCardLJJIII = c0mxt.LJJIII();
        if (icAigcCommonMessageCardLJJIII != null && (taskInfo2 = icAigcCommonMessageCardLJJIII.taskInfo) != null && (taskProgress = taskInfo2.progress) != null && (num2 = taskProgress.stage) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = -1;
        }
        IcAigcCommonMessageCard icAigcCommonMessageCardLJJIII2 = c0mxt.LJJIII();
        if (icAigcCommonMessageCardLJJIII2 != null && (taskInfo = icAigcCommonMessageCardLJJIII2.taskInfo) != null && (str = taskInfo.taskId) != null && (interfaceC550020Lhg = this.LLJL) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("message_uuid: ");
            sbLIZ.append(c0mxt.LLILII().LIZ.LIZ.getUuid());
            sbLIZ.append(" stage: ");
            sbLIZ.append(iIntValue);
            interfaceC550020Lhg.LIZLLL(num, str, "real_message_fail", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0MXK c0mxk;
        C0MXT c0mxt = (C0MXT) interfaceC1587906Jp;
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
                    up(c0mxt);
                    Bp(c0mxt);
                }
            }
            return;
        }
        up(c0mxt);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fp(X.C0MXF r12, com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel r13, java.lang.String r14, java.lang.Long r15) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingReusedUISlot.Fp(X.0MXF, com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel, java.lang.String, java.lang.Long):void");
    }
}
