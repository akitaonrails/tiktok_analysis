package com.ss.android.ugc.aweme.search.detail.bottombar.ui;

import X.C01GW;
import X.C0PRC;
import X.C0Q3E;
import X.C1188890h2l;
import X.C1385040m98;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C20684815ws;
import X.C2188811AlT;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C614900O9w;
import X.C622680Oba;
import X.C712710RxV;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS51S0300000_18;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.search.detail.bottom.SearchDetailBottomBarProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS136S0110000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchDetailPoiBottomAssem extends UIContentAssem implements SearchDetailBottomBarProtocol {
    public String LLIZLLLIL;
    public C1188890h2l LLJ;
    public TuxTextView LLJI;
    public View LLJIJIL;
    public TuxIconView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public AwS136S0110000_18 LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public ARunnableS51S0300000_18 LLJJIJIL;
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(575));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(574));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), SearchDetailBottomBarProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) {
        if (!this.LLJJIJIIJIL && Intrinsics.LJFF(this.LLIZLLLIL, c614900O9w.LIZIZ)) {
            String str = this.LLIZLLLIL;
            boolean z = c614900O9w.LIZ;
            if (str != null && str.length() != 0) {
                ((Map) C712710RxV.LIZ.getValue()).put(str, Boolean.valueOf(z));
            }
            Ho(c614900O9w.LIZ, false);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C622680Oba.LIZJ(this);
    }

    public final void Go(String str, String str2) {
        String quantityString;
        Resources resources;
        TuxTextView tuxTextView = this.LLJILLL;
        if (tuxTextView != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str);
            if (str2.length() > 0) {
                spannableStringBuilder.append((CharSequence) " · ");
                Context context = getContext();
                if (context == null || (resources = context.getResources()) == null || (quantityString = resources.getQuantityString(2131755131, CastIntegerProtector.parseInt(str2), str2)) == null) {
                    quantityString = "";
                }
                spannableStringBuilder.append((CharSequence) quantityString);
            }
            tuxTextView.setText(spannableStringBuilder.toString());
        }
    }

    public final void Ho(boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer numValueOf = Integer.valueOf(R.attr.a0p);
        if (z) {
            View view = this.LLJIJIL;
            if (view != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.e9);
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
                view.setBackground(c384050F3z.LIZ(LJJIJL().getContext()));
            }
            TuxIconView tuxIconView = this.LLJILJIL;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_bookmark_fill;
                c419910GdJ.LJ = numValueOf;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            TuxTextView tuxTextView = this.LLJILJILJ;
            if (tuxTextView != null) {
                tuxTextView.setText(2131844691);
            }
            TuxTextView tuxTextView2 = this.LLJILJILJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.a0p);
            }
        } else {
            View view2 = this.LLJIJIL;
            if (view2 != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
                c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
                view2.setBackground(c384050F3z2.LIZ(LJJIJL().getContext()));
            }
            TuxIconView tuxIconView2 = this.LLJILJIL;
            if (tuxIconView2 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_bookmark;
                c419910GdJ2.LJ = numValueOf;
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                tuxIconView2.setTuxIcon(c419910GdJ2);
            }
            TuxTextView tuxTextView3 = this.LLJILJILJ;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(2131844690);
            }
            TuxTextView tuxTextView4 = this.LLJILJILJ;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColorRes(R.attr.a0p);
            }
        }
        if (z2) {
            if (z) {
                str = "favourite_poi";
            } else {
                str = "cancel_favourite_poi";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("search_id", ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL);
            C1188890h2l c1188890h2l = this.LLJ;
            String str6 = "";
            if (c1188890h2l == null || (str2 = c1188890h2l.LIZIZ) == null) {
                str2 = "";
            }
            linkedHashMap.put("poi_detail_enter_from", str2);
            C1188890h2l c1188890h2l2 = this.LLJ;
            if (c1188890h2l2 == null || (str3 = c1188890h2l2.LIZJ) == null) {
                str3 = "";
            }
            linkedHashMap.put("poi_detail_enter_method", str3);
            String str7 = this.LLIZLLLIL;
            if (str7 == null) {
                str7 = "";
            }
            linkedHashMap.put("initial_poi_id", str7);
            C1188890h2l c1188890h2l3 = this.LLJ;
            if (c1188890h2l3 == null || (str4 = c1188890h2l3.LIZIZ) == null) {
                str4 = "";
            }
            linkedHashMap.put("initial_poi_enter_from", str4);
            C1188890h2l c1188890h2l4 = this.LLJ;
            if (c1188890h2l4 != null && (str5 = c1188890h2l4.LIZJ) != null) {
                str6 = str5;
            }
            linkedHashMap.put("initial_poi_enter_method", str6);
            linkedHashMap.put("search_enter_component_name", "fusion_content_click_favorite");
            C20684815ws.LJIILLIIL(str, linkedHashMap);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.detail.bottom.SearchDetailBottomBarProtocol
    public final void rD2(ViewGroup viewGroup, C1188890h2l c1188890h2l) {
        String str;
        String str2;
        String str3;
        boolean zBooleanValue;
        Boolean boolIsCollected;
        Boolean boolIsCollected2;
        Boolean bool;
        PoiDataStruct poiDataStruct;
        String str4;
        PoiDataStruct poiDataStruct2;
        View view;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        String str5 = null;
        if (!this.LLJJIJI) {
            boolean z = c1188890h2l.LJFF;
            this.LLJJIJIIJIL = z;
            if (z) {
                if (viewGroup != null) {
                    C786410Ut5.Sd(R.layout.ew0, C786410Ut5.ne(C1385040m98.LIZ(viewGroup.getContext(), true)), viewGroup);
                    tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.u9o);
                } else {
                    tuxTextView = null;
                }
                this.LLJILLL = tuxTextView;
                if (viewGroup != null) {
                    tuxTextView2 = (TuxTextView) viewGroup.findViewById(R.id.u9n);
                } else {
                    tuxTextView2 = null;
                }
                this.LLJJ = tuxTextView2;
            } else if (viewGroup != null) {
                C786410Ut5.Sd(R.layout.ew1, C786410Ut5.ne(viewGroup.getContext()), viewGroup);
                viewGroup.findViewById(R.id.udp);
                this.LLJI = (TuxTextView) viewGroup.findViewById(R.id.udq);
                this.LLJIJIL = viewGroup.findViewById(R.id.udo);
                this.LLJILJIL = (TuxIconView) viewGroup.findViewById(R.id.u7e);
                this.LLJILJILJ = (TuxTextView) viewGroup.findViewById(R.id.u7f);
                C786410Ut5.K7(viewGroup, new ACListenerS153S0100000_18(this, 196));
                View view2 = this.LLJIJIL;
                if (view2 != null) {
                    C786410Ut5.I7(new ACListenerS153S0100000_18(this, 197), view2);
                }
            }
            this.LLJJIJI = true;
        }
        if (c1188890h2l.LJFF && ((c1188890h2l.LJI.length() > 0 && c1188890h2l.LJII.length() > 0) || AwemeBizExtKt.getIdentifier(c1188890h2l.LIZ) != null)) {
            PoiDataStruct poiDataStruct3 = c1188890h2l.LIZ.getPoiDataStruct();
            if (poiDataStruct3 == null) {
                poiDataStruct3 = c1188890h2l.LIZLLL;
            }
            ARunnableS51S0300000_18 aRunnableS51S0300000_18 = new ARunnableS51S0300000_18(this, c1188890h2l, poiDataStruct3, 9);
            Object parent = LJJIJL().getParent();
            if ((parent instanceof View) && (view = (View) parent) != null && view.getParent() != null && view.isAttachedToWindow()) {
                ARunnableS51S0300000_18 aRunnableS51S0300000_182 = this.LLJJIJIL;
                if (aRunnableS51S0300000_182 != null) {
                    HandlerHook.viewRemoveCallbacks(view, aRunnableS51S0300000_182);
                }
                this.LLJJIJIL = aRunnableS51S0300000_18;
                HandlerHook.viewPost(view, aRunnableS51S0300000_18);
                return;
            }
            return;
        }
        this.LLJ = c1188890h2l;
        PoiDataStruct poiDataStruct4 = c1188890h2l.LIZ.getPoiDataStruct();
        if (poiDataStruct4 == null) {
            poiDataStruct4 = c1188890h2l.LIZLLL;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_id", ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL);
        String str6 = c1188890h2l.LIZIZ;
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("poi_detail_enter_from", str6);
        String str8 = c1188890h2l.LIZJ;
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMap.put("poi_detail_enter_method", str8);
        PoiDataStruct poiDataStruct5 = c1188890h2l.LIZ.getPoiDataStruct();
        if (((poiDataStruct5 == null && (poiDataStruct5 = c1188890h2l.LIZLLL) == null) || (str = poiDataStruct5.poiId) == null) && ((poiDataStruct2 = c1188890h2l.LIZLLL) == null || (str = poiDataStruct2.poiId) == null)) {
            str = "";
        }
        linkedHashMap.put("initial_poi_id", str);
        String str9 = c1188890h2l.LIZIZ;
        if (str9 == null) {
            str9 = "";
        }
        linkedHashMap.put("initial_poi_enter_from", str9);
        String str10 = c1188890h2l.LIZJ;
        if (str10 == null) {
            str10 = "";
        }
        linkedHashMap.put("initial_poi_enter_method", str10);
        linkedHashMap.put("search_enter_component_name", "fusion_content_click_poi_anchor");
        ILocalServicePassThroughService iLocalServicePassThroughService = (ILocalServicePassThroughService) PluggableExtentionKt.pluggableSpi$default(ILocalServicePassThroughService.class, false, false, false, 14, null);
        if (iLocalServicePassThroughService != null) {
            iLocalServicePassThroughService.LJII(PageFinder.via(c1188890h2l.LJ), "show_favourite_poi_button", null, linkedHashMap);
        }
        C20684815ws.LJIILLIIL("show_favourite_poi_button", linkedHashMap);
        String str11 = this.LLIZLLLIL;
        if (poiDataStruct4 != null) {
            str2 = poiDataStruct4.poiId;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str11, str2)) {
            return;
        }
        TuxTextView tuxTextView3 = this.LLJI;
        if (tuxTextView3 != null) {
            if ((poiDataStruct4 != null && (str4 = poiDataStruct4.poiName) != null) || ((poiDataStruct = c1188890h2l.LIZLLL) != null && (str4 = poiDataStruct.poiName) != null)) {
                str7 = str4;
            }
            tuxTextView3.setText(str7);
        }
        if (poiDataStruct4 == null || (str3 = poiDataStruct4.poiId) == null) {
            PoiDataStruct poiDataStruct6 = c1188890h2l.LIZLLL;
            if (poiDataStruct6 != null) {
                str3 = poiDataStruct6.poiId;
            } else {
                str3 = null;
            }
        }
        this.LLIZLLLIL = str3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAweme poiName: ");
        if (poiDataStruct4 != null) {
            str5 = poiDataStruct4.poiName;
        }
        sbLIZ.append(str5);
        C2188811AlT.LIZIZ(sbLIZ);
        String str12 = this.LLIZLLLIL;
        if (str12 != null && str12.length() != 0 && (bool = (Boolean) ((Map) C712710RxV.LIZ.getValue()).get(str12)) != null) {
            zBooleanValue = bool.booleanValue();
        } else if (poiDataStruct4 != null && (boolIsCollected2 = poiDataStruct4.isCollected()) != null) {
            zBooleanValue = boolIsCollected2.booleanValue();
        } else {
            PoiDataStruct poiDataStruct7 = c1188890h2l.LIZLLL;
            if (poiDataStruct7 != null && (boolIsCollected = poiDataStruct7.isCollected()) != null) {
                zBooleanValue = boolIsCollected.booleanValue();
            } else {
                zBooleanValue = false;
            }
        }
        Ho(zBooleanValue, false);
    }
}
