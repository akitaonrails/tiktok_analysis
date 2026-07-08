package com.ss.android.ugc.aweme.search.pages.result.topsearch.helppost.ui;

import X.C01GW;
import X.C079P;
import X.C0HHT;
import X.C0PAU;
import X.C0PCY;
import X.C0PDE;
import X.C0PDF;
import X.C0PRC;
import X.C0Q6Y;
import X.C1102304Sv;
import X.C1102404Sw;
import X.C1308910kAL;
import X.C1378990lzN;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1443560nfW;
import X.C1448620nng;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1839807Im;
import X.C1849520yEI;
import X.C19719912Dl;
import X.C19EG;
import X.C1EQL;
import X.C21415018rM;
import X.C21627319kV;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C431830GwX;
import X.C444830HcP;
import X.C444840HcQ;
import X.C452501pT;
import X.C572370Mcd;
import X.C645930PVf;
import X.C650240Pew;
import X.C657890PrH;
import X.C664860Q6a;
import X.C664890Q6d;
import X.C664940Q6i;
import X.C679340Qkm;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC663030PzZ;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC645880PVa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import Y.AObserverS175S0200000_10;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.helppost.SearchHelpPostCardViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.helppost.model.SearchHelpPostCard;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService;
import com.ss.android.ugc.aweme.services.external.ability.TextToImageRouteParams;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import g1c.AjS65S0100000_10;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS219S0300000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHelpPostCardContentAssem extends ReusedUISlotAssem<SearchHelpPostCardContentAssem> implements InterfaceC712990Rxx<C657890PrH>, View.OnClickListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIIL;
    public ViewGroup LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxIconView LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public C21415018rM LLJLL;
    public C21415018rM LLJLLIL;
    public C1849520yEI LLJLLL;
    public LinearLayout LLJZ;
    public TuxIconView LLJZIJLIL;
    public TuxTextView LLL;
    public LinearLayout LLLF;
    public TuxTextView LLLFF;
    public TuxIconView LLLFFI;
    public C657890PrH LLLFZ;
    public final IAccountService LLLI = (IAccountService) ServiceManager.get().getService(IAccountService.class);
    public String LLLII;
    public C444830HcP LLLIIII;
    public C444830HcP LLLIIIIL;
    public boolean LLLIIIL;
    public final boolean LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final InterfaceC1731706qJ LLLILZ;
    public final IAVPublishService LLLILZJ;
    public SearchStartViewModel LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final int LLLJ;
    public final int LLLJIL;
    public final int LLLJL;
    public final float LLLL;
    public int LLLLII;
    public int LLLLIIIILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchHelpPostCardContentAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/search/pages/result/topsearch/helppost/SearchHelpPostCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchHelpPostCardContentAssem() {
        boolean z = ((Number) C1102304Sv.LIZ.getValue()).intValue() == 1;
        this.LLLIIL = z;
        this.LLLIILIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 766));
        this.LLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 764));
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchHelpPostCardViewModel.class);
        this.LLLILZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 767), null, AFwS241S0000000_10.get$arr$(347));
        IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
        this.LLLILZJ = iExternalService != null ? iExternalService.publishService() : null;
        this.LLLIZZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 765));
        this.LLLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(z ? 4 : 2));
        this.LLLJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(z ? 21 : 16)));
        this.LLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.etr;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SearchHelpPostCardViewModel tp() {
        return (SearchHelpPostCardViewModel) this.LLLILZ.getValue(this, LLLLIIL[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final EnumC663030PzZ enumC663030PzZ;
        String curUserId;
        String str;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        IOpenTextToImageService iOpenTextToImageServiceOpenTextToImageService;
        String str2;
        int i;
        SearchMixFeed searchMixFeed;
        SearchHelpPostCard searchHelpPostCard;
        C0PCY<C0PRC> c0pcyPh12;
        C0PRC c0prc2;
        int i2;
        C0PCY<C0PRC> c0pcyPh13;
        C0PRC c0prc3;
        String str3;
        SearchMixFeed searchMixFeed2;
        SearchHelpPostCard searchHelpPostCard2;
        SearchMixFeed searchMixFeed3;
        SearchHelpPostCard searchHelpPostCard3;
        AccountUserService accountUserServiceLJIIJ;
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.nhe) {
            enumC663030PzZ = EnumC663030PzZ.CLICK_HELP_POST_POST_BUTTON;
        } else if (id == R.id.nhg || id == R.id.yyp) {
            enumC663030PzZ = EnumC663030PzZ.CLICK_HELP_POST_TITLE;
        } else if (id == R.id.nhf) {
            enumC663030PzZ = EnumC663030PzZ.CLICK_HELP_POST_QUESTION;
        } else {
            enumC663030PzZ = EnumC663030PzZ.DEFAULT;
        }
        SearchHelpPostCardViewModel searchHelpPostCardViewModelTp = tp();
        Context context = getContentView().getContext();
        final C657890PrH c657890PrH = this.LLLFZ;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLLIILIL.getValue();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        IAccountService iAccountService = this.LLLI;
        String str4 = "";
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            curUserId = "";
        } else {
            curUserId = accountUserServiceLJIIJ.getCurUserId();
        }
        String str5 = this.LLLII;
        if (str5 == null) {
            str5 = "";
        }
        searchHelpPostCardViewModelTp.getClass();
        if (context != null) {
            String string = UUID.randomUUID().toString();
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                int i3 = 1;
                if (creativeToolsPluginService == null || creativeToolsPluginService.LIZJ(activityLIZ, "mt_help_post_card_search", true)) {
                    if (iSearchContextAbility != null) {
                        iSearchContextAbility.fe(new C664940Q6i(string, i3));
                    }
                    C657890PrH c657890PrH2 = searchHelpPostCardViewModelTp.getState().LL;
                    if (c657890PrH2 == null || (searchMixFeed3 = c657890PrH2.LL) == null || (searchHelpPostCard3 = searchMixFeed3.getSearchHelpPostCard()) == null || (str = searchHelpPostCard3.question) == null) {
                        str = "";
                    }
                    ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
                    if (!((Boolean) C079P.LIZ.getValue()).booleanValue()) {
                        i3 = 0;
                    }
                    if (i3 != 0 && iTextToImageService != null) {
                        Bundle bundle = new Bundle();
                        searchHelpPostCardViewModelTp.withState(new AwS219S0300000_10(iSearchContextAbility, bundle, interfaceC665370Q7zLJIIL, 26));
                        Bundle bundle2 = new Bundle();
                        C786410Ut5.LJJJI("card_id", str5, bundle2);
                        C657890PrH c657890PrH3 = searchHelpPostCardViewModelTp.getState().LL;
                        if (c657890PrH3 != null && (searchMixFeed2 = c657890PrH3.LL) != null && (searchHelpPostCard2 = searchMixFeed2.getSearchHelpPostCard()) != null) {
                            i2 = searchHelpPostCard2.editPageStyle;
                        } else {
                            i2 = 0;
                        }
                        bundle2.putInt("HELP_POST_EDIT_STYLE", i2);
                        boolean zLIZ = C1102404Sw.LIZ();
                        String string2 = context.getString(2131835488);
                        Bundle bundle3 = new Bundle();
                        C786410Ut5.LJJJI("is_landing_search_before", "1", bundle3);
                        if (!(activityLIZ instanceof SearchResultActivity)) {
                            C786410Ut5.LJJJI("is_from_publish", "1", bundle3);
                            C786410Ut5.LJJJI("in_single_stack", "1", bundle3);
                        }
                        if (iSearchContextAbility != null && (c0pcyPh13 = iSearchContextAbility.Ph1()) != null && (c0prc3 = (C0PRC) c0pcyPh13.LIZJ()) != null && (str3 = c0prc3.LLIZLLLIL) != null) {
                            str4 = str3;
                        }
                        boolean z = false;
                        Boolean bool = Boolean.TRUE;
                        C0Q6Y.LIZ(iTextToImageService, activityLIZ, new ForwardMedia(null, 0, null, "general_search", "mt_help_post_card_search", null, 0.0f, null, null, null, 0L, 0, null, false, null, null, null, null, false, null, null, null, null, null, string, 16777191, null), new C572370Mcd(null, 0 == true ? 1 : 0, z, string, "search", str, "mt_help_post_card_search", "general_search", bundle, bundle2, zLIZ, z, true, string2, bool, bool, bundle3, "aweme://search", str4, z, 524295, 0 == true ? 1 : 0), null, new AwS376S0200000_10(activityLIZ, interfaceC665370Q7zLJIIL, 130), 8);
                    } else {
                        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                        if (iExternalService != null && (iOpenTextToImageServiceOpenTextToImageService = iExternalService.openTextToImageService()) != null) {
                            boolean zLIZ2 = C1102404Sw.LIZ();
                            Bundle bundle4 = new Bundle();
                            C786410Ut5.LJJJI("is_landing_search_before", "1", bundle4);
                            if (!(activityLIZ instanceof SearchResultActivity)) {
                                C786410Ut5.LJJJI("is_from_publish", "1", bundle4);
                                C786410Ut5.LJJJI("in_single_stack", "1", bundle4);
                            }
                            if (iSearchContextAbility == null || (c0pcyPh12 = iSearchContextAbility.Ph1()) == null || (c0prc2 = (C0PRC) c0pcyPh12.LIZJ()) == null || (str2 = c0prc2.LLIZLLLIL) == null) {
                                str2 = "";
                            }
                            Bundle bundle5 = new Bundle();
                            searchHelpPostCardViewModelTp.withState(new AwS376S0200000_10(bundle5, iSearchContextAbility, 131));
                            Bundle bundle6 = new Bundle();
                            C786410Ut5.LJJJI("card_id", str5, bundle6);
                            C657890PrH c657890PrH4 = searchHelpPostCardViewModelTp.getState().LL;
                            if (c657890PrH4 != null && (searchMixFeed = c657890PrH4.LL) != null && (searchHelpPostCard = searchMixFeed.getSearchHelpPostCard()) != null) {
                                i = searchHelpPostCard.editPageStyle;
                            } else {
                                i = 0;
                            }
                            bundle6.putInt("HELP_POST_EDIT_STYLE", i);
                            String string3 = context.getString(2131835488);
                            Boolean bool2 = Boolean.TRUE;
                            iOpenTextToImageServiceOpenTextToImageService.openTextToImage(activityLIZ, str, "general_search", new TextToImageRouteParams(string, str2, "mt_help_post_card_search", bool2, bool2, bundle4, "aweme://search", bundle5, bundle6, false, true, string3, false, zLIZ2, "search", null, null, null, null, null, null, null, 0, null, null, null, null, null, null, false, null, 2147450880, null));
                        }
                        C664860Q6a c664860Q6a = new C664860Q6a();
                        c664860Q6a.LJIIZILJ("enter_method", "click_help_post");
                        c664860Q6a.LJIJJ("general_search");
                        c664860Q6a.LJIIZILJ("shoot_way", "mt_help_post_card_search");
                        c664860Q6a.LJIIZILJ("creation_id", string);
                        c664860Q6a.LJIIZILJ("search_type", "general");
                        C645930PVf.LIZ(c664860Q6a);
                        if (iSearchContextAbility != null && (c0pcyPh1 = iSearchContextAbility.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
                            c664860Q6a.LJJIIZI(c0prc.LLILLL);
                            c664860Q6a.LJIIZILJ("search_keyword", c0prc.LLIZLLLIL);
                        }
                        C1448620nng.LIZ(new C1EQL(c664860Q6a));
                        c664860Q6a.LJJIJL(C1443560nfW.LIZIZ);
                        String str6 = ((SearchServiceCenter$MobAbility) C1558520qew.LIZJ(interfaceC665370Q7zLJIIL, SearchServiceCenter$MobAbility.class)).XE0().get("search_result_id");
                        if (str6 != null) {
                            str4 = str6;
                        }
                        c664860Q6a.LJJIJIIJI(str4);
                        c664860Q6a.LJIILJJIL();
                    }
                }
            }
            SearchServiceCenter$MobAbility searchServiceCenter$MobAbility = (SearchServiceCenter$MobAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, SearchServiceCenter$MobAbility.class, null);
            if (searchServiceCenter$MobAbility != null) {
                searchServiceCenter$MobAbility.Nj1(new InterfaceC645880PVa(c657890PrH, enumC663030PzZ) { // from class: X.0PzX
                    public final C650430PfF LL;

                    @Override // X.InterfaceC645880PVa
                    public final boolean LLJJJIL() {
                        return false;
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return null;
                    }

                    @Override // X.InterfaceC645880PVa
                    public final C650430PfF LLIZLLLIL() {
                        return this.LL;
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return Intrinsics.LJFF(interfaceC1891350zJl, this);
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return Intrinsics.LJFF(interfaceC1891350zJl, this);
                    }

                    {
                        this.LL = new C650430PfF(new AwS376S0200000_10(c657890PrH, enumC663030PzZ, 132));
                    }
                });
            }
            if (iSearchContextAbility != null) {
                iSearchContextAbility.fe(new C664890Q6d(curUserId, str5));
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(final View view) {
        NextLiveData<Integer> nextLiveDataYQ2;
        ViewModelProvider viewModelProviderLIZIZ;
        SearchStateViewModel searchStateViewModel;
        MutableLiveData<Integer> mutableLiveData;
        ViewModelProvider viewModelProviderLIZIZ2;
        ViewGroup viewGroup;
        LinearLayout linearLayout;
        int iIntValue;
        C650240Pew c650240Pew = C650240Pew.LIZ;
        Context context = view.getContext();
        c650240Pew.getClass();
        int iLIZJ = C650240Pew.LIZJ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LLLLII = iLIZJ;
        this.LLLLIIIILLL = iLIZJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLJJLIIIJLLLLLLLZ = (ViewGroup) view.findViewById(R.id.dyp);
        this.LLJL = (TuxTextView) view.findViewById(R.id.yyq);
        this.LLJLIL = (TuxIconView) view.findViewById(R.id.y49);
        this.LLJLILLLLZIIL = (LinearLayout) view.findViewById(R.id.nhg);
        this.LLJLL = (C21415018rM) view.findViewById(R.id.yyp);
        this.LLJZ = (LinearLayout) view.findViewById(R.id.nhf);
        this.LLJZIJLIL = (TuxIconView) view.findViewById(R.id.y47);
        this.LLL = (TuxTextView) view.findViewById(R.id.y48);
        this.LLLF = (LinearLayout) view.findViewById(R.id.nhe);
        this.LLLFF = (TuxTextView) view.findViewById(R.id.xfo);
        this.LLLFFI = (TuxIconView) view.findViewById(R.id.y4_);
        this.LLJLLIL = (C21415018rM) view.findViewById(R.id.yyn);
        int iIntValue2 = 0;
        if (!this.LLLIIL) {
            C444830HcP c444830HcP = new C444830HcP();
            c444830HcP.LIZIZ.LJII = TextUtils.TruncateAt.END;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContentView().getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c444830HcP.LJIILJJIL(iIntValue);
            c444830HcP.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
            this.LLLIIII = c444830HcP;
        } else {
            C1849520yEI c1849520yEI = (C1849520yEI) view.findViewById(R.id.yyo);
            this.LLJLLL = c1849520yEI;
            if (c1849520yEI != null) {
                int visibility = c1849520yEI.getVisibility();
                c1849520yEI.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1849520yEI);
            }
            C21415018rM c21415018rM = this.LLJLLIL;
            if (c21415018rM != null) {
                C786410Ut5.LLLLZIL(c21415018rM, 8);
            }
            C1849520yEI c1849520yEI2 = this.LLJLLL;
            if (c1849520yEI2 != null) {
                c1849520yEI2.setIsNeedQuote(false);
            }
            C1849520yEI c1849520yEI3 = this.LLJLLL;
            if (c1849520yEI3 != null) {
                c1849520yEI3.setIsNeedImage(false);
            }
            C1849520yEI c1849520yEI4 = this.LLJLLL;
            if (c1849520yEI4 != null) {
                c1849520yEI4.setTextMaxWith(this.LLLLIIIILLL);
            }
        }
        Context context2 = getContext();
        if (context2 != null && (linearLayout = this.LLLF) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
            linearLayout.setBackground(c384050F3z.LIZ(context2));
        }
        SearchStartViewModel searchStartViewModel = null;
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(view, this, 65));
        C444830HcP c444830HcP2 = new C444830HcP();
        int i = this.LLLLII;
        C444840HcQ c444840HcQ = c444830HcP2.LIZIZ;
        c444840HcQ.LJ = i;
        c444840HcQ.LJII = TextUtils.TruncateAt.END;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, getContentView().getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        c444830HcP2.LJIILJJIL(iIntValue2);
        c444830HcP2.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
        this.LLLIIIIL = c444830HcP2;
        ViewGroup viewGroup2 = this.LLJJLIIIJLLLLLLLZ;
        if (viewGroup2 != null) {
            C786410Ut5.I7(new AjS65S0100000_10(this, 3), viewGroup2);
        }
        LinearLayout linearLayout2 = this.LLLF;
        if (linearLayout2 != null) {
            C786410Ut5.I7(new AjS65S0100000_10(this, 4), linearLayout2);
        }
        LinearLayout linearLayout3 = this.LLJLILLLLZIIL;
        if (linearLayout3 != null) {
            C786410Ut5.I7(new AjS65S0100000_10(this, 5), linearLayout3);
        }
        LinearLayout linearLayout4 = this.LLJZ;
        if (linearLayout4 != null) {
            C786410Ut5.I7(new AjS65S0100000_10(this, 6), linearLayout4);
        }
        C21415018rM c21415018rM2 = this.LLJLL;
        if (c21415018rM2 != null) {
            C786410Ut5.I7(new AjS65S0100000_10(this, 7), c21415018rM2);
        }
        if (C650240Pew.LIZ() && (viewGroup = this.LLJJLIIIJLLLLLLLZ) != null) {
            C1378990lzN.LIZIZ(viewGroup, Float.valueOf(C1839807Im.LIZ()), null, null, null, null, 30);
        }
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0Q6V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0Q6W) obj).LL;
            }
        }, C736820SvI.LJ(), new AwS624S0100000_10(view, 77), 4);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ != null && (viewModelProviderLIZIZ2 = C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19egLIZIZ)) != null) {
            searchStartViewModel = (SearchStartViewModel) viewModelProviderLIZIZ2.get(SearchStartViewModel.class);
        }
        this.LLLILZLLLI = searchStartViewModel;
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ2 != null && (viewModelProviderLIZIZ = C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19egLIZIZ2)) != null && (searchStateViewModel = (SearchStateViewModel) viewModelProviderLIZIZ.get(SearchStateViewModel.class)) != null && (mutableLiveData = searchStateViewModel.searchState) != null) {
            C0PDE c0pde = new C0PDE();
            c0pde.LL = new C0PDF() { // from class: X.0Q6X
                @Override // X.C0PDF
                public final void LIZ() {
                }

                @Override // X.C0PDF
                public final void LLFF() {
                }

                @Override // X.C0PDF
                public final void LIZIZ(boolean z) {
                    IAVPublishService iAVPublishService;
                    if (!z && (iAVPublishService = this.LLLILZJ) != null) {
                        iAVPublishService.hideProgress(C1388190mED.LIZIZ(view.getContext()));
                    }
                }
            };
            mutableLiveData.observe(this, c0pde);
        }
        SearchStartViewModel searchStartViewModel2 = this.LLLILZLLLI;
        if (searchStartViewModel2 != null && (nextLiveDataYQ2 = searchStartViewModel2.yQ2()) != null) {
            nextLiveDataYQ2.observe(this, new AObserverS175S0200000_10(this, view, 1));
        }
    }

    public final CharSequence op(CharSequence charSequence) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) charSequence);
        sbLIZ.append('.');
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        C419890GdH c419890GdH = new C419890GdH((Drawable) this.LLLIZZ.getValue(), 2);
        c419890GdH.LIZIZ(this.LLLJ, 0, C426750GoL.LJ(getContentView()));
        C786410Ut5.q2(spannableStringBuilder, c419890GdH, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        if (C21627319kV.LIZJ().LIZLLL(spannableStringBuilder)) {
            spannableStringBuilder.append((CharSequence) "\u200f");
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) "\u200e");
        return spannableStringBuilder;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C657890PrH c657890PrH) {
        Integer numD10;
        SearchMixFeed searchMixFeed;
        SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility;
        C657890PrH c657890PrH2 = c657890PrH;
        this.LLLFZ = c657890PrH2;
        SearchHelpPostCardViewModel searchHelpPostCardViewModelTp = tp();
        searchHelpPostCardViewModelTp.getClass();
        searchHelpPostCardViewModelTp.setState(new AwS589S0100000_10(c657890PrH2, 593));
        SearchHelpPostCardViewModel searchHelpPostCardViewModelTp2 = tp();
        C657890PrH c657890PrH3 = this.LLLFZ;
        String str = null;
        if (c657890PrH3 != null && (searchMixFeed = c657890PrH3.LL) != null && (searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) this.LLLIL.getValue()) != null) {
            numD10 = searchServiceCenter$AdapterControlAbility.D10(searchMixFeed);
        } else {
            numD10 = null;
        }
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLLIILIL.getValue();
        searchHelpPostCardViewModelTp2.getClass();
        if (iSearchContextAbility != null) {
            iSearchContextAbility.fe(new C0PAU(numD10));
            int i = 3;
            if (iSearchContextAbility != null) {
                iSearchContextAbility.fe(new C664940Q6i(str, i));
                iSearchContextAbility.fe(new C664940Q6i(str, i));
            }
        }
        searchHelpPostCardViewModelTp2.setState(new AwS589S0100000_10(numD10, 592));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C657890PrH c657890PrH) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C657890PrH c657890PrH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public static Layout up(CharSequence charSequence, C444830HcP c444830HcP, boolean z) {
        int i;
        int i2;
        int i3;
        c444830HcP.LJIILIIL(charSequence);
        if (z) {
            i = 6;
        } else {
            i = 5;
        }
        c444830HcP.LJIIIZ(i);
        if (z) {
            i2 = 23;
        } else {
            i2 = 21;
        }
        c444830HcP.LJII(i2);
        boolean z2 = C444830HcP.LJIIJJI;
        if (z) {
            i3 = 15;
        } else {
            i3 = 16;
        }
        return C444830HcP.LIZJ(c444830HcP, 0.0f, false, C431830GwX.LIZ(c444830HcP, 20, Integer.valueOf(i3)), 27);
    }

    public final C419910GdJ sp(Integer num, Integer num2, int i, int i2, int i3, int i4) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i2;
        if (num != null) {
            i3 = num.intValue();
        }
        c419910GdJ.LIZ = i3;
        if (num2 == null) {
            num2 = C1308910kAL.LIZJ(i4, getContentView().getContext());
        }
        c419910GdJ.LIZLLL = num2;
        return c419910GdJ;
    }
}
