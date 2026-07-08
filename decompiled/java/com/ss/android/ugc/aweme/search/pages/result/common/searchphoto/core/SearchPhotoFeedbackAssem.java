package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.AbstractViewOnTouchListenerC446430Hez;
import X.C01GW;
import X.C07P0;
import X.C0BRL;
import X.C1012300cRw;
import X.C13LE;
import X.C1558520qew;
import X.C1839807Im;
import X.C1913107eT;
import X.C1913207eU;
import X.C21565319aV;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C427870Gq9;
import X.C650240Pew;
import X.C659720PuE;
import X.C659750PuH;
import X.C687700QyG;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1587906Jp;
import X.InterfaceC446420Hey;
import X.InterfaceC494301wD;
import X.InterfaceC712990Rxx;
import Y.ATListenerS338S0200000_10;
import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoFeedbackAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoFeedbackAssem extends ReusedUIContentAssem<SearchPhotoFeedbackAssem> implements InterfaceC712990Rxx<C659750PuH>, ISearchPhotoFeedbackAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public final C01GW LLJJJJ = C737910Sx3.LIZJ(this, C13LE.LIZ(SearchPhotoViewModel.class), AFwS241S0000000_10.get$arr$(228));
    public Aweme LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public LinearLayout LLJJL;
    public TextView LLJJLIIIJLLLLLLLZ;
    public C427870Gq9 LLJL;
    public TextView LLJLIL;
    public TextView LLJLILLLLZIIL;
    public View LLJLL;
    public C1012300cRw LLJLLIL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchPhotoScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPhotoScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 145456215) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void dp() {
        cp(this.LLJJJJLIIL);
        TextView textView = this.LLJJLIIIJLLLLLLLZ;
        if (textView == null) {
            textView = null;
        }
        cp(textView);
        C427870Gq9 c427870Gq9 = this.LLJL;
        if (c427870Gq9 == null) {
            c427870Gq9 = null;
        }
        cp(c427870Gq9);
        TextView textView2 = this.LLJLIL;
        if (textView2 == null) {
            textView2 = null;
        }
        cp(textView2);
        TextView textView3 = this.LLJLILLLLZIIL;
        cp(textView3 != null ? textView3 : null);
        cp(this.LLJLL);
    }

    public final void ep() {
        float fLIZIZ;
        FrameLayout frameLayout;
        if (C0BRL.LIZ() && (frameLayout = this.LLJJJJLIIL) != null) {
            frameLayout.setOnTouchListener(new ATListenerS444S0100000_10(this, 26));
        }
        FrameLayout frameLayout2 = this.LLJJJJLIIL;
        if (frameLayout2 != null) {
            if (C650240Pew.LIZ()) {
                C659720PuE.LIZ.getClass();
                fLIZIZ = C659720PuE.LIZ() ? C1839807Im.LIZ() : 0.0f;
            } else if (C1913207eU.LIZLLL()) {
                Integer numValueOf = Integer.valueOf(C1913107eT.LIZLLL());
                fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(numValueOf.intValue() > 0 ? numValueOf.intValue() : 4));
            } else {
                fLIZIZ = C1913207eU.LIZIZ();
            }
            C21565319aV.LIZIZ(frameLayout2, Float.valueOf(fLIZIZ), null, null, null, null, 30);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void cp(View view) {
        if (view != null) {
            final Context context = view.getContext();
            AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(context) { // from class: X.0Puc
                @Override // X.AbstractViewOnTouchListenerC446430Hez
                public final void LIZ(boolean z) {
                    View view2;
                    int iIntValue;
                    if (C650240Pew.LIZ()) {
                        view2 = this.LLJIJIL.LLJJL;
                    } else {
                        view2 = this.LLJIJIL.LLJJJJLIIL;
                    }
                    if (view2 != null) {
                        if (z) {
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view2.getContext());
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            view2.setForeground(new ColorDrawable(iIntValue));
                            return;
                        }
                        view2.setForeground(null);
                    }
                }
            };
            final AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 513);
            abstractViewOnTouchListenerC446430Hez.LLIZ = new InterfaceC446420Hey() { // from class: X.0Pua
                @Override // X.InterfaceC446420Hey
                public final void LIZ() {
                    Resources resources;
                    String string;
                    Integer numValueOf;
                    FrameLayout frameLayout = this.LIZ.LLJJJJLIIL;
                    if (frameLayout != null) {
                        SearchPhotoFeedbackAssem searchPhotoFeedbackAssem = this.LIZ;
                        Function0<Unit> function0 = awS554S0100000_10;
                        boolean z = C0Q9J.LIZ;
                        Aweme aweme = searchPhotoFeedbackAssem.LLJJJJJIL;
                        C683220Qr2 c683220Qr2 = null;
                        if (aweme != null) {
                            String str = ((SearchPhotoViewModel) searchPhotoFeedbackAssem.LLJJJJ.getValue()).LLILLJJLI;
                            if (str == null) {
                                str = "pics";
                            }
                            c683220Qr2 = new C683220Qr2(str, null, null, null, null, null, null, null, false, false, false, false, aweme, null, null, 516094);
                            Video video = aweme.getVideo();
                            c683220Qr2.LIZIZ = video != null ? video.getCover() : null;
                            String searchDesc = aweme.getSearchDesc() != null ? aweme.getSearchDesc() : aweme.getDesc();
                            c683220Qr2.LIZJ = searchDesc;
                            if (searchDesc == null || searchDesc.length() == 0) {
                                Context context2 = searchPhotoFeedbackAssem.getContext();
                                c683220Qr2.LIZJ = (context2 == null || (resources = context2.getResources()) == null) ? null : resources.getString(R.string.video);
                            }
                            c683220Qr2.LIZLLL = C684120QsU.LIZLLL(c683220Qr2.LIZ);
                            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("search_result_id", aweme.getGroupId()), new Pair("token_type", "photo"), new Pair("is_aladdin", CardStruct.IStatusCode.DEFAULT));
                            C653660PkS c653660PkS = ((SearchPhotoViewModel) searchPhotoFeedbackAssem.LLJJJJ.getValue()).LL;
                            if (c653660PkS != null) {
                                mapLJIIJ.put("enter_from", c653660PkS.LJIIIIZZ);
                                mapLJIIJ.put("rank", String.valueOf(c653660PkS.LJIILL));
                                mapLJIIJ.put("universal_rank", String.valueOf(c653660PkS.LJIILLIIL));
                                String str2 = c653660PkS.LJIIZILJ;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                mapLJIIJ.put("insert_type", str2);
                            }
                            if (C650410PfD.LIZ()) {
                                SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchPhotoFeedbackAssem), SearchServiceCenter$AdapterControlAbility.class, null);
                                if (searchServiceCenter$AdapterControlAbility == null || (numValueOf = Integer.valueOf(searchServiceCenter$AdapterControlAbility.qt2(aweme.getAid()))) == null || (string = numValueOf.toString()) == null) {
                                    string = "-1";
                                }
                                mapLJIIJ.put("actual_rank", string);
                            }
                            List<AnchorCommonStruct> anchors = aweme.getAnchors();
                            C197025126t c197025126tLJIILJJIL = (anchors == null || !(anchors.isEmpty() ^ true)) ? null : C09RB.LJIILJJIL(C09RB.LJIJI(new C1939607ik(anchors), AFwS241S0000000_10.get$arr$(604)), AFwS241S0000000_10.get$arr$(605));
                            ArrayList arrayList = new ArrayList();
                            if (c197025126tLJIILJJIL != null) {
                                C197024126s c197024126s = new C197024126s(c197025126tLJIILJJIL);
                                while (c197024126s.hasNext()) {
                                    arrayList.add(((Product) c197024126s.next()).LIZIZ());
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                mapLJIIJ.put("product_id", arrayList.toString());
                            }
                            if (aweme.isAd()) {
                                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                                mapLJIIJ.put("ad_id", String.valueOf(awemeRawAd != null ? awemeRawAd.getAdId() : null));
                            }
                            if (((Boolean) C271790Akz.LIZ.getValue()).booleanValue()) {
                                C659580Pu0.LIZ.getClass();
                                mapLJIIJ.putAll(C659580Pu0.LIZIZ(aweme, true));
                            }
                            c683220Qr2.LJ = mapLJIIJ;
                            c683220Qr2.LJFF = aweme.getAid();
                            c683220Qr2.LJII = AwemeExtKt.getAuthorUid(aweme);
                        }
                        C684120QsU.LIZIZ(frameLayout, c683220Qr2, false, new AwS624S0100000_10(function0, (Function0<Unit>) 53), new AwS554S0100000_10(function0, (Function0<Unit>) 516), 4);
                    }
                }
            };
            abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = new ATListenerS338S0200000_10(view, this, 0);
            view.setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.ISearchPhotoFeedbackAbility
    public final void fV0(List<Integer> list) {
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            cp(LJJIJL().findViewById(it2.next().intValue()));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJLIIL = (FrameLayout) view.findViewById(R.id.udc);
        this.LLJJL = (LinearLayout) view.findViewById(R.id.euy);
        this.LLJJLIIIJLLLLLLLZ = (TextView) view.findViewById(R.id.desc);
        this.LLJLILLLLZIIL = (TextView) view.findViewById(R.id.mn1);
        this.LLJLIL = (TextView) view.findViewById(R.id.bc6);
        this.LLJL = (C427870Gq9) view.findViewById(R.id.bbz);
        this.LLJLL = view.findViewById(R.id.u6w);
        if (C07P0.LIZIZ()) {
            this.LLJLLIL = (C1012300cRw) view.findViewById(R.id.vqk);
        }
        SearchVideoAndUserOptimizeExperiment.LIZ.getClass();
        if (SearchVideoAndUserOptimizeExperiment.LIZ()) {
            ep();
            dp();
            C1012300cRw c1012300cRw = this.LLJLLIL;
            if (c1012300cRw != null) {
                C427690Gpr.LJI(c1012300cRw, null);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659750PuH c659750PuH) {
        C659750PuH c659750PuH2 = c659750PuH;
        this.LLJJJJJIL = c659750PuH2.LL;
        ((SearchPhotoViewModel) this.LLJJJJ.getValue()).LL = c659750PuH2.LLILLJJLI;
        SearchVideoAndUserOptimizeExperiment.LIZ.getClass();
        if (!SearchVideoAndUserOptimizeExperiment.LIZ() && !c659750PuH2.LLIZ) {
            ep();
            dp();
            C1012300cRw c1012300cRw = this.LLJLLIL;
            if (c1012300cRw != null) {
                C427690Gpr.LJI(c1012300cRw, null);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659750PuH c659750PuH) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659750PuH c659750PuH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
