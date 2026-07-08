package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C0H1U;
import X.C0I7D;
import X.C0WZX;
import X.C1058220de0;
import X.C12ES;
import X.C13LE;
import X.C1743750vTh;
import X.C1745300vWC;
import X.C1745330vWF;
import X.C1745360vWI;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1745690vWp;
import X.C1746460vY4;
import X.C19719912Dl;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C452501pT;
import X.C586610Mzb;
import X.C770702zh;
import X.C786410Ut5;
import X.C814420VxA;
import X.C927503jt;
import X.C958103op;
import X.C960203pA;
import X.C992303uL;
import X.EnumC586600Mza;
import X.InterfaceC998610c5r;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS95S0200000_26;
import aha.f;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcAddressEditFixConfig;
import com.zhiliaoapp.musically.R;
import defpackage.RegionCandHelper;
import defpackage.m7;
import defpackage.s7;
import eha.c;
import g1c.AjS44S0200000_26;
import g1c.AjS70S0100000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class RegionSearchItemViewHolder extends BaseViewHolder implements InterfaceC998610c5r {
    public final AddressEditFragment LLJILJILJ;
    public final C01GW LLJILLL;
    public c LLJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        c cVar = this.LLJJ;
        if (cVar != null) {
            return cVar.LL.getEditViewFromXml();
        }
        return null;
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        c cVar = this.LLJJ;
        if (cVar != null) {
            return cVar.w2();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        c cVar = this.LLJJ;
        if (cVar != null) {
            RegionCandHelper regionCandHelper = cVar.LLILZIL;
            PopupWindow popupWindow = regionCandHelper.LIZJ;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            regionCandHelper.LJIIJ.removeMessages(1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v61, types: [X.0vWI] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(final C1745680vWo c1745680vWo) throws Throwable {
        String str;
        boolean z;
        int length;
        int length2;
        String str2;
        String str3;
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams;
        String str4;
        int iLIZIZ;
        super.rr(c1745680vWo);
        if (this.LLJJ == null) {
            this.LLJJ = new c((C1745300vWC) this.itemView, this.LLJILJILJ, (AddressEditViewModel) this.LLJILLL.getValue());
        }
        final c cVar = this.LLJJ;
        if (cVar != null) {
            cVar.LLJIJIL = c1745680vWo;
            ClientConfig clientConfig = cVar.LLILLL.LLL;
            if (clientConfig != null) {
                str = clientConfig.uiStyle;
            } else {
                str = null;
            }
            if (C586610Mzb.LIZ(str)) {
                ClientConfig clientConfig2 = cVar.LLILLL.LLL;
                if (clientConfig2 != null) {
                    str4 = clientConfig2.uiStyle;
                } else {
                    str4 = null;
                }
                if (Intrinsics.LJFF(str4, EnumC586600Mza.EU_NEW_VERSION.getValue())) {
                    View inputBottomSpaceFromXml = cVar.LL.getInputBottomSpaceFromXml();
                    if (inputBottomSpaceFromXml != null) {
                        C786410Ut5.LJLLLLLL(8, inputBottomSpaceFromXml);
                    }
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                }
                cVar.LL.LJI(Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), true);
            }
            cVar.LLJ = c1745680vWo.LIZLLL;
            C0H1U.LIZIZ(cVar.LL.getTextViewFromXml());
            C12ES.LJIILL(0, cVar.LL.getEditViewFromXml());
            if (C770702zh.LIZIZ(c1745680vWo.LIZ.key)) {
                String str5 = c1745680vWo.LIZ.key;
                ClientConfig clientConfig3 = cVar.LLILLL.LLL;
                if (clientConfig3 != null) {
                    str3 = clientConfig3.wakeUpKeyBoardKeys;
                } else {
                    str3 = null;
                }
                if (Intrinsics.LJFF(str5, str3) && !cVar.LLJI && ((addressEditEnterParams = cVar.LLILLL.LLJJJIL) == null || addressEditEnterParams.address == null)) {
                    HandlerHook.viewPost(cVar.LL, new ARunnableS126S0100000_26(cVar, 68));
                    cVar.LLJI = true;
                }
            }
            C1745360vWI c1745360vWI = cVar.LLILZ;
            if (c1745360vWI != null) {
                cVar.LL.getEditViewFromXml().removeTextChangedListener(c1745360vWI);
            }
            if (!Intrinsics.LJFF(c1745680vWo.LIZ.key, cVar.LLILZIL.LJII)) {
                RegionCandHelper regionCandHelper = cVar.LLILZIL;
                AddressEditViewModel addressEditViewModel = cVar.LLILLL;
                String str6 = c1745680vWo.LIZ.key;
                AwS640S0100000_26 awS640S0100000_26 = cVar.LLJILLL;
                regionCandHelper.LJII = str6;
                RecyclerView recyclerView = new RecyclerView(regionCandHelper.LIZ);
                regionCandHelper.LIZLLL = recyclerView;
                regionCandHelper.LJIIIIZZ = awS640S0100000_26;
                recyclerView.addItemDecoration(new C1058220de0(C960203pA.LIZ(R.attr.ng, regionCandHelper.LIZ), 0, C12ES.LIZJ(12.0f, regionCandHelper.LIZ), 2));
                RecyclerView recyclerView2 = regionCandHelper.LIZLLL;
                if (recyclerView2 != null) {
                    recyclerView2.setVerticalScrollBarEnabled(false);
                }
                PopupWindow popupWindow = new PopupWindow((View) regionCandHelper.LIZLLL, C958103op.LIZLLL() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), -2, false);
                regionCandHelper.LIZJ = popupWindow;
                popupWindow.setInputMethodMode(1);
                PopupWindow popupWindow2 = regionCandHelper.LIZJ;
                if (popupWindow2 != null) {
                    popupWindow2.setSoftInputMode(16);
                }
                s7 s7Var = new s7();
                regionCandHelper.LJ = s7Var;
                s7Var.LLILLL = new m7(regionCandHelper, addressEditViewModel, str6);
                RecyclerView recyclerView3 = regionCandHelper.LIZLLL;
                if (recyclerView3 != null) {
                    recyclerView3.setAdapter(s7Var);
                }
                RecyclerView recyclerView4 = regionCandHelper.LIZLLL;
                if (recyclerView4 != null) {
                    RegionCandHelper.CustomLinearLayoutMgr customLinearLayoutMgr = new RegionCandHelper.CustomLinearLayoutMgr(regionCandHelper.LIZ);
                    customLinearLayoutMgr.setOrientation(1);
                    recyclerView4.setLayoutManager(customLinearLayoutMgr);
                }
                PopupWindow popupWindow3 = regionCandHelper.LIZJ;
                if (popupWindow3 != null) {
                    popupWindow3.setBackgroundDrawable(regionCandHelper.LIZ.getDrawable(R.drawable.b44));
                }
                PopupWindow popupWindow4 = regionCandHelper.LIZJ;
                if (popupWindow4 != null) {
                    popupWindow4.setElevation(8.0f);
                }
            }
            cVar.LL.getEditViewFromXml().setText(cVar.LIZ());
            cVar.LL.getEditViewFromXml().setTag(9);
            cVar.LL.getEditViewFromXml().setInputType(1);
            C0H1U.LIZIZ(cVar.LL.getArrowFromXml());
            final C1745300vWC c1745300vWC = cVar.LL;
            c1745300vWC.LIZLLL(c1745680vWo.LIZ.title, c1745680vWo.LIZJ());
            c1745300vWC.getEditViewFromXml().setHint(c1745680vWo.LIZ.hint);
            Integer num = c1745680vWo.LIZ.maxLines;
            if (num == null || num.intValue() < 0) {
                num = Integer.MAX_VALUE;
            }
            c1745300vWC.getEditViewFromXml().setMaxLines(num.intValue());
            if (num.intValue() > 1) {
                c1745300vWC.getEditViewFromXml().setImeOptions(6);
                c1745300vWC.getEditViewFromXml().setRawInputType(1);
                c1745300vWC.getEditViewFromXml().setInputType(131072);
                c1745300vWC.getEditViewFromXml().setHorizontallyScrolling(false);
            } else {
                Integer num2 = c1745680vWo.LJIIIIZZ;
                if (num2 != null) {
                    c1745300vWC.getEditViewFromXml().setImeOptions(num2.intValue());
                }
            }
            if (!((f) cVar.LLJILJILJ.getValue()).LIZLLL() && !cVar.LLILLL.FQ2().isAllKeyItemFilled()) {
                z = false;
            } else {
                z = true;
            }
            C1745330vWF.LIZ(z, c1745680vWo.LIZJ, c1745300vWC);
            C786410Ut5.I7(new AjS44S0200000_26(cVar, c1745300vWC, 16), cVar.LL.getContentViewFromXml());
            String str7 = cVar.LLILZIL.LJIIIZ;
            if (Intrinsics.LJFF(str7, "sug") || Intrinsics.LJFF(str7, "auto")) {
                Editable editableLLLLJI = C2204961BRm.LLLLJI(c1745300vWC.getEditViewFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6R4QuW/NeRNOnO+/DB40Gj6sIHmh6/aRbNGiaoeVc=", null));
                if (editableLLLLJI != null) {
                    length = editableLLLLJI.length();
                } else {
                    length = 0;
                }
                cVar.LLIZ = length;
                C0I7D editViewFromXml = c1745300vWC.getEditViewFromXml();
                Editable editableLLLLJI2 = C2204961BRm.LLLLJI(c1745300vWC.getEditViewFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6R4QuW/NeRNOnO+/DB40Gj6sIHmh6/aRbNGiaoeVc=", null));
                if (editableLLLLJI2 != null) {
                    length2 = editableLLLLJI2.length();
                } else {
                    length2 = 0;
                }
                editViewFromXml.setSelection(length2);
            }
            cVar.LL.getEditViewFromXml().setFilters(new C1745690vWp[]{new C1745690vWp()});
            Integer num3 = c1745680vWo.LIZ.maxLength;
            if (num3 != null) {
                c1745300vWC.getEditViewFromXml().setMaxLines(num3.intValue());
            }
            cVar.LLILZ = new C927503jt() { // from class: X.0vWI
                @Override // X.C927503jt, android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
                    boolean z2;
                    c cVar2 = cVar;
                    if (!cVar2.LLIZLLLIL && i2 <= 0 && i3 <= 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    cVar2.LLIZLLLIL = z2;
                    if (charSequence != null && !Intrinsics.LJFF(a0.LJLIIIL(charSequence.toString()).toString(), cVar2.LIZ())) {
                        cVar2.LLILLL.LLJJIJI = true;
                    }
                    c cVar3 = cVar;
                    RegionCandHelper regionCandHelper2 = cVar3.LLILZIL;
                    if (regionCandHelper2.LJI == 0) {
                        regionCandHelper2.LJI = 1;
                        regionCandHelper2.LIZ(cVar3.LLILLL, c1745680vWo.LIZ.key, false);
                    } else {
                        if (!cVar3.LLJ) {
                            return;
                        }
                        regionCandHelper2.LIZIZ(c1745300vWC.getEditViewFromXml(), c1745680vWo.LIZ.key, cVar.LLILLL);
                    }
                }
            };
            c1745300vWC.getEditViewFromXml().addTextChangedListener(cVar.LLILZ);
            c1745300vWC.getEditViewFromXml().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0vWJ
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z2) throws Throwable {
                    int length3;
                    int length4;
                    CharSequence charSequenceLJLIIIL;
                    boolean z3 = false;
                    if (z2) {
                        c cVar2 = cVar;
                        cVar2.LLILLL.LLJJIJI = true;
                        Editable editableLLLLJI3 = C2204961BRm.LLLLJI(c1745300vWC.getEditViewFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6R4QuW/NeRNOnO+/DB40Gj6sIHmh6/aRbNGiaoeVc=", null));
                        if (editableLLLLJI3 != null && (charSequenceLJLIIIL = a0.LJLIIIL(editableLLLLJI3)) != null) {
                            length4 = charSequenceLJLIIIL.length();
                        } else {
                            length4 = 0;
                        }
                        cVar2.LLIZ = length4;
                        cVar.LLILZLL = SystemClock.elapsedRealtime();
                        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
                        if (addressEditFragment != null) {
                            C1748720vbi.LIZIZ(addressEditFragment, new C10510049c(), new AwS605S0100000_26(c1745680vWo, 475));
                        }
                        cVar.LLJILJIL = false;
                        C1745680vWo c1745680vWo2 = c1745680vWo;
                        if (c1745680vWo2.LIZIZ == null) {
                            c1745680vWo2.LIZIZ = "";
                        }
                        String str8 = c1745680vWo2.LIZ.inputHintMessage;
                        C1745300vWC c1745300vWC2 = c1745300vWC;
                        if (str8 != null && !a0.LJJJIL(str8)) {
                            c1745300vWC2.LJ(str8);
                        }
                        c cVar3 = cVar;
                        C948503nH.LJIIIIZZ(cVar3.LLILLJJLI, new C1745390vWL(cVar3, c1745300vWC, null));
                        c cVar4 = cVar;
                        if (cVar4.LLJ) {
                            cVar4.LLILZIL.LIZIZ(c1745300vWC.getEditViewFromXml(), c1745680vWo.LIZ.key, cVar.LLILLL);
                        }
                        c1745300vWC.LIZIZ();
                        c1745680vWo.LIZJ = null;
                        return;
                    }
                    c cVar5 = cVar;
                    cVar5.LLILZIL.LIZ(cVar5.LLILLL, c1745680vWo.LIZ.key, !cVar5.LLJILJIL);
                    if (EcAddressEditFixConfig.LIZ().enableRegionSearchEditFix && !Intrinsics.LJFF(cVar.LIZ(), String.valueOf(C2204961BRm.LLLLJI(c1745300vWC.getEditViewFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6R4QuW/NeRNOnO+/DB40Gj6sIHmh6/aRbNGiaoeVc=", null))))) {
                        cVar.LIZIZ(null, null);
                    }
                    if (EcAddressEditFixConfig.LIZ().enableGeoAssociatedValidation) {
                        cVar.LLILLJJLI.uS(0);
                        HandlerHook.viewPost(c1745300vWC, new ARunnableS95S0200000_26(c1745680vWo, cVar, 24));
                    } else {
                        String str9 = c1745680vWo.LIZ.key;
                        if (str9 != null) {
                            cVar.LLILLL.kR2(str9);
                        }
                    }
                    boolean zLJFF = Intrinsics.LJFF(cVar.LLILZIL.LJIIIZ, "sug");
                    boolean zLJFF2 = Intrinsics.LJFF(cVar.LLILZIL.LJIIIZ, "auto");
                    Editable editableLLLLJI4 = C2204961BRm.LLLLJI(c1745300vWC.getEditViewFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6R4QuW/NeRNOnO+/DB40Gj6sIHmh6/aRbNGiaoeVc=", null));
                    if (editableLLLLJI4 != null) {
                        length3 = editableLLLLJI4.length();
                    } else {
                        length3 = 0;
                    }
                    c cVar6 = cVar;
                    int i = length3 - cVar6.LLIZ;
                    if (i < 0) {
                        cVar6.LLILZIL.LJIIIZ = "del";
                    } else if (i > 0) {
                        cVar6.LLILZIL.LJIIIZ = "add";
                    } else if (!zLJFF && !zLJFF2) {
                        cVar6.LLILZIL.LJIIIZ = "";
                    }
                    AddressEditViewModel addressEditViewModel2 = cVar6.LLILLL;
                    if (addressEditViewModel2.AR2() != 0) {
                        z3 = true;
                    }
                    addressEditViewModel2.nS2(z3);
                }
            });
            if (!c1745680vWo.LJFF) {
                if (((f) cVar.LLJILJILJ.getValue()).LIZJ()) {
                    cVar.LL.getTitleFromXml().setTextColor(C960203pA.LIZ(R.attr.a1p, cVar.LL.getContext()));
                }
                C786410Ut5.I7(new AjS70S0100000_26(cVar, 47), cVar.LL);
                C786410Ut5.I7(new AjS70S0100000_26(cVar, 49), cVar.LL.getContentViewFromXml());
                cVar.LL.getEditViewFromXml().setFocusable(false);
                cVar.LL.getEditViewFromXml().setCursorVisible(false);
                cVar.LL.getEditViewFromXml().setFocusableInTouchMode(false);
                cVar.LL.getEditViewFromXml().setTextColor(C960203pA.LIZ(R.attr.a1p, cVar.LL.getContext()));
                C786410Ut5.I7(new AjS70S0100000_26(cVar, 51), cVar.LL.getEditViewFromXml());
            }
            C1745480vWU c1745480vWU = cVar.LLILLL.LLJJIJIL;
            boolean z2 = cVar.LLIZLLLIL;
            c1745480vWU.getClass();
            C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
            InputItemDTO inputItemDTO = c1745680vWo.LIZ;
            if (inputItemDTO != null) {
                str2 = inputItemDTO.key;
            } else {
                str2 = null;
            }
            c1746460vY4.getClass();
            if (C1746460vY4.LIZIZ(str2)) {
                c1745480vWU.LJI(c1745680vWo, null, z2, null);
            }
        }
        X5();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public RegionSearchItemViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.ajb, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 25));
    }
}
