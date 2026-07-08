package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.AnonymousClass0487;
import X.C01GW;
import X.C0DHG;
import X.C0I7D;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1743750vTh;
import X.C1744700vVE;
import X.C1745300vWC;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1746880vYk;
import X.C1748260vay;
import X.C1748720vbi;
import X.C197039127h;
import X.C19719212De;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C632670Orh;
import X.C786410Ut5;
import X.C927503jt;
import X.C985403tE;
import X.C992303uL;
import X.InterfaceC998610c5r;
import Y.ACListenerS160S0100000_26;
import Y.ARunnableS126S0100000_26;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import eha.a0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS206S1100000_33;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressPasteViewHolder extends BaseViewHolder implements InterfaceC998610c5r {
    public final AddressEditFragment LLJILJILJ;
    public final C01GW LLJILLL;
    public a0 LLJJ;
    public C1748260vay LLJJI;
    public C197039127h LLJJIII;
    public C197039127h LLJJIJI;
    public View LLJJIJIIJIL;
    public C197039127h LLJJIJIL;
    public boolean LLJJJ;
    public final int LLJJJIL;
    public final Map<String, Boolean> LLJJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void q6() {
        String strLIZJ;
        this.LLJJJ = true;
        Context context = this.itemView.getContext();
        if (context == null || (strLIZJ = C1746880vYk.LIZJ(context)) == null || strLIZJ.length() <= 0) {
            return;
        }
        if (!C0DHG.LIZ() || C1388190mED.LIZ(context) == null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131847065);
            C985403tE.LIZ(c1397580mTM, new AwS140S1100000_26(this, strLIZJ, 9));
            c1397580mTM.LJII = true;
            new C1397510mTF(c1397580mTM).LIZLLL();
        } else {
            C632670Orh.LIZIZ(context, new C19719212De(739023452, new AwS206S1100000_33(this, strLIZJ, 0), true));
        }
        C1745480vWU c1745480vWU = f6().LLJJIJIL;
        HashMap<String, Object> map = f6().LLJJIJIIJIL;
        c1745480vWU.getClass();
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new AnonymousClass0487(), new AwS580S0100000_1((HashMap) map, (HashMap<String, Object>) 929));
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void U5() {
        HandlerHook.viewPost(this.itemView, new ARunnableS126S0100000_26(this, 21));
        C197039127h c197039127hE6 = e6();
        if (c197039127hE6 == null || c197039127hE6.getVisibility() != 0) {
            return;
        }
        i6("paste");
    }

    public final C197039127h c6() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.krp) : null;
            this.LLJJIJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1748260vay d6() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.kq4) : null;
            this.LLJJI = (C1748260vay) viewFindViewById;
        }
        return (C1748260vay) viewFindViewById;
    }

    public final C197039127h e6() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ks_) : null;
            this.LLJJIJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final AddressEditViewModel f6() {
        return (AddressEditViewModel) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        a0 a0Var = this.LLJJ;
        if (a0Var != null) {
            return a0Var.l();
        }
        return null;
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        a0 a0Var = this.LLJJ;
        if (a0Var != null) {
            return a0Var.w2();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a6() {
        Activity activity;
        String text;
        C197039127h c197039127hC6 = c6();
        if (c197039127hC6 == null || !c197039127hC6.LLLII) {
            C1748260vay c1748260vayD6 = d6();
            if (((c1748260vayD6 == null || (text = c1748260vayD6.getText()) == null) ? 0 : text.length()) >= this.LLJJJIL) {
                ((C1745680vWo) this.LLILLJJLI).LJIILIIL = 0;
                C197039127h c197039127hC62 = c6();
                if (c197039127hC62 != null) {
                    c197039127hC62.setLoading(true);
                }
                Context context = this.itemView.getContext();
                if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                    C1744700vVE.LIZIZ(activity);
                }
                AddressEditViewModel addressEditViewModelF6 = f6();
                addressEditViewModelF6.getClass();
                addressEditViewModelF6.wR2("address_paste", addressEditViewModelF6.tR2(addressEditViewModelF6.XR2(), true), "address_paste", null, null, null, new AwS675S0100000_26(addressEditViewModelF6, 45));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        a0 a0Var = this.LLJJ;
        if (a0Var != null) {
            CandHelper candHelper = a0Var.LLILZLL;
            PopupWindow popupWindow = candHelper.LIZJ;
            if (popupWindow == null) {
                popupWindow = null;
            }
            popupWindow.dismiss();
            candHelper.LJIILIIL.removeMessages(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        View inputBottomSpaceFromXml;
        C0I7D inputWithIndicatorEditTextFromXml;
        super.rr(c1745680vWo);
        boolean z = false;
        if (this.LLJJ == null) {
            this.LLJJ = new a0((C1745300vWC) this.itemView.findViewById(R.id.krw), this.LLJILJILJ, f6(), false);
        }
        a0 a0Var = this.LLJJ;
        if (a0Var != null) {
            a0Var.LIZJ(c1745680vWo);
        }
        C197039127h c197039127hC6 = c6();
        if (c197039127hC6 != null) {
            if (c1745680vWo.LJIILIIL == 1) {
                z = true;
            }
            c197039127hC6.setLoading(z);
        }
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.kqt);
            } else {
                viewFindViewById = null;
            }
            this.LLJJIII = (C197039127h) viewFindViewById;
        }
        C197039127h c197039127h = (C197039127h) viewFindViewById;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS160S0100000_26(this, 21));
        }
        C197039127h c197039127hC62 = c6();
        if (c197039127hC62 != null) {
            C786410Ut5.U8(c197039127hC62, new ACListenerS160S0100000_26(this, 22));
        }
        C197039127h c197039127hE6 = e6();
        if (c197039127hE6 != null) {
            C786410Ut5.U8(c197039127hE6, new ACListenerS160S0100000_26(this, 23));
        }
        C1748260vay c1748260vayD6 = d6();
        if (c1748260vayD6 != null && (inputWithIndicatorEditTextFromXml = c1748260vayD6.getInputWithIndicatorEditTextFromXml()) != null) {
            inputWithIndicatorEditTextFromXml.addTextChangedListener(new C927503jt() { // from class: X.0vX2
                /* JADX WARN: Removed duplicated region for block: B:31:0x0068 A[PHI: r0
                  0x0068: PHI (r0v7 android.view.View) = (r0v6 android.view.View), (r0v12 android.view.View) binds: [B:25:0x0059, B:30:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.C927503jt, android.text.TextWatcher
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void afterTextChanged(android.text.Editable r8) {
                    /*
                        r7 = this;
                        r3 = 1
                        r6 = 0
                        if (r8 == 0) goto L82
                        int r0 = r8.length()
                        if (r0 == 0) goto L82
                        r0 = 0
                    Lb:
                        r4 = 2131376706(0x7f0a3a42, float:1.8373596E38)
                        r2 = 0
                        r5 = 8
                        if (r0 == 0) goto L3c
                        com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r1 = r7.LL
                        java.lang.String r0 = "paste"
                        r1.i6(r0)
                        com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r0 = r7.LL
                        X.127h r0 = r0.e6()
                        if (r0 == 0) goto L25
                        X.C786410Ut5.LJLLLLLL(r6, r0)
                    L25:
                        com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r1 = r7.LL
                        android.view.View r0 = r1.LLJJIJIIJIL
                        if (r0 != 0) goto L38
                        android.view.View r0 = r1.itemView
                        if (r0 == 0) goto L33
                        android.view.View r2 = r0.findViewById(r4)
                    L33:
                        r1.LLJJIJIIJIL = r2
                        r0 = r2
                        if (r2 == 0) goto L3b
                    L38:
                        X.C786410Ut5.LJLLLLLL(r5, r0)
                    L3b:
                        return
                    L3c:
                        com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r1 = r7.LL
                        java.lang.String r0 = "fill"
                        r1.i6(r0)
                        com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r1 = r7.LL
                        java.lang.String r0 = "clear"
                        r1.i6(r0)
                        com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r0 = r7.LL
                        X.127h r0 = r0.e6()
                        if (r0 == 0) goto L55
                        X.C786410Ut5.LJLLLLLL(r5, r0)
                    L55:
                        com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r1 = r7.LL
                        android.view.View r0 = r1.LLJJIJIIJIL
                        if (r0 != 0) goto L68
                        android.view.View r0 = r1.itemView
                        if (r0 == 0) goto L63
                        android.view.View r2 = r0.findViewById(r4)
                    L63:
                        r1.LLJJIJIIJIL = r2
                        r0 = r2
                        if (r2 == 0) goto L6b
                    L68:
                        X.C786410Ut5.LJLLLLLL(r6, r0)
                    L6b:
                        com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r0 = r7.LL
                        X.127h r2 = r0.c6()
                        if (r2 == 0) goto L3b
                        int r1 = r8.length()
                        com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressPasteViewHolder r0 = r7.LL
                        int r0 = r0.LLJJJIL
                        if (r1 >= r0) goto L7e
                        r3 = 0
                    L7e:
                        r2.setEnabled(r3)
                        return
                    L82:
                        r0 = 1
                        goto Lb
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1745820vX2.afterTextChanged(android.text.Editable):void");
                }
            });
        }
        C1748260vay c1748260vayD62 = d6();
        if (c1748260vayD62 != null && (inputBottomSpaceFromXml = c1748260vayD62.getInputBottomSpaceFromXml()) != null) {
            C786410Ut5.LJLLLLLL(8, inputBottomSpaceFromXml);
        }
    }

    public final void b6(String str) {
        String text;
        C1748260vay c1748260vayD6 = d6();
        if (c1748260vayD6 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C1748260vay c1748260vayD62 = d6();
            if (c1748260vayD62 == null || (text = c1748260vayD62.getText()) == null) {
                text = "";
            }
            sbLIZ.append(text);
            sbLIZ.append(str);
            c1748260vayD6.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void h6(String str) {
        Object obj;
        Object obj2;
        C1745480vWU c1745480vWU = f6().LLJJIJIL;
        Pair[] pairArr = new Pair[2];
        HashMap<String, Object> map = f6().LLJJIJIIJIL;
        if (map != null) {
            obj = map.get("entrance_info");
        } else {
            obj = null;
        }
        pairArr[0] = new Pair("entrance_info", obj);
        HashMap<String, Object> map2 = f6().LLJJIJIIJIL;
        if (map2 != null) {
            obj2 = map2.get("previous_page");
        } else {
            obj2 = null;
        }
        pairArr[1] = new Pair("previous_page", obj2);
        C1745480vWU.LJ(c1745480vWU, str, C2097608Jq.LJIIIIZZ(pairArr), null, 4);
    }

    public final void i6(String str) {
        Object obj;
        Object obj2;
        Object obj3 = ((LinkedHashMap) this.LLJJJJ).get(str);
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(obj3, bool)) {
            this.LLJJJJ.put(str, bool);
            C1745480vWU c1745480vWU = f6().LLJJIJIL;
            Pair[] pairArr = new Pair[2];
            HashMap<String, Object> map = f6().LLJJIJIIJIL;
            if (map != null) {
                obj = map.get("entrance_info");
            } else {
                obj = null;
            }
            pairArr[0] = new Pair("entrance_info", obj);
            HashMap<String, Object> map2 = f6().LLJJIJIIJIL;
            if (map2 != null) {
                obj2 = map2.get("previous_page");
            } else {
                obj2 = null;
            }
            pairArr[1] = new Pair("previous_page", obj2);
            C1745480vWU.LJFF(c1745480vWU, str, C2097608Jq.LJIIIIZZ(pairArr), null, 4);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public AddressPasteViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.ain, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 14));
        this.LLJJJIL = 3;
        this.LLJJJJ = new LinkedHashMap();
    }
}
