package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.AnonymousClass0378;
import X.C01GW;
import X.C049X;
import X.C049Y;
import X.C0DKK;
import X.C0H1U;
import X.C0I7D;
import X.C0WZX;
import X.C10510049c;
import X.C10511049d;
import X.C10515049h;
import X.C10516049i;
import X.C1058220de0;
import X.C12ES;
import X.C1308910kAL;
import X.C13LE;
import X.C14MI;
import X.C1743750vTh;
import X.C1745300vWC;
import X.C1745680vWo;
import X.C1746700vYS;
import X.C1746710vYT;
import X.C1746920vYo;
import X.C1747730va7;
import X.C1747740va8;
import X.C1747750va9;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C19719912Dl;
import X.C2204961BRm;
import X.C259800zU;
import X.C418440Gaw;
import X.C452501pT;
import X.C612310Nzx;
import X.C786410Ut5;
import X.C814420VxA;
import X.C948503nH;
import X.C960203pA;
import X.C992303uL;
import X.InterfaceC1746910vYn;
import X.InterfaceC1747130vZ9;
import X.InterfaceC1748860vbw;
import X.InterfaceC998610c5r;
import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.search.OneSearchResultAdapter;
import com.zhiliaoapp.musically.R;
import eha.k;
import g1c.AjS70S0100000_26;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS16S0002000_26;
import kotlin.jvm.internal.AwS1S0001100_26;
import kotlin.jvm.internal.AwS204S1100000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS40S0000100_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS364S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public class OneSearchItemViewHolder extends BaseViewHolder implements InterfaceC1747130vZ9, InterfaceC1746910vYn<CandInputData>, InterfaceC998610c5r {
    public final AddressEditFragment LLJILJILJ;
    public final FragmentManager LLJILLL;
    public final C01GW LLJJ;
    public final C1746710vYT<CandInputData> LLJJI;
    public final C1745300vWC LLJJIII;
    public final View LLJJIJI;
    public String LLJJIJIIJIL;
    public k LLJJIJIL;
    public C1745680vWo LLJJJ;
    public boolean LLJJJIL;
    public long LLJJJJ;
    public boolean LLJJJJJIL;
    public long LLJJJJLIIL;

    @Override // X.InterfaceC1747130vZ9
    public final void LJJIJIIJIL() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressEditViewModel c6() {
        return (AddressEditViewModel) this.LLJJ.getValue();
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        return this.LLJJI.getSearchEditFromXml();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        C1746710vYT<CandInputData> c1746710vYT = this.LLJJI;
        if (!((ArrayList) c1746710vYT.LLILZ).contains(this)) {
            ((ArrayList) c1746710vYT.LLILZ).add(this);
        }
        if (this.LLJJIJIL == null) {
            this.LLJJIJIL = new k(this.LLJJIII, this.LLJILLL, c6(), true);
        }
        k kVar = this.LLJJIJIL;
        if (kVar != null) {
            AnonymousClass0378.LIZ().LIZLLL("ec_district_select", kVar);
        }
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        C0I7D searchEditFromXml;
        C1745680vWo c1745680vWo = this.LLJJJ;
        return (c1745680vWo == null || c1745680vWo.LJFF) && (searchEditFromXml = this.LLJJI.getSearchEditFromXml()) != null && String.valueOf(C2204961BRm.LLLLJI(searchEditFromXml, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6P7QKR8crTAunbvPf4U3fljSi/ffd6L1OdjzyfvJWuB69B", null))).length() == 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        ((ArrayList) this.LLJJI.LLILZ).remove(this);
        k kVar = this.LLJJIJIL;
        if (kVar != null) {
            AnonymousClass0378.LIZ().LIZJ("ec_district_select", kVar);
        }
    }

    @Override // X.InterfaceC1747130vZ9
    public final void A2(String str) {
        Object obj;
        InputItemDTO inputItemDTO;
        C1745680vWo c1745680vWo = this.LLJJJ;
        String str2 = null;
        if (c1745680vWo != null) {
            obj = c1745680vWo.LIZIZ;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(str, obj)) {
            c6().LLJJIJI = true;
        }
        AddressEditViewModel addressEditViewModelC6 = c6();
        C1745680vWo c1745680vWo2 = this.LLJJJ;
        if (c1745680vWo2 != null && (inputItemDTO = c1745680vWo2.LIZ) != null) {
            str2 = inputItemDTO.key;
        }
        AddressEditViewModel.vR2(addressEditViewModelC6, str2, null, null, new AwS204S1100000_26(this, str, 0), 14);
    }

    @Override // X.InterfaceC1746910vYn
    public final void H5(int i) {
        C1748720vbi.LIZLLL(this.itemView, new C049X(), new AwS38S0001000_26(i, 2));
    }

    @Override // X.InterfaceC1747130vZ9
    public final void LJLILLLLZI(CharSequence charSequence) {
        String string;
        C1745680vWo c1745680vWo = this.LLJJJ;
        if (c1745680vWo != null) {
            if (charSequence != null) {
                string = charSequence.toString();
            } else {
                string = null;
            }
            c1745680vWo.LIZIZ = string;
        }
    }

    @Override // X.InterfaceC1746910vYn
    public final void LLJI(List<OneSearchResultAdapter.SearchResultItemVO> list) {
        C1748720vbi.LIZLLL(this.itemView, new C1747740va8(), new AwS605S0100000_26(list, (List<C1745680vWo>) 172));
    }

    @Override // X.InterfaceC1746910vYn
    public final void W2(int i) {
        this.LLJJJJJIL = false;
        if (this.LLJJJJLIIL != 0) {
            C1748720vbi.LIZLLL(this.itemView, new C1747750va9(), new AwS1S0001100_26(i, SystemClock.elapsedRealtime() - this.LLJJJJLIIL, 0));
            this.LLJJJJLIIL = 0L;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        super.rr(c1745680vWo);
        Object obj = c1745680vWo.LIZIZ;
        if (obj instanceof List) {
            List<C1745680vWo> list = (List) obj;
            if (list != null) {
                for (C1745680vWo c1745680vWo2 : list) {
                    if (Intrinsics.LJFF(c1745680vWo2.LIZ.key, "region")) {
                        if (this.LLJJIJIL == null) {
                            this.LLJJIJIL = new k(this.LLJJIII, this.LLJILLL, c6(), true);
                        }
                        k kVar = this.LLJJIJIL;
                        if (kVar != null) {
                            kVar.LIZIZ(c1745680vWo2, false);
                        }
                        C0H1U.LJIIIIZZ(0, this.LLJJIII);
                        C0H1U.LJIIIZ(0, this.LLJJIII);
                        C786410Ut5.LJLLLLLL(8, this.LLJJIII.findViewById(R.id.title));
                        AppCompatTextView appCompatTextView = (AppCompatTextView) this.LLJJIII.findViewById(R.id.xkj);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setSingleLine(true);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView.setWidth((int) appCompatTextView.getPaint().measureText(appCompatTextView.getText().toString()));
                    }
                    if (Intrinsics.LJFF(c1745680vWo2.LIZ.key, "one_box_search")) {
                        a6(c1745680vWo2, false);
                    }
                }
            }
            View viewFindViewById = this.LLJJIII.findViewById(R.id.xzq);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            View view = this.itemView;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view.getContext());
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            view.setBackground(gradientDrawable);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LLJJIII);
            C786410Ut5.LJLLLLLL(8, this.LLJJIJI);
            a6(c1745680vWo, true);
        }
        if (this.LLJJJIL) {
            C1748720vbi.LIZLLL(this.itemView, new C10515049h(), AFwS268S0000000_26.get$arr$(158));
            this.LLJJJIL = false;
        }
    }

    public final RecyclerView.ViewHolder b6(RecyclerView.ViewHolder viewHolder) {
        RecyclerView recyclerView;
        int childAdapterPosition;
        ViewParent parent = viewHolder.itemView.getParent();
        if (!(parent instanceof RecyclerView) || (recyclerView = (RecyclerView) parent) == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(viewHolder.itemView)) == -1) {
            return null;
        }
        return recyclerView.findViewHolderForAdapterPosition(childAdapterPosition + 1);
    }

    public final void d6(boolean z) {
        int i = 0;
        boolean z2 = true;
        if (c6().LLLIIII != 1 || c6().LLJ != null) {
            z2 = false;
        }
        View viewFindViewById = this.itemView.findViewById(R.id.nzd);
        if (!z2) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1746910vYn
    public final void t2(int i) {
        InterfaceC998610c5r interfaceC998610c5r;
        AddressEditViewModel addressEditViewModelC6 = c6();
        addressEditViewModelC6.getClass();
        addressEditViewModelC6.setState(new AwS605S0100000_26(addressEditViewModelC6, 835));
        this.LLJJI.LIZIZ(true);
        C1745680vWo c1745680vWo = this.LLJJJ;
        if (c1745680vWo != null) {
            c1745680vWo.LIZIZ = "";
        }
        RecyclerView.ViewHolder viewHolderB6 = b6(this);
        while (true) {
            if (viewHolderB6 == null) {
                break;
            }
            C259800zU c259800zU = new C259800zU();
            T tL = 0;
            tL = 0;
            if ((viewHolderB6 instanceof InterfaceC998610c5r) && (interfaceC998610c5r = (InterfaceC998610c5r) viewHolderB6) != null) {
                tL = interfaceC998610c5r.l();
            }
            c259800zU.element = tL;
            if (tL != 0) {
                C786410Ut5.LJLIIL(200L, C612310Nzx.LIZ, new ARunnableS104S0100000_4(c259800zU, 19));
                break;
            }
            viewHolderB6 = b6(viewHolderB6);
        }
        C1748720vbi.LIZLLL(this.itemView, new C049Y(), new AwS38S0001000_26(i, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a6(C1745680vWo c1745680vWo, boolean z) {
        String str;
        PopupWindow popupWindow;
        this.LLJJJ = c1745680vWo;
        C1746710vYT<CandInputData> c1746710vYT = this.LLJJI;
        View view = this.itemView;
        c1746710vYT.getClass();
        Context context = c1746710vYT.getContext();
        final C1746700vYS<T> c1746700vYS = new C1746700vYS<>(context, view, c1746710vYT);
        RecyclerView recyclerView = (RecyclerView) c1746700vYS.LJFF.findViewById(R.id.tdu);
        c1746700vYS.LJI = recyclerView;
        if (recyclerView != null) {
            recyclerView.setScrollBarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        }
        RecyclerView recyclerView2 = c1746700vYS.LJI;
        if (recyclerView2 != null) {
            recyclerView2.setVerticalScrollBarEnabled(false);
        }
        RecyclerView recyclerView3 = c1746700vYS.LJI;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C1058220de0(C960203pA.LIZ(R.attr.ng, context), 0, C12ES.LIZJ(16.0f, context), 2));
        }
        PopupWindow popupWindow2 = new PopupWindow(c1746700vYS.LJFF, -2, -2, false);
        c1746700vYS.LJII = popupWindow2;
        popupWindow2.setInputMethodMode(1);
        PopupWindow popupWindow3 = c1746700vYS.LJII;
        if (popupWindow3 != null) {
            popupWindow3.setSoftInputMode(16);
        }
        OneSearchResultAdapter oneSearchResultAdapter = new OneSearchResultAdapter();
        c1746700vYS.LJIIIIZZ = oneSearchResultAdapter;
        RecyclerView recyclerView4 = c1746700vYS.LJI;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(oneSearchResultAdapter);
        }
        RecyclerView recyclerView5 = c1746700vYS.LJI;
        if (recyclerView5 != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.setOrientation(1);
            recyclerView5.setLayoutManager(linearLayoutManager);
        }
        PopupWindow popupWindow4 = c1746700vYS.LJII;
        if (popupWindow4 != null) {
            popupWindow4.setBackgroundDrawable(C14MI.LIZ(context, R.drawable.b1e));
        }
        PopupWindow popupWindow5 = c1746700vYS.LJII;
        if (popupWindow5 != null) {
            popupWindow5.setElevation(C418440Gaw.LIZIZ(8));
        }
        Boolean bool = c1746700vYS.LIZLLL;
        if (bool != null && bool.booleanValue() && (popupWindow = c1746700vYS.LJII) != null) {
            popupWindow.setOutsideTouchable(true);
        }
        View viewFindViewById = c1746700vYS.LJFF.findViewById(R.id.ue1);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS364S0000000_26(0), viewFindViewById);
        }
        OneSearchResultAdapter oneSearchResultAdapter2 = c1746700vYS.LJIIIIZZ;
        if (oneSearchResultAdapter2 != null) {
            oneSearchResultAdapter2.LLILLJJLI = c1746700vYS;
        }
        PopupWindow popupWindow6 = c1746700vYS.LJII;
        if (popupWindow6 != null) {
            popupWindow6.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0vYr
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    InterfaceC1746910vYn<Object> interfaceC1746910vYn;
                    WeakReference<InterfaceC1746910vYn<Object>> weakReference = c1746700vYS.LJIIIZ;
                    if (weakReference == null || (interfaceC1746910vYn = weakReference.get()) == null) {
                        return;
                    }
                    List<C1746920vYo<Object>> list = c1746700vYS.LJIIJ;
                    interfaceC1746910vYn.W2(list != null ? list.size() : 0);
                }
            });
        }
        c1746710vYT.LLILZIL = c1746700vYS;
        String str2 = c1745680vWo.LIZ.hint;
        if (str2 != null) {
            c1746710vYT.getSearchEditFromXml().setHint(str2);
        }
        Object obj = c1745680vWo.LIZIZ;
        if ((obj instanceof String) && (str = (String) obj) != null) {
            c1746710vYT.getSearchEditFromXml().setText(str);
        }
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, c1746710vYT.getContext());
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            c1746710vYT.setBackground(gradientDrawable);
        }
        d6(true);
        if (!c1745680vWo.LJFF) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 66), this.itemView.findViewById(R.id.ntn));
            this.itemView.findViewById(R.id.ntn).findViewById(R.id.pm4).setFocusable(false);
            ((TextView) this.itemView.findViewById(R.id.ntn).findViewById(R.id.pm4)).setCursorVisible(false);
            this.itemView.findViewById(R.id.ntn).findViewById(R.id.pm4).setFocusableInTouchMode(false);
            ((TextView) this.itemView.findViewById(R.id.ntn).findViewById(R.id.pm4)).setHintTextColor(C960203pA.LIZ(R.attr.a1p, this.itemView.getContext()));
            C786410Ut5.I7(new AjS70S0100000_26(this, 67), this.itemView.findViewById(R.id.ntn).findViewById(R.id.pm4));
        }
        Integer num = ((C1745680vWo) this.LLILLJJLI).LJIIIIZZ;
        if (num != null) {
            int iIntValue = num.intValue();
            C0I7D searchEditFromXml = this.LLJJI.getSearchEditFromXml();
            if (searchEditFromXml != null) {
                searchEditFromXml.setImeOptions(iIntValue);
            }
        }
    }

    public OneSearchItemViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment, FragmentManager fragmentManager) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aj9, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        this.LLJILLL = fragmentManager;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 23));
        this.LLJJIJIIJIL = "";
        this.LLJJJIL = true;
        this.LLJJI = (C1746710vYT) this.itemView.findViewById(R.id.pm2);
        this.LLJJIII = (C1745300vWC) this.itemView.findViewById(R.id.pm7);
        this.LLJJIJI = this.itemView.findViewById(R.id.pm6);
        C1748730vbj.LJ(this.itemView, new InterfaceC1748860vbw() { // from class: X.0vYp
            @Override // X.InterfaceC1748860vbw
            public final void Q3(C1748770vbn c1748770vbn) {
                C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS605S0100000_26(this.LL, 170));
            }
        });
    }

    @Override // X.InterfaceC1746910vYn
    public final void Y0(C1746920vYo<CandInputData> c1746920vYo, int i, int i2) {
        Address address;
        String str;
        Integer num;
        String str2;
        InputItemDTO inputItemDTO;
        AddressEditViewModel addressEditViewModelC6 = c6();
        CandInputData candInputData = c1746920vYo.LIZ;
        if (candInputData != null) {
            address = candInputData.address;
        } else {
            address = null;
        }
        String str3 = this.LLJJIJIIJIL;
        if (candInputData != null) {
            str = candInputData.autocompleteAddressId;
            num = candInputData.placeType;
        } else {
            str = null;
            num = null;
        }
        C1745680vWo c1745680vWo = this.LLJJJ;
        if (c1745680vWo != null && (inputItemDTO = c1745680vWo.LIZ) != null) {
            str2 = inputItemDTO.key;
        } else {
            str2 = null;
        }
        AddressEditViewModel.dS2(addressEditViewModelC6, address, str3, str, num, str2, null, null, new AwS605S0100000_26(this, 171), 96);
        c6().LLJLIL = null;
        C1748720vbi.LIZLLL(this.itemView, new C1747730va7(), new AwS16S0002000_26(i, i2, 1));
    }

    @Override // X.InterfaceC1747130vZ9
    public final void p(View view, boolean z, String str) {
        if (z) {
            c6().LLJJIJI = true;
            this.LLJJJJ = SystemClock.elapsedRealtime();
            d6(true);
            C948503nH.LJIIIIZZ(this.LLJILJILJ, new C0DKK(this, null));
            C1748720vbi.LIZLLL(this.itemView, new C10510049c(), AFwS268S0000000_26.get$arr$(159));
            C1748720vbi.LIZLLL(this.itemView, new C10516049i(), AFwS268S0000000_26.get$arr$(160));
            return;
        }
        C1748720vbi.LIZLLL(this.itemView, new C10511049d(), new AwS40S0000100_26(SystemClock.elapsedRealtime() - this.LLJJJJ, 0));
    }
}
