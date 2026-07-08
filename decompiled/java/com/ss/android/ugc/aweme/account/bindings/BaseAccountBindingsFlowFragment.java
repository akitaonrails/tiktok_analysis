package com.ss.android.ugc.aweme.account.bindings;

import X.C0XQ5;
import X.C1247510iZJ;
import X.C1390850mIV;
import X.C13LP;
import X.C1697810uHb;
import X.C20345114jB;
import X.C20345214jC;
import X.C20345314jD;
import X.C2188811AlT;
import X.C852810Xct;
import X.C854460XfY;
import X.C854500Xfc;
import X.EnumC20520082c;
import X.EnumC20521082d;
import X.EnumC20522082e;
import X.EnumC852660Xce;
import X.EnumC854390XfR;
import X.EnumC854420XfU;
import X.EnumC854430XfV;
import X.EnumC854440XfW;
import X.EnumC854480Xfa;
import X.InterfaceC20345414jE;
import X.InterfaceC853790XeT;
import X.InterfaceC853800XeU;
import Y.ACListenerS148S0100000_13;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationShowEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationTypingEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.VerificationListShowEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.AccountFlowFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public abstract class BaseAccountBindingsFlowFragment extends BaseI18nLoginFragment {
    public final User LLLIILIL = C0XQ5.LIZJ();

    public final boolean QS() {
        List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(EnumC852660Xce.UNBIND_EMAIL.getValue()), Integer.valueOf(EnumC852660Xce.UNBIND_PHONE.getValue()), Integer.valueOf(EnumC852660Xce.MODIFY_PHONE.getValue()), Integer.valueOf(EnumC852660Xce.CHANGE_EMAIL.getValue()));
        Bundle arguments = getArguments();
        return C13LP.LJJJJ(arguments != null ? Integer.valueOf(arguments.getInt("current_scene")) : null, listLJIIJJI);
    }

    public final VerificationMethodType NS() {
        InterfaceC853800XeU interfaceC853800XeU;
        T value = ((AccountFlowFragmentViewModel) this.LLILLJJLI.getValue()).LLILLJJLI.getValue();
        if (!(value instanceof InterfaceC853800XeU) || (interfaceC853800XeU = (InterfaceC853800XeU) value) == null) {
            return null;
        }
        return interfaceC853800XeU.LIZJ();
    }

    public final void VS() {
        IdentityVerificationShowEvent identityVerificationShowEvent = new IdentityVerificationShowEvent();
        identityVerificationShowEvent.LJI(getEnterFrom(), "enter_from");
        identityVerificationShowEvent.LJI(getEnterMethod(), "enter_method");
        C854460XfY c854460XfY = C854460XfY.LIZ;
        VerificationMethodType verificationMethodTypeNS = NS();
        c854460XfY.getClass();
        identityVerificationShowEvent.LJI((C854460XfY.LJIILL(this, verificationMethodTypeNS) ? EnumC854420XfU.SMS : C854460XfY.LJIILJJIL(this, NS()) ? EnumC854420XfU.EMAIL : EnumC854420XfU.PASSWORD).getValue(), "verification_method");
        C852810Xct.LIZ.getClass();
        identityVerificationShowEvent.LJI(C852810Xct.LJFF(this), "page");
        identityVerificationShowEvent.LJIIIIZZ();
    }

    public final void YS() {
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJII(2131827412);
        ArrayList arrayList = new ArrayList();
        C854460XfY c854460XfY = C854460XfY.LIZ;
        VerificationMethodType verificationMethodTypeNS = NS();
        c854460XfY.getClass();
        for (VerificationMethodType verificationMethodType : (ArrayList) C854460XfY.LJFF(this, verificationMethodTypeNS)) {
            int i = C854500Xfc.LIZ[verificationMethodType.ordinal()];
            if (i == 1) {
                C1247510iZJ c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(2131827411);
                c1247510iZJ.LJ = new ACListenerS148S0100000_13(this, 10);
                arrayList.add(c1247510iZJ);
            } else if (i == 2) {
                C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
                c1247510iZJ2.LIZIZ(2131827410);
                c1247510iZJ2.LJ = new ACListenerS148S0100000_13(this, 9);
                arrayList.add(c1247510iZJ2);
            } else {
                if (i != 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown verification type of ");
                    sbLIZ.append(verificationMethodType);
                    sbLIZ.append(" type");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
                c1247510iZJ3.LIZIZ(2131827409);
                c1247510iZJ3.LJ = new ACListenerS148S0100000_13(this, 8);
                arrayList.add(c1247510iZJ3);
            }
        }
        C1247510iZJ[] c1247510iZJArr = (C1247510iZJ[]) arrayList.toArray(new C1247510iZJ[0]);
        c1390850mIV.LIZIZ((C1247510iZJ[]) Arrays.copyOf(c1247510iZJArr, c1247510iZJArr.length));
        c1390850mIV.LIZJ().show(getChildFragmentManager(), "ChangeMethodSheet");
        C854460XfY c854460XfY2 = C854460XfY.LIZ;
        VerificationMethodType verificationMethodTypeNS2 = NS();
        c854460XfY2.getClass();
        List listLJFF = C854460XfY.LJFF(this, verificationMethodTypeNS2);
        VerificationListShowEvent verificationListShowEvent = new VerificationListShowEvent();
        verificationListShowEvent.LJI(getEnterFrom(), "enter_from");
        verificationListShowEvent.LJI(getEnterMethod(), "enter_method");
        C852810Xct.LIZ.getClass();
        verificationListShowEvent.LJI(C852810Xct.LJFF(this), "page");
        verificationListShowEvent.LJI((C854460XfY.LJIILL(this, NS()) ? EnumC854480Xfa.SMS : C854460XfY.LJIILJJIL(this, NS()) ? EnumC854480Xfa.EMAIL : EnumC854480Xfa.PASSWORD).getValue(), "verification_method");
        ArrayList arrayList2 = (ArrayList) listLJFF;
        verificationListShowEvent.LJI((arrayList2.contains(VerificationMethodType.EMAIL) ? EnumC20520082c.TRUE : EnumC20520082c.FALSE).getValue(), "is_email_show");
        verificationListShowEvent.LJI((arrayList2.contains(VerificationMethodType.PASSWORD) ? EnumC20521082d.TRUE : EnumC20521082d.FALSE).getValue(), "is_pw_show");
        verificationListShowEvent.LJI((arrayList2.contains(VerificationMethodType.MOBILE) ? EnumC20522082e.TRUE : EnumC20522082e.FALSE).getValue(), "is_sms_show");
        verificationListShowEvent.LJIIIIZZ();
    }

    public final int PS() {
        int i = C854500Xfc.LIZIZ[SR().ordinal()];
        if (i == 1 || i == 2) {
            return 25;
        }
        return i != 3 ? 6 : 26;
    }

    /* JADX INFO: loaded from: classes32.dex */
    public static abstract class BindingActions implements InterfaceC853790XeT<InterfaceC20345414jE> {
        public static final int $stable = 8;
        public final InterfaceC20345414jE params;

        public abstract BaseAccountFlowFragment getFragment();

        public static final class ClickMobileAction extends BindingActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C20345214jC params;

            public final ClickMobileAction copy(C20345214jC c20345214jC, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new ClickMobileAction(c20345214jC, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickMobileAction)) {
                    return false;
                }
                ClickMobileAction clickMobileAction = (ClickMobileAction) obj;
                return Intrinsics.LJFF(this.params, clickMobileAction.params) && Intrinsics.LJFF(this.fragment, clickMobileAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickMobileAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment.BindingActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment.BindingActions
            /* JADX INFO: renamed from: getParams */
            public C20345214jC mo150getParams() {
                return this.params;
            }

            public ClickMobileAction(C20345214jC c20345214jC, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c20345214jC);
                this.params = c20345214jC;
                this.fragment = baseAccountFlowFragment;
            }
        }

        public static final class ClickPasswordAction extends BindingActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C20345114jB params;

            public final ClickPasswordAction copy(C20345114jB c20345114jB, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new ClickPasswordAction(c20345114jB, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickPasswordAction)) {
                    return false;
                }
                ClickPasswordAction clickPasswordAction = (ClickPasswordAction) obj;
                return Intrinsics.LJFF(this.params, clickPasswordAction.params) && Intrinsics.LJFF(this.fragment, clickPasswordAction.fragment);
            }

            public int hashCode() {
                return (hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickPasswordAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment.BindingActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment.BindingActions
            /* JADX INFO: renamed from: getParams */
            public C20345114jB mo150getParams() {
                return this.params;
            }

            public ClickPasswordAction(C20345114jB c20345114jB, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c20345114jB);
                this.params = c20345114jB;
                this.fragment = baseAccountFlowFragment;
            }
        }

        /* JADX INFO: loaded from: classes14.dex */
        public static final class ClickEmailAction extends BindingActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C20345314jD params;

            public final ClickEmailAction copy(C20345314jD c20345314jD, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new ClickEmailAction(c20345314jD, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickEmailAction)) {
                    return false;
                }
                ClickEmailAction clickEmailAction = (ClickEmailAction) obj;
                return Intrinsics.LJFF(this.params, clickEmailAction.params) && Intrinsics.LJFF(this.fragment, clickEmailAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickEmailAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment.BindingActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment.BindingActions
            /* JADX INFO: renamed from: getParams, reason: merged with bridge method [inline-methods] */
            public C20345314jD mo150getParams() {
                return this.params;
            }

            public ClickEmailAction(C20345314jD c20345314jD, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c20345314jD);
                this.params = c20345314jD;
                this.fragment = baseAccountFlowFragment;
            }
        }

        @Override // 
        /* JADX INFO: renamed from: getParams */
        public InterfaceC20345414jE mo150getParams() {
            return this.params;
        }

        public BindingActions(InterfaceC20345414jE interfaceC20345414jE) {
            this.params = interfaceC20345414jE;
        }
    }

    public final void XS(EnumC854430XfV enumC854430XfV) {
        IdentityVerificationTypingEvent identityVerificationTypingEvent = new IdentityVerificationTypingEvent();
        identityVerificationTypingEvent.LJI(getEnterFrom(), "enter_from");
        identityVerificationTypingEvent.LJI(getEnterMethod(), "enter_method");
        identityVerificationTypingEvent.LJI(enumC854430XfV.getValue(), "verification_method");
        C852810Xct.LIZ.getClass();
        identityVerificationTypingEvent.LJI(C852810Xct.LJFF(this), "page");
        identityVerificationTypingEvent.LJIIIIZZ();
    }

    public final void RS(int i, boolean z) {
        EnumC854440XfW enumC854440XfW;
        EnumC854390XfR enumC854390XfR;
        IdentityVerificationResultEvent identityVerificationResultEvent = new IdentityVerificationResultEvent();
        identityVerificationResultEvent.LJI(getEnterFrom(), "enter_from");
        identityVerificationResultEvent.LJI(getEnterMethod(), "enter_method");
        if (z) {
            enumC854440XfW = EnumC854440XfW.DIGITAL_1;
        } else {
            enumC854440XfW = EnumC854440XfW.DIGITAL_0;
        }
        identityVerificationResultEvent.LJI(Integer.valueOf(enumC854440XfW.getValue()), "is_success");
        C854460XfY c854460XfY = C854460XfY.LIZ;
        VerificationMethodType verificationMethodTypeNS = NS();
        c854460XfY.getClass();
        if (C854460XfY.LJIILL(this, verificationMethodTypeNS)) {
            enumC854390XfR = EnumC854390XfR.SMS;
        } else if (C854460XfY.LJIILJJIL(this, NS())) {
            enumC854390XfR = EnumC854390XfR.EMAIL;
        } else {
            enumC854390XfR = EnumC854390XfR.PASSWORD;
        }
        identityVerificationResultEvent.LJI(enumC854390XfR.getValue(), "verification_method");
        C852810Xct.LIZ.getClass();
        identityVerificationResultEvent.LJI(C852810Xct.LJFF(this), "page");
        identityVerificationResultEvent.LJI(String.valueOf(i), "error_code");
        identityVerificationResultEvent.LJIIIIZZ();
    }
}
