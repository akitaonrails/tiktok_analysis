package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share;

import X.AbstractC1372680lpC;
import X.AbstractC1372690lpD;
import X.C1369610lkF;
import X.C1369950lkn;
import X.C1370200llC;
import X.C1371600lnS;
import X.C1371880lnu;
import X.C1372100loG;
import X.C13LE;
import X.EnumC1369700lkO;
import X.EnumC1369720lkQ;
import X.InterfaceC1366490lfD;
import X.InterfaceC1369790lkX;
import X.InterfaceC1370310llN;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageShareModel;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageSharePackage;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public final class SearchImageShareConfiguration extends TTShareDefaultConfig<SearchImageSharePackage> {
    public static final C1372100loG LLILLJJLI = new AbstractC1372690lpD(C13LE.LIZ(SearchImageSharePackage.class)) { // from class: X.0loG
        public final String LIZ = "search_image_share";
        public final C13IQ<? extends BaseSharePackage> LIZIZ;

        @Override // X.AbstractC1372680lpC
        public final C13IQ<? extends BaseSharePackage> LIZ() {
            return this.LIZIZ;
        }

        @Override // X.AbstractC1372680lpC
        public final String LIZIZ() {
            return this.LIZ;
        }

        {
            this.LIZIZ = c19719912Dl;
        }
    };

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage) {
        return new TTCustomSharePanelBarProtocol() { // from class: com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageShareConfiguration$getCustomSharePanelBar$1
            @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
            public final EnumC1369720lkQ FM() {
                return EnumC1369720lkQ.VERTICAL;
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
            public final EnumC1369700lkO sG() {
                return EnumC1369700lkO.BOTTOM;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SharePanelLogicProtocol LJ(final BaseSharePackage baseSharePackage) {
        return new TTSharePanelLogicProtocol(baseSharePackage) { // from class: com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageShareConfiguration$getSharePanelLogicProtocol$protocol$1
            public final C1369950lkn LLILLJJLI;
            public final C1371880lnu LLILLL;

            @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
            public final InterfaceC1366490lfD T72() {
                return this.LLILLL;
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
            public final C1369950lkn getUiConfig() {
                return this.LLILLJJLI;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [X.0lnu] */
            {
                C1369950lkn c1369950lkn = new C1369950lkn();
                c1369950lkn.LIZ = 0.6f;
                c1369950lkn.LIZLLL = true;
                c1369950lkn.LJ = Collections.singletonList("share_channel");
                this.LLILLJJLI = c1369950lkn;
                this.LLILLL = new InterfaceC1366490lfD() { // from class: X.0lnu
                    @Override // X.InterfaceC1361850lXj
                    public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage2, Context context) {
                    }

                    @Override // X.InterfaceC1366490lfD
                    public final void LIZIZ(Context context, BaseSharePackage baseSharePackage2, InterfaceC1370310llN interfaceC1370310llN) {
                    }

                    @Override // X.InterfaceC1366490lfD
                    public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
                    }

                    @Override // X.InterfaceC1366490lfD
                    public final void LIZLLL(Context context, BaseSharePackage baseSharePackage2) {
                    }

                    @Override // X.InterfaceC1366490lfD
                    public final void LJ(Context context, BaseSharePackage baseSharePackage2) {
                    }

                    @Override // X.InterfaceC1366490lfD
                    public final void LJFF(Context context, BaseSharePackage baseSharePackage2, List list) {
                    }

                    @Override // X.InterfaceC1366490lfD
                    public final void LJI(Context context, BaseSharePackage baseSharePackage2) {
                    }

                    @Override // X.InterfaceC1361850lXj
                    public final Object LJII(Context context, BaseSharePackage baseSharePackage2, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                        Unit unit = Unit.LIZ;
                        C099R.LJFF();
                        return unit;
                    }
                };
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, X.InterfaceC1372360log
            public final void tu(C1371600lnS c1371600lnS) {
                super.tu(c1371600lnS);
                c1371600lnS.LJJIIZ = true;
                c1371600lnS.LIZIZ = EnumC1369720lkQ.COLLAPSE;
                c1371600lnS.LJJLL = Boolean.FALSE;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SheetActionProtocol LJI(final BaseSharePackage baseSharePackage) {
        return new TTSheetActionProtocol(baseSharePackage) { // from class: com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageShareConfiguration$getSheetActionProtocol$1
            public final C1370200llC LLILLJJLI;

            @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
            public final C1370200llC getUiConfig() {
                return this.LLILLJJLI;
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
            public final EnumC1369700lkO zT0() {
                return EnumC1369700lkO.TOP;
            }

            {
                C1370200llC c1370200llC = new C1370200llC();
                c1370200llC.LIZJ = true;
                this.LLILLJJLI = c1370200llC;
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
            public final List<InterfaceC1370310llN> uO1(BaseSharePackage baseSharePackage2) {
                SearchImageSharePackage searchImageSharePackage;
                SearchImageShareModel searchImageShareModel;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new InterfaceC1370310llN() { // from class: X.0Qr3
                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return R.raw.icon_flag_fill;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return R.raw.icon_flag_fill;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage3) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage3) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return R.attr.a1j;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage3) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return R.string.s65;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "search_image_report";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage3) {
                        SearchImageSharePackage searchImageSharePackage2;
                        Fragment fragment;
                        View view;
                        String imageUrl;
                        String value;
                        SearchImageShareModel searchImageShareModel2;
                        String str;
                        String str2 = null;
                        if ((baseSharePackage3 instanceof SearchImageSharePackage) && (searchImageSharePackage2 = (SearchImageSharePackage) baseSharePackage3) != null && C1388190mED.LIZ(context) != null) {
                            Map<String, String> map = searchImageSharePackage2.mobParams;
                            if (map != null) {
                                str2 = map.get("enter_from");
                            }
                            C14TF c14tf = C14TF.LIZIZ;
                            if (c14tf.LJJJJIZL(str2)) {
                                c14tf.LJJIIJZLJL(searchImageSharePackage2.mobParams);
                                return;
                            }
                            C1731606qI.LIZ.getClass();
                            WeakReference<Fragment> weakReference = C1731606qI.LIZIZ;
                            if (weakReference == null || (fragment = weakReference.get()) == null || (view = fragment.getView()) == null) {
                                return;
                            }
                            Pair[] pairArr = new Pair[1];
                            ImageData imageData = searchImageSharePackage2.imageData;
                            if (imageData == null || (imageUrl = imageData.getImageUrl()) == null) {
                                imageUrl = "";
                            }
                            pairArr[0] = new Pair("img_url", imageUrl);
                            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                            Map<String, String> map2 = searchImageSharePackage2.mobParams;
                            if (map2 != null) {
                                for (Map.Entry<String, String> entry : map2.entrySet()) {
                                    String value2 = entry.getValue();
                                    if (value2 != null) {
                                        mapLJIIJ.put(entry.getKey(), value2);
                                    }
                                }
                            }
                            if (C301510Brp.LIZ() && (searchImageShareModel2 = searchImageSharePackage2.imageModel) != null && (str = searchImageShareModel2.feedbackType) != null && str.length() != 0) {
                                value = searchImageSharePackage2.imageModel.feedbackType;
                            } else {
                                value = EnumC682590Qq1.MULTI_VIDEO.getValue();
                            }
                            boolean z = C0Q9J.LIZ;
                            C684120QsU.LIZIZ(view, new C683220Qr2(value, null, null, C684120QsU.LIZLLL(value), mapLJIIJ, null, null, null, false, false, false, true, null, null, null, 522214), false, null, null, 28);
                        }
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage3) {
                        C1370320llO.LIZ(this, view, baseSharePackage3);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage3) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage3);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage3) {
                        C1370320llO.LIZLLL(context, baseSharePackage3, this);
                    }
                });
                if ((baseSharePackage2 instanceof SearchImageSharePackage) && (searchImageSharePackage = (SearchImageSharePackage) baseSharePackage2) != null && (searchImageShareModel = searchImageSharePackage.imageModel) != null && searchImageShareModel.hideDownloadAction) {
                    return arrayList;
                }
                arrayList.add(new InterfaceC1370310llN() { // from class: X.0Qr5
                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return R.raw.icon_arrow_down_to_line_bold;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return R.raw.icon_2pt_arrow_to_bottom;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage3) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage3) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return R.attr.a1j;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage3) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return R.string.sg8;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "search_image_download";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILIIL(final Context context, BaseSharePackage baseSharePackage3) {
                        SearchImageSharePackage searchImageSharePackage2;
                        ImageData imageData;
                        if (!(baseSharePackage3 instanceof SearchImageSharePackage) || (searchImageSharePackage2 = (SearchImageSharePackage) baseSharePackage3) == null || (imageData = searchImageSharePackage2.imageData) == null) {
                            return;
                        }
                        C684650QtL c684650QtL = C684650QtL.LIZ;
                        WeakReference weakReference = new WeakReference(context);
                        String imageUrl = imageData.getImageUrl();
                        InterfaceC684660QtM interfaceC684660QtM = new InterfaceC684660QtM() { // from class: X.0Qr6
                            @Override // X.InterfaceC684660QtM
                            public final void onFailure() {
                                Activity activityLIZ = C1388190mED.LIZ(context);
                                if (activityLIZ != null) {
                                    C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                                    c1389880mGw.LJIIIIZZ(2131832379);
                                    c1389880mGw.LJ(R.raw.icon_x_mark);
                                    c1389880mGw.LJI(R.attr.zi);
                                    c1389880mGw.LJIIJ();
                                }
                            }

                            @Override // X.InterfaceC684660QtM
                            public final void LIZ(File file) {
                                Activity activityLIZ = C1388190mED.LIZ(context);
                                if (activityLIZ != null) {
                                    Context context2 = context;
                                    if (file != null && file.exists()) {
                                        C684650QtL.LIZ.getClass();
                                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C09NA(context2, file, null), 3);
                                        C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                                        c1389880mGw.LJIIIIZZ(R.string.hz2);
                                        c1389880mGw.LJ(R.raw.icon_tick);
                                        c1389880mGw.LJI(R.attr.zi);
                                        c1389880mGw.LJIIJ();
                                    }
                                }
                            }
                        };
                        c684650QtL.getClass();
                        C684650QtL.LIZ(weakReference, imageUrl, interfaceC684660QtM);
                        ((SearchImageSharePackage) baseSharePackage3).searchNimbleImageMob.LJ("click_download", imageData);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage3) {
                        C1370320llO.LIZ(this, view, baseSharePackage3);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage3) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage3);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage3) {
                        C1370320llO.LIZLLL(context, baseSharePackage3, this);
                    }
                });
                return arrayList;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LIZJ(Context context, final BaseSharePackage baseSharePackage) {
        return new TTShareChannelProtocol(baseSharePackage) { // from class: com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageShareConfiguration$getShareChannelProtocol$1
            public final C1369610lkF LLILLL;

            @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
            public final List<InterfaceC1369790lkX> KB0() {
                return super.KB0();
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
            public final C1369610lkF getUiConfig() {
                return this.LLILLL;
            }

            {
                C1369610lkF c1369610lkF = new C1369610lkF();
                c1369610lkF.LIZIZ = true;
                this.LLILLL = c1369610lkF;
            }
        };
    }
}
