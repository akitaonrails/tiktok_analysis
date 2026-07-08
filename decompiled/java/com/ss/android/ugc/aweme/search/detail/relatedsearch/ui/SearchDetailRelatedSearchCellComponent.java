package com.ss.android.ugc.aweme.search.detail.relatedsearch.ui;

import X.C01GW;
import X.C0P7A;
import X.C0PCY;
import X.C0PHW;
import X.C0PHX;
import X.C0PI6;
import X.C0PRC;
import X.C0PXB;
import X.C0PXE;
import X.C0PXI;
import X.C0PYD;
import X.C0PYH;
import X.C0PYJ;
import X.C0PYK;
import X.C0PYL;
import X.C0Q3E;
import X.C0RH0;
import X.C0SUL;
import X.C11JF;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C14EU;
import X.C1600700rky;
import X.C1697810uHb;
import X.C1AV2;
import X.C1AVH;
import X.C1ER1;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C308440C7e;
import X.C308570C7r;
import X.C308610C7v;
import X.C308620C7w;
import X.C384050F3z;
import X.C418440Gaw;
import X.C430110Gtl;
import X.C438710HIf;
import X.C443120HZe;
import X.C452501pT;
import X.C639840P7u;
import X.C640970PCd;
import X.C645780PUq;
import X.C650460PfI;
import X.C658730Psd;
import X.C661350Pwr;
import X.C724270Sb3;
import X.C737030Svd;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC2180541AVo;
import Y.ARunnableS110S0100000_10;
import Y.ARunnableS5S1300000_4;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.aweme.feed.controller.I18nPlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.settings.NewRs;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.settings.SearchInflowRsSettingsConfig;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.settings.SearchInnerFeedRsConfig;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchResultPictureSrExperiment;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AwS254S0300000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDetailRelatedSearchCellComponent extends BaseCellContentComponent<SearchDetailRelatedSearchCellComponent> {
    public View LLJJJJLIIL;
    public C0SUL LLJJL;
    public C0RH0 LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public ViewStub LLJLILLLLZIIL;
    public View LLJLL;
    public SearchMixFeed LLJLLIL;
    public Integer LLJLLL;
    public Integer LLJZ;
    public long LLJZIJLIL;
    public boolean LLL;
    public C11JF LLLF;
    public C443120HZe<Integer, Integer, Integer> LLLFF;
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 303));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 307));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 306));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 304));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 308));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 309));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 310));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 305));
    public final C01GW LLLIILIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 301));
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 299));

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        this.LLLFF = null;
        C11JF c11jf = this.LLLF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLLF = null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        View view = this.LLJLL;
        if (view != null) {
            C661350Pwr.LIZJ(view);
        } else {
            C661350Pwr.LIZJ(this.LLJLILLLLZIIL);
        }
        ip(true);
    }

    public final boolean hp() {
        C0PI6 c0pi6LJJII = C1ER1.LIZIZ.LJJII();
        C724270Sb3 c724270Sb3 = this.LLJI;
        return c0pi6LJJII.LJFF(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        Long lValueOf;
        ISearchContextAbility iSearchContextAbilityLIZJ;
        C0PCY<C0PYD> c0pcyY30;
        IDetailPageAbility iDetailPageAbilityLIZ;
        DetailFragmentPanel detailFragmentPanelJQ;
        I18nPlayerController i18nPlayerController;
        if (hp()) {
            if (EventBus.LIZLLL().LJIIJ(this)) {
                EventBus.LIZLLL().LJJI(this);
            }
            C11JF c11jf = this.LLLF;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LLLF = null;
            this.LLL = false;
            Integer num = this.LLJLLL;
            if (num != null) {
                int iIntValue = num.intValue();
                View view = (View) this.LLLIL.getValue();
                if (view != null) {
                    C786410Ut5.LJLLLLLL(iIntValue, view);
                }
                IPanelUIAbility iPanelUIAbility = (IPanelUIAbility) this.LLLFFI.getValue();
                if (iPanelUIAbility != null) {
                    iPanelUIAbility.YG(false);
                }
            }
            ep("inner_slide_page");
            this.LLLFF = null;
            this.LLJZIJLIL = 0L;
        }
        C0PYH.LIZ.getValue().getClass();
        C0PHW c0phwLIZJ = ((C639840P7u) C0Q3E.LJI().jy().LIZJ()).LL.LIZJ();
        if (C1ER1.LIZIZ.LLIFFJFJJ(c0phwLIZJ != null ? c0phwLIZJ.LIZLLL() : null)) {
            while (c0phwLIZJ != null && c0phwLIZJ.LIZ() != null) {
                C0PHW c0phwLIZ = c0phwLIZJ.LIZ();
                Aweme awemeLIZLLL = c0phwLIZ != null ? c0phwLIZ.LIZLLL() : null;
                C1ER1 c1er1 = C1ER1.LIZIZ;
                if (c1er1.LLIFFJFJJ(awemeLIZLLL)) {
                    return;
                }
                if (c1er1.LJJII().LJFF(awemeLIZLLL)) {
                    C724270Sb3 c724270Sb3 = this.LLJI;
                    Fragment fragment = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).fragment;
                    if (fragment == null || (iDetailPageAbilityLIZ = C1600700rky.LIZ(fragment)) == null || (detailFragmentPanelJQ = iDetailPageAbilityLIZ.JQ()) == null || (i18nPlayerController = detailFragmentPanelJQ.LLLLIILL) == null) {
                        lValueOf = null;
                    } else {
                        C724270Sb3 c724270Sb32 = this.LLJI;
                        lValueOf = Long.valueOf(i18nPlayerController.LJLJJI(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid()));
                    }
                    C724270Sb3 c724270Sb33 = this.LLJI;
                    Aweme aweme = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
                    if (aweme == null || (iSearchContextAbilityLIZJ = C0Q3E.LIZJ(aweme)) == null || (c0pcyY30 = iSearchContextAbilityLIZJ.Y30()) == null) {
                        return;
                    }
                    c0pcyY30.LIZ(new C645780PUq(lValueOf));
                    return;
                }
                c0phwLIZJ = c0phwLIZJ.LIZ();
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Zo() {
        if (hp() && this.LLL && EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        if (hp() && this.LLL) {
            this.LLJZIJLIL = System.currentTimeMillis();
            if (EventBus.LIZLLL().LJIIJ(this)) {
                return;
            }
            EventBus.LIZLLL().LJIJJ(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        View view;
        if (hp() && (view = this.LLJJJJLIIL) != null) {
            C430110Gtl.LIZ(view, new AwS554S0100000_10(this, 302));
        }
    }

    public final void ep(String str) {
        Object obj;
        C0PXE c0pxe;
        String str2;
        String str3;
        String string;
        boolean zBooleanValue;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        ISearchContextAbility iSearchContextAbilityLIZJ;
        C0PCY<C0PYD> c0pcyY30;
        C0PYD c0pyd;
        C0PXB c0pxb = C0PXB.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        SearchMixFeed searchMixFeed = this.LLJLLIL;
        long j = this.LLJZIJLIL;
        C443120HZe<Integer, Integer, Integer> c443120HZe = this.LLLFF;
        c0pxb.getClass();
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && (iSearchContextAbilityLIZJ = C0Q3E.LIZJ(aweme)) != null && (c0pcyY30 = iSearchContextAbilityLIZJ.Y30()) != null && (c0pyd = (C0PYD) c0pcyY30.LIZJ()) != null) {
            c0pxe = c0pyd.LLILZ;
        } else {
            c0pxe = null;
        }
        if (c0pxe != null) {
            str2 = c0pxe.LIZJ;
        } else {
            str2 = null;
        }
        String str7 = videoItemParams.mEventType;
        String str8 = "";
        if (c0pxe == null || (str3 = c0pxe.LIZIZ) == null) {
            str3 = "";
        }
        if (searchMixFeed != null) {
            string = Long.valueOf(searchMixFeed.getDocId()).toString();
        } else {
            string = null;
        }
        if (c0pxe != null && (bool = c0pxe.LIZ) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        String strValueOf = String.valueOf(((Number) C0PXB.LIZIZ(videoItemParams.getAweme(), c443120HZe).getFirst()).intValue());
        String strValueOf2 = String.valueOf(((Number) C0PXB.LIZIZ(videoItemParams.getAweme(), c443120HZe).getSecond()).intValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - j;
        C0PRC c0prc = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
        String string2 = C308620C7w.LIZ().toString();
        C650460PfI<C0PYK> c650460PfI = new C650460PfI<C0PYK>() { // from class: X.0PYK
        };
        c650460PfI.LJIIZILJ("impr_id", str2);
        c650460PfI.LJIJJ(str7);
        c650460PfI.LJIIZILJ("search_id", c0prc.LLILLL);
        c650460PfI.LJIJI("search_result_id", string);
        c650460PfI.LJIIZILJ("inner_search_id", str3);
        if (zBooleanValue) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c650460PfI.LJIIZILJ("is_inner", str4);
        c650460PfI.LJIIZILJ("group_position", strValueOf);
        c650460PfI.LJIIZILJ("inner_rs_doc_rank", strValueOf2);
        c650460PfI.LJIIZILJ("is_play_music", string2);
        c650460PfI.LJIIZILJ("start_time", String.valueOf(j));
        c650460PfI.LJIIZILJ("end_time", String.valueOf(jCurrentTimeMillis));
        c650460PfI.LJIIZILJ("end_method", str);
        c650460PfI.LJIIZILJ("duration", String.valueOf(j2));
        c650460PfI.LJIILJJIL();
        if (c0pxe != null) {
            str5 = c0pxe.LIZJ;
        } else {
            str5 = null;
        }
        String str9 = videoItemParams.mEventType;
        if (c0pxe != null && (str6 = c0pxe.LIZIZ) != null) {
            str8 = str6;
        }
        String strValueOf3 = String.valueOf(C0PXB.LIZIZ(videoItemParams.getAweme(), c443120HZe).getFirst());
        String strValueOf4 = String.valueOf(((Number) C0PXB.LIZIZ(videoItemParams.getAweme(), c443120HZe).getSecond()).intValue());
        String string3 = C308620C7w.LIZ().toString();
        C0PRC c0prc2 = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
        C650460PfI<C0PYJ> c650460PfI2 = new C650460PfI<C0PYJ>() { // from class: X.0PYJ
        };
        c650460PfI2.LJIIZILJ("impr_id", str5);
        c650460PfI2.LJIJJ(str9);
        c650460PfI2.LJIIZILJ("search_id", c0prc2.LLILLL);
        c650460PfI2.LJIIZILJ("inner_search_id", str8);
        c650460PfI2.LJIIZILJ("group_position", strValueOf3);
        c650460PfI2.LJIIZILJ("inner_rs_doc_rank", strValueOf4);
        c650460PfI2.LJIIZILJ("is_play_music", string3);
        c650460PfI2.LJIIZILJ("click_type", str);
        c650460PfI2.LJIILJJIL();
    }

    public final void ip(boolean z) {
        if (z) {
            C661350Pwr.LJIIL(this.LLJJJJLIIL);
            C661350Pwr.LJIIL(this.LLJLIL);
            C661350Pwr.LJIIL(this.LLJL);
            C661350Pwr.LJIIL(this.LLJJL);
            C661350Pwr.LJIIL(this.LLJJLIIIJLLLLLLLZ);
            return;
        }
        View view = this.LLJJJJLIIL;
        if (view == null || view.getVisibility() != 8) {
            View view2 = this.LLJJJJLIIL;
            C1AV2 c1av2 = (C1AV2) C1AVH.LJJJI.getValue();
            c1av2.LJI = true;
            C2180521AVm.LIZ(view2, EnumC2180541AVo.V_VISIBLITY, c1av2);
        }
        C661350Pwr.LIZJ(this.LLJJJJLIIL);
        C661350Pwr.LIZJ(this.LLJLIL);
        C661350Pwr.LIZJ(this.LLJL);
        C661350Pwr.LIZJ(this.LLJJL);
        C661350Pwr.LIZJ(this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJLIIL = view.findViewById(R.id.widget_container);
        this.LLJJL = (C0SUL) view.findViewById(R.id.long_press_layout);
        this.LLJJLIIIJLLLLLLLZ = (C0RH0) view.findViewById(R.id.oqx);
        this.LLJL = view.findViewById(R.id.kvf);
        this.LLJLIL = view.findViewById(R.id.vlf);
        this.LLJLILLLLZIIL = (ViewStub) view.findViewById(R.id.t45);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Object obj;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String str;
        Aweme aweme;
        Object obj2;
        Object obj3;
        HashMap<String, Object> map;
        HashMap<String, Object> map2;
        SearchInnerFeedRsConfig searchInnerFeedRsConfig;
        NewRs newRs;
        Object obj4;
        int i2;
        int i3;
        Integer num;
        int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (hp()) {
            C01GW<C0PYH> c01gw = C0PYH.LIZ;
            C0PYH value = c01gw.getValue();
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj5 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            value.getClass();
            this.LLJLLIL = C0PYH.LIZ((VideoItemParams) obj);
            View view = this.LLJLL;
            int i4 = 0;
            if (view != null) {
                C661350Pwr.LJIIL(view);
            } else {
                ViewStub viewStub = this.LLJLILLLLZIIL;
                if (viewStub != null) {
                    if (C308610C7v.LIZ()) {
                        i = R.layout.blw;
                    } else {
                        i = R.layout.blx;
                    }
                    viewStub.setLayoutResource(i);
                    this.LLJLL = C786410Ut5.LJLLLL(viewStub);
                    if (!C308610C7v.LIZ()) {
                        UrlModel urlModel = new UrlModel();
                        String[] strArr = new String[1];
                        C0PYL.LIZ.getClass();
                        SearchInflowRsSettingsConfig searchInflowRsSettingsConfig = (SearchInflowRsSettingsConfig) C0PYL.LIZIZ.getValue();
                        if (searchInflowRsSettingsConfig != null && (searchInnerFeedRsConfig = searchInflowRsSettingsConfig.innerFeedConfig) != null && (newRs = searchInnerFeedRsConfig.newRs) != null) {
                            str = newRs.cover;
                        } else {
                            str = null;
                        }
                        strArr[0] = str;
                        urlModel.setUrlList(C1697810uHb.LJIILJJIL(strArr));
                        ImageView imageView = (ImageView) this.LLLII.getValue();
                        if (imageView != null) {
                            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(5));
                            c1331670kl3LJIIIIZZ.LJJIIZI(c384050F3z.LIZ(imageView.getContext()));
                            c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                            C0PHW c0phwLIZJ = ((C639840P7u) C0Q3E.LJI().jy().LIZJ()).LL.LIZJ();
                            if (c0phwLIZJ != null) {
                                C0PHX c0phx = c0phwLIZJ.LIZJ;
                                c0phx.LJ();
                                String str2 = c0phx.LJIIIZ;
                                C0P7A c0p7a = c0phwLIZJ.LIZIZ.LJIIIZ;
                                String str3 = c0phwLIZJ.LIZ;
                                C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(Aweme.class));
                                if (c640970PCd != null && (map2 = c640970PCd.LIZIZ) != null) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str3);
                                    sbLIZ.append(str2);
                                    obj2 = map2.get(C2188811AlT.LIZIZ(sbLIZ));
                                } else {
                                    obj2 = null;
                                }
                                aweme = (Aweme) obj2;
                                if (aweme == null) {
                                    C0PHX c0phx2 = c0phwLIZJ.LIZJ;
                                    C0P7A c0p7a2 = c0phx2.LIZ.LJIIIZ;
                                    c0phx2.LJ();
                                    String str4 = c0phx2.LJIIIZ;
                                    C640970PCd c640970PCd2 = c0p7a2.LIZ.get(C13LE.LIZ(Aweme.class));
                                    if (c640970PCd2 != null && (map = c640970PCd2.LIZ) != null) {
                                        obj3 = map.get(str4);
                                    } else {
                                        obj3 = null;
                                    }
                                    aweme = (Aweme) obj3;
                                }
                            } else {
                                aweme = null;
                            }
                            c1331670kl3LJIIIIZZ.LJJJIL = new C658730Psd(0, aweme, 0, ((C0PRC) C0Q3E.LJ(this).Ph1().LIZJ()).LLILLL, false, SearchResultPictureSrExperiment.LIZ(), 0, null, false, 960);
                            c1331670kl3LJIIIIZZ.LJJI(imageView);
                            c1331670kl3LJIIIIZZ.LJIIJJI();
                        }
                    }
                    TuxTextView tuxTextView = (TuxTextView) this.LLLIIII.getValue();
                    if (tuxTextView != null) {
                        HandlerHook.viewPost(tuxTextView, new ARunnableS5S1300000_4(tuxTextView, tuxTextView.getPaint(), ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLIZLLLIL, this, 8));
                    }
                    TuxTextView tuxTextView2 = (TuxTextView) this.LLLIIIIL.getValue();
                    if (tuxTextView2 != null) {
                        if (Intrinsics.LJFF(C308570C7r.LIZ.getValue(), 1)) {
                            tuxTextView2.setText(tuxTextView2.getContext().getString(2131839051));
                        }
                        if (Intrinsics.LJFF(C308610C7v.LIZ.getValue(), 2)) {
                            C0PXI.LIZ(tuxTextView2);
                            C0PXI.LIZIZ(tuxTextView2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                            ViewGroup.LayoutParams layoutParams = tuxTextView2.getLayoutParams();
                            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (marginLayoutParams != null) {
                                    marginLayoutParams.setMarginEnd(iLIZIZ);
                                }
                            } else {
                                marginLayoutParams = null;
                            }
                            C786410Ut5.R6(tuxTextView2, marginLayoutParams);
                        }
                    }
                }
            }
            C0PYH value2 = c01gw.getValue();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj4 = c724270Sb32.LL;
            } else {
                obj4 = null;
            }
            value2.getClass();
            this.LLJLLIL = C0PYH.LIZ((VideoItemParams) obj4);
            View view2 = (View) this.LLLI.getValue();
            if (view2 != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                if (((Number) C308440C7e.LIZ.getValue()).intValue() == 5) {
                    i2 = 14;
                } else {
                    i2 = 12;
                }
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(i2));
                if (C308610C7v.LIZ()) {
                    i3 = R.attr.e1;
                } else {
                    i3 = R.attr.a3e;
                }
                c384050F3z2.LIZIZ = Integer.valueOf(i3);
                view2.setBackground(c384050F3z2.LIZ(view2.getContext()));
                if (Intrinsics.LJFF(C308610C7v.LIZ.getValue(), 2)) {
                    view2.setPaddingRelative(0, view2.getPaddingTop(), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                }
                if (!C308610C7v.LIZ()) {
                    View view3 = (View) this.LLLIIL.getValue();
                    if (view3 != null) {
                        C430110Gtl.LIZ(view3, new AwS554S0100000_10(this, 1319));
                    }
                    View view4 = (View) this.LLLFZ.getValue();
                    if (view4 != null) {
                        ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            i4 = marginLayoutParams2.topMargin;
                        }
                        if (i4 <= 0.0f) {
                            C430110Gtl.LIZ(view2, new AwS411S0200000_10(this, view4, 125));
                        }
                    }
                } else {
                    C724270Sb3 c724270Sb33 = this.LLJI;
                    if (c724270Sb33 != null) {
                        obj5 = c724270Sb33.LL;
                    }
                    C0PXE c0pxe = ((C0PYD) C0Q3E.LIZJ(((VideoItemParams) obj5).getAweme()).Y30().LIZJ()).LLILZ;
                    if (c0pxe != null && (num = c0pxe.LJ) != null && (iIntValue = num.intValue()) > 0) {
                        C661350Pwr.LJIIJJI(iIntValue, view2);
                    } else {
                        C430110Gtl.LIZ(view2, new AwS254S0300000_10(this, view2, c0pxe, 25));
                    }
                }
            }
            View view5 = this.LLJLL;
            if (view5 != null) {
                HandlerHook.viewPost(view5, new ARunnableS110S0100000_10(this, 199));
            }
            View view6 = this.LLJLL;
            if (view6 != null) {
                C430110Gtl.LIZ(view6, new AwS554S0100000_10(this, 1318));
                return;
            }
            return;
        }
        View view7 = this.LLJLL;
        if (view7 != null) {
            C661350Pwr.LIZJ(view7);
        } else {
            C661350Pwr.LIZJ(this.LLJLILLLLZIIL);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void rsCardMotionEvent(C737030Svd c737030Svd) {
        String string;
        if (hp() && this.LLL) {
            int i = c737030Svd.LIZ;
            if (i != 66) {
                if (i != 90) {
                    if (i == 94) {
                        ep("click_rs_card");
                        return;
                    }
                    return;
                }
                Bundle bundle = c737030Svd.LIZJ;
                if (bundle == null || (string = bundle.getString("search_bar_click_region")) == null) {
                    string = "";
                }
                if (string.length() <= 0) {
                    return;
                }
                ep(string);
                return;
            }
            ep("return");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01eb  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1(int r36, com.ss.android.ugc.aweme.feed.model.Aweme r37) {
        /*
            Method dump skipped, instruction units count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.detail.relatedsearch.ui.SearchDetailRelatedSearchCellComponent.J1(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
