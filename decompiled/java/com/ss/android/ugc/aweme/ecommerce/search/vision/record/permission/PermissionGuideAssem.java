package com.ss.android.ugc.aweme.ecommerce.search.vision.record.permission;

import X.C01D1;
import X.C0QSJ;
import X.C1308910kAL;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C285810BId;
import X.C337180DJs;
import X.C418440Gaw;
import X.C426750GoL;
import X.C673150Qan;
import X.C675940QfI;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.ECSearchPhotoSearchShootingPageOptConfigs;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoScope;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.IEcPreviewViewAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility;
import com.zhiliaoapp.musically.R;
import g1c.AjS73S0100000_33;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AFwS327S0000000_2;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes34.dex */
public final class PermissionGuideAssem extends UISlotAssem implements C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public C197039127h LLJJIJI;
    public C197039127h LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public IEcQRCodeScanAbility LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PermissionGuideAssem.class, "permissionVM", "getPermissionVM()Lcom/ss/android/ugc/aweme/ecommerce/search/vision/record/permission/EcPermissionVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PermissionGuideAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcPermissionVM.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 348), AFwS279S0000000_33.get$arr$(99), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bro;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == IEcQRCodeScanAbility.class) {
            this.LLJJJ = (IEcQRCodeScanAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{EcTakePhotoScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == IEcQRCodeScanAbility.class) {
            return this.LLJJJ;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EcTakePhotoScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EcTakePhotoScope.class);
        return arrayList;
    }

    public final void lp() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.zf) : null;
            this.LLJJIJIIJIL = (C197039127h) viewFindViewById;
        }
        C786410Ut5.I7(new AjS73S0100000_33(this, 2), viewFindViewById);
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.1A2C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1A2G) obj).LL);
            }
        }, null, AFwS321S0000000_33.get$arr$(1), 6);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == IEcQRCodeScanAbility.class) {
            this.LLJJJ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final C197039127h hp() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ze) : null;
            this.LLJJIJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxTextView ip() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.q9n) : null;
            this.LLJJIII = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView kp() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.q9o) : null;
            this.LLJJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int currentTextColor;
        super.onViewCreated(view);
        View viewFindViewById = null;
        IEcPreviewViewAbility iEcPreviewViewAbility = (IEcPreviewViewAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IEcPreviewViewAbility.class, null);
        if (iEcPreviewViewAbility != null && iEcPreviewViewAbility.Vp1()) {
            C337180DJs.LIZ(hp());
            C337180DJs.LIZ(kp());
            TuxTextView tuxTextViewIp = ip();
            if (tuxTextViewIp != null) {
                tuxTextViewIp.setText(tuxTextViewIp.getContext().getString(2131858278));
                C337180DJs.LIZJ(tuxTextViewIp);
                C426750GoL.LJIIIZ(tuxTextViewIp, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), null, false, 26);
                tuxTextViewIp.setTuxFont(23);
                tuxTextViewIp.setEllipsize(null);
                Integer numLIZ = C1308910kAL.LIZ(R.attr.ef, tuxTextViewIp.getContext());
                if (numLIZ != null) {
                    currentTextColor = numLIZ.intValue();
                } else {
                    currentTextColor = tuxTextViewIp.getCurrentTextColor();
                }
                tuxTextViewIp.setTextColor(currentTextColor);
                tuxTextViewIp.setMaxLines(Integer.MAX_VALUE);
                tuxTextViewIp.setMaxWidth(Integer.MAX_VALUE);
                tuxTextViewIp.setMaxHeight(Integer.MAX_VALUE);
                ViewGroup.LayoutParams layoutParams = tuxTextViewIp.getLayoutParams();
                tuxTextViewIp.getLayoutParams().width = -1;
                C786410Ut5.R6(tuxTextViewIp, layoutParams);
            }
            lp();
            return;
        }
        if (ECSearchPhotoSearchShootingPageOptConfigs.LIZIZ()) {
            if (!C285810BId.LIZ() && !((ECSearchPhotoSearchShootingPageOptConfigs.ShootingPageOptConfig) ECSearchPhotoSearchShootingPageOptConfigs.LIZIZ.getValue()).showBottomText) {
                C337180DJs.LIZ(hp());
                C337180DJs.LIZJ(kp());
                C337180DJs.LIZJ(ip());
                lp();
                return;
            }
            C337180DJs.LIZ(kp());
            C337180DJs.LIZ(ip());
            C337180DJs.LIZ(hp());
            lp();
            return;
        }
        C675940QfI.LIZJ("rd_photo_search_button_show", null, AFwS279S0000000_33.get$arr$(266));
        C675940QfI.LIZJ("rd_photo_search_button_show", null, AFwS279S0000000_33.get$arr$(267));
        View view2 = this.LLJJIJIIJIL;
        if (view2 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.zf);
            }
            this.LLJJIJIIJIL = (C197039127h) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.I7(new AjS73S0100000_33(this, 5), view2);
        C786410Ut5.I7(new AjS73S0100000_33(this, 6), hp());
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.1A2H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1A2G) obj).LLILLJJLI);
            }
        }, new C2217381BqS() { // from class: X.1A2E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1A2G) obj).LLILLL);
            }
        }, null, AFwS327S0000000_2.get$arr$(1), 12);
    }
}
