package com.ss.android.ugc.aweme.internalshare.impl.refactor.cell;

import X.C01GW;
import X.C06F6;
import X.C06LY;
import X.C0HZQ;
import X.C0P0R;
import X.C0ZE7;
import X.C0ZJ7;
import X.C1196320hEk;
import X.C1362110lY9;
import X.C1362120lYA;
import X.C1362180lYG;
import X.C1362230lYL;
import X.C1362370lYZ;
import X.C1362490lYl;
import X.C1362510lYn;
import X.C1364070lbJ;
import X.C1364080lbK;
import X.C1364090lbL;
import X.C1364100lbM;
import X.C1369870lkf;
import X.C13LP;
import X.C13LQ;
import X.C1428310nGv;
import X.C1527905yX;
import X.C1558520qew;
import X.C1647306ch;
import X.C1954807lC;
import X.C21146717pB;
import X.C279030Awf;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427920GqE;
import X.C429270GsP;
import X.C429290GsR;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C897490ZIt;
import X.EnumC1362480lYk;
import X.EnumC1364050lbH;
import X.EnumC1578206Fw;
import X.InterfaceC1363370laB;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC899120ZPa;
import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IContactActionAbility;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelHeadPowerCell extends AbsSharePanelPowerCell<C1362370lYZ> {
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 633));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 634));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 637));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 632));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 636));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 635));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 631));
    public C0ZE7 LLJIJIL;
    public IDMAvatarLoader LLJILJIL;
    public InterfaceC899120ZPa LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell
    public final boolean I5() {
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cn0;
    }

    public final InterfaceC899120ZPa S5() {
        InterfaceC899120ZPa interfaceC899120ZPaV = this.LLJILJILJ;
        if (interfaceC899120ZPaV == null) {
            Context context = ((View) this.LLILZLL.getValue()).getContext();
            IStreakService.LJJIIZ.getClass();
            interfaceC899120ZPaV = C06LY.LIZ().V(context, EnumC1578206Fw.SHARE_PANEL, new AwS600S0100000_21(this, 139));
            if (interfaceC899120ZPaV == null) {
                return null;
            }
            this.LLJILJILJ = interfaceC899120ZPaV;
        }
        return interfaceC899120ZPaV;
    }

    public final C427920GqE T5() {
        return (C427920GqE) this.LLJI.getValue();
    }

    public final SmartAvatarImageView U5() {
        return (SmartAvatarImageView) this.LLIZ.getValue();
    }

    public final TuxTextView W5() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    public final View X5() {
        return (View) this.LLJ.getValue();
    }

    public final C0HZQ a6() {
        return (C0HZQ) this.LLIZLLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1362120lYA c1362120lYAL5 = L5();
        if (c1362120lYAL5 == null) {
            throw new IllegalStateException("SharePanelConfigSource not bound to VScope");
        }
        C1362110lY9 c1362110lY9 = c1362120lYAL5.LLILLL;
        View view = this.itemView;
        W5().setImportantForAccessibility(2);
        ((View) this.LLILZIL.getValue()).setImportantForAccessibility(2);
        U5().setImportantForAccessibility(2);
        a6().setImportantForAccessibility(2);
        X5().setImportantForAccessibility(2);
        ((View) this.LLILZLL.getValue()).setImportantForAccessibility(2);
        C1428310nGv.LJII(X5(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        W5().setMaxLines(c1362110lY9.LIZLLL);
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        Integer numLJFF = C1369870lkf.LJFF(c1362120lYAL5.LL.extras, "key_sheet_background_color");
        if (numLJFF != null) {
            int iIntValue = numLJFF.intValue();
            View viewX5 = X5();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(iIntValue);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            viewX5.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        C1362230lYL c1362230lYL = c1362110lY9.LJIIIZ;
        if (c1362230lYL != null) {
            view.getLayoutParams().width = c1362230lYL.LJIIJJI;
            SmartAvatarImageView smartAvatarImageViewU5 = U5();
            smartAvatarImageViewU5.getLayoutParams().width = c1362230lYL.LJIIL;
            smartAvatarImageViewU5.getLayoutParams().height = c1362230lYL.LJIIL;
            TuxTextView tuxTextViewW5 = W5();
            C426750GoL.LJIIIZ(tuxTextViewW5, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, false, 29);
            tuxTextViewW5.setTextColor(C1527905yX.LIZ(c1362230lYL.LJIILLIIL));
            Integer num = c1362230lYL.LJIIZILJ;
            if (num != null) {
                tuxTextViewW5.setTuxFont(num.intValue());
            }
            Integer num2 = c1362230lYL.LJIILL;
            if (num2 != null) {
                T5().LIZ(Integer.valueOf(num2.intValue()));
            }
            C427920GqE c427920GqET5 = T5();
            Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))));
            c427920GqET5.getClass();
            if (numValueOf != null) {
                c427920GqET5.LL.setStrokeWidth(numValueOf.intValue());
            }
        } else if (C1647306ch.LIZLLL()) {
            throw new IllegalArgumentException("dynamicConfig is null, contact with @zhumengyu.919");
        }
        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(this, 253);
        C786410Ut5.G9(U5(), new ACListenerS155S0100000_21(awS600S0100000_21, 80));
        C786410Ut5.h9(W5(), new ACListenerS155S0100000_21(awS600S0100000_21, 80));
        C786410Ut5.b9(a6(), new ACListenerS155S0100000_21(awS600S0100000_21, 80));
        C786410Ut5.I7(new ACListenerS155S0100000_21(awS600S0100000_21, 80), this.itemView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        IContactActionAbility iContactActionAbility;
        super.onViewAttachedToWindow();
        C1362370lYZ c1362370lYZ = (C1362370lYZ) getItem();
        if (c1362370lYZ == null || (interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this)) == null || (iContactActionAbility = (IContactActionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IContactActionAbility.class, null)) == null) {
            return;
        }
        iContactActionAbility.Oy1(c1362370lYZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        C06F6 c06f6;
        super.onViewDetachedFromWindow();
        IDMAvatarLoader iDMAvatarLoader = this.LLJILJIL;
        if (iDMAvatarLoader != null) {
            iDMAvatarLoader.LIZ();
        }
        this.LLJILJIL = null;
        InterfaceC899120ZPa interfaceC899120ZPa = this.LLJILJILJ;
        if (interfaceC899120ZPa != null) {
            interfaceC899120ZPa.LIZ();
        }
        InterfaceC899120ZPa interfaceC899120ZPa2 = this.LLJILJILJ;
        if ((interfaceC899120ZPa2 instanceof C06F6) && (c06f6 = (C06F6) interfaceC899120ZPa2) != null) {
            IStreakService.LJJIIZ.getClass();
            C06LY.LIZ().J(c06f6);
        }
        this.LLJILJILJ = null;
        if (((Boolean) C279030Awf.LIZ.getValue()).booleanValue()) {
            this.LLJIJIL = null;
        }
    }

    public final SpannableStringBuilder V5(String str) {
        Map<String, SpannableStringBuilder> map = C1364090lbL.LIZ;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) ((LinkedHashMap) map).get(str);
        if (spannableStringBuilder == null) {
            SpannableStringBuilder spannableStringBuilderLIZ = C0P0R.LIZ(new SpannableStringBuilder(C1364100lbM.LIZ(str)), W5().getPaint(), this.itemView.getLayoutParams().width, W5().getMaxLines());
            map.put(str, spannableStringBuilderLIZ);
            return spannableStringBuilderLIZ;
        }
        return spannableStringBuilder;
    }

    public final void b6(boolean z) {
        if (z) {
            W5().setMaxLines(1);
            C786410Ut5.LLLLZLL((TuxTextView) this.LLILZIL.getValue(), 8);
        } else {
            W5().setMaxLines(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103 A[PHI: r0
      0x0103: PHI (r0v46 com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader) = 
      (r0v45 com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader)
      (r0v51 com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader)
     binds: [B:30:0x00ee, B:32:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c0 A[PHI: r0
      0x01c0: PHI (r0v11 com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader) = 
      (r0v10 com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader)
      (r0v17 com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader)
     binds: [B:58:0x01ab, B:60:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r14) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelHeadPowerCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.cn0, viewGroup, false);
    }

    public final void R5(String str, String str2) {
        Object obj;
        Bundle bundle;
        C1362120lYA c1362120lYAL5 = L5();
        if (c1362120lYAL5 == null) {
            return;
        }
        String[] strArr = {"long_press", "publish_then_share"};
        SharePackage sharePackage = c1362120lYAL5.LL;
        String str3 = null;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            try {
                obj = bundle.get("enter_method");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (C13LQ.LJJIJIIJI(obj, strArr) >= 0) {
            SharePackage sharePackage2 = c1362120lYAL5.LL;
            if (sharePackage2 != null) {
                str3 = sharePackage2.itemType;
            }
            if (!Intrinsics.LJFF(str3, "repost")) {
                return;
            }
        }
        if (str2 != null) {
            InterfaceC899120ZPa interfaceC899120ZPaS5 = S5();
            if (interfaceC899120ZPaS5 != null) {
                interfaceC899120ZPaS5.LIZLLL(2, str2, new C1364070lbJ(this), true);
                return;
            }
            return;
        }
        if (str != null) {
            InterfaceC899120ZPa interfaceC899120ZPaS52 = S5();
            if (interfaceC899120ZPaS52 == null) {
                return;
            }
            interfaceC899120ZPaS52.LIZIZ(2, str, new C1364080lbK(this), true);
            return;
        }
        InterfaceC899120ZPa interfaceC899120ZPaS53 = S5();
        if (interfaceC899120ZPaS53 == null) {
            return;
        }
        interfaceC899120ZPaS53.LIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        Integer num;
        C1362370lYZ c1362370lYZ = (C1362370lYZ) interfaceC1891350zJl;
        if (!list.isEmpty()) {
            Object objLJJJLL = C13LP.LJJJLL(list);
            if ((objLJJJLL instanceof Integer) && (num = (Integer) objLJJJLL) != null && (num.intValue() & 1) != 0) {
                P5(c1362370lYZ.LLIZ, c1362370lYZ.LL, c1362370lYZ.LLILZLL);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P5(C1362180lYG c1362180lYG, IMContact iMContact, C429270GsP c429270GsP) {
        boolean z;
        InterfaceC1363370laB interfaceC1363370laB;
        InterfaceC1363370laB interfaceC1363370laB2;
        C1362110lY9 c1362110lY9;
        View viewFindViewById;
        View viewFindViewById2;
        C429270GsP c429270GsP2;
        int i = C1362490lYl.LIZ[c1362180lYG.LIZ.ordinal()];
        C0ZE7 activityStatusParams = null;
        boolean z2 = false;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C786410Ut5.LJLLLLLL(0, T5());
                    C427920GqE c427920GqET5 = T5();
                    C1362370lYZ c1362370lYZ = (C1362370lYZ) getItem();
                    if (c1362370lYZ != null) {
                        c429270GsP2 = c1362370lYZ.LLILZLL;
                    } else {
                        c429270GsP2 = null;
                    }
                    c427920GqET5.setActivityStatus(c429270GsP2);
                    C786410Ut5.LJLLLLLL(8, a6());
                    C786410Ut5.LJLLLLLL(8, X5());
                } else {
                    throw new C1954807lC();
                }
            } else {
                C786410Ut5.LJLLLLLL(8, T5());
                C786410Ut5.LJLLLLLL(0, a6());
                a6().setSelected(true);
                a6().setChecked(true);
                C786410Ut5.LJLLLLLL(0, X5());
            }
        } else {
            C786410Ut5.LJLLLLLL(8, T5());
            C786410Ut5.LJLLLLLL(8, a6());
            C786410Ut5.LJLLLLLL(8, X5());
        }
        C1362510lYn c1362510lYn = c1362180lYG.LIZIZ;
        if (c1362180lYG.LIZ == EnumC1362480lYk.SELECTED) {
            z = true;
        } else {
            z = false;
        }
        C1362120lYA c1362120lYAL5 = L5();
        if (c1362120lYAL5 != null && (c1362110lY9 = c1362120lYAL5.LLILLL) != null) {
            float f = 0.34f;
            if (c1362510lYn.LIZ && c1362110lY9.LJFF == EnumC1364050lbH.MASK_WITH_CHECK_MARK) {
                if (z) {
                    viewFindViewById2 = U5();
                } else {
                    viewFindViewById2 = this.itemView.findViewById(R.id.bi2);
                }
                if (viewFindViewById2 != null) {
                    C786410Ut5.T4(viewFindViewById2, 0.34f);
                }
            } else {
                C786410Ut5.J5(U5(), 1.0f);
                View view = this.itemView;
                if (view != null && (viewFindViewById = view.findViewById(R.id.bi2)) != null) {
                    C786410Ut5.T4(viewFindViewById, 1.0f);
                }
            }
            TuxTextView tuxTextViewW5 = W5();
            if (!c1362510lYn.LIZIZ) {
                f = 1.0f;
            }
            C786410Ut5.B5(tuxTextViewW5, f);
        }
        if (c429270GsP != null && C429290GsR.LIZ(c429270GsP)) {
            z2 = true;
        }
        if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            iMUser.setActive(z2);
            C0ZJ7.LIZIZ(this.itemView, iMUser.getUid(), Boolean.valueOf(z2));
            C0ZE7 c0ze7 = this.LLJIJIL;
            if (c0ze7 == null) {
                C1362120lYA c1362120lYAL52 = L5();
                if (c1362120lYAL52 != null && (interfaceC1363370laB2 = c1362120lYAL52.LLILZ) != null) {
                    activityStatusParams = interfaceC1363370laB2.getActivityStatusParams();
                }
            } else {
                activityStatusParams = c0ze7;
            }
            C897490ZIt.LIZJ(this, iMContact, activityStatusParams);
            return;
        }
        if (!(iMContact instanceof IMConversation)) {
            return;
        }
        ((IMConversation) iMContact).setActive(z2);
        C0ZE7 c0ze72 = this.LLJIJIL;
        if (c0ze72 == null) {
            C1362120lYA c1362120lYAL53 = L5();
            if (c1362120lYAL53 != null && (interfaceC1363370laB = c1362120lYAL53.LLILZ) != null) {
                activityStatusParams = interfaceC1363370laB.getActivityStatusParams();
            }
        } else {
            activityStatusParams = c0ze72;
        }
        C897490ZIt.LIZJ(this, iMContact, activityStatusParams);
    }
}
