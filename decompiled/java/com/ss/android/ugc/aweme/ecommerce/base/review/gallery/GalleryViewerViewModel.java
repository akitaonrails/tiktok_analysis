package com.ss.android.ugc.aweme.ecommerce.base.review.gallery;

import X.AnonymousClass0481;
import X.C03C8;
import X.C049Y;
import X.C04CK;
import X.C098200Yq;
import X.C09JN;
import X.C1019103yf;
import X.C11S5;
import X.C123100dR;
import X.C1389890mGx;
import X.C13BV;
import X.C1407080mig;
import X.C1407110mij;
import X.C15438062q;
import X.C1748720vbi;
import X.C1760600vus;
import X.C1760610vut;
import X.C1760620vuu;
import X.C1760770vv9;
import X.C1761230vvt;
import X.C1761290vvz;
import X.C1761300vw0;
import X.C1761470vwH;
import X.C189200o6;
import X.C23250099c;
import X.C259800zU;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C808003Dq;
import X.C814420VxA;
import X.EnumC1014603xw;
import X.EnumC1407150min;
import X.InterfaceC1761370vw7;
import X.InterfaceC420801kM;
import Y.AObjectS537S0100000_26;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewSourceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTransData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS348S0000000_26;
import kotlin.jvm.internal.AwS107S0201000_26;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.jvm.internal.AwS45S2100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.AwS8S0011000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class GalleryViewerViewModel extends ViewModel {
    public InterfaceC420801kM LL;
    public C1760620vuu LLILLJJLI;
    public C1761230vvt LLILLL;
    public String LLILZ;
    public Integer LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL;
    public String LLJILJIL;
    public String LLJILLL;
    public Integer LLJJIJIIJIL;
    public String LLJJIJIL;
    public boolean LLJJJ;
    public Integer LLJJJIL;
    public Integer LLJJJJ;
    public Integer LLJJJJJIL;
    public Integer LLJJJJLIIL;
    public boolean LLJJL;
    public final NextLiveData<Boolean> LLJ = new NextLiveData<>();
    public Integer LLJI = 1;
    public String LLJIJIL = "";
    public ArrayList<Integer> LLJILJILJ = new ArrayList<>();
    public final NextLiveData<Integer> LLJJ = new NextLiveData<>();
    public final NextLiveData<String> LLJJI = new NextLiveData<>();
    public final NextLiveData<CopyOnWriteArrayList<C1761300vw0>> LLJJIII = new NextLiveData<>();
    public final NextLiveData<C1761290vvz> LLJJIJI = new NextLiveData<>();
    public volatile boolean LLJJLIIIJLLLLLLLZ = true;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C1760620vuu c1760620vuu = this.LLILLJJLI;
        if (c1760620vuu != null) {
            c1760620vuu.LJIIJJI = null;
            if (c1760620vuu != null) {
                c1760620vuu.LJIIL = false;
                c1760620vuu.LJIILIIL = false;
            }
        }
        super.onCleared();
    }

    public final List<C1761300vw0> wQ2(Function1<? super C1761300vw0, Boolean> function1, Function1<? super C1761300vw0, C1761300vw0> function12) {
        CopyOnWriteArrayList<C1761300vw0> value = this.LLJJIII.getValue();
        if (value != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
            for (C1761300vw0 c1761300vw0Invoke : value) {
                if (function1.invoke(c1761300vw0Invoke).booleanValue()) {
                    c1761300vw0Invoke = function12.invoke(c1761300vw0Invoke);
                }
                arrayList.add(c1761300vw0Invoke);
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static void xQ2(View view, ReviewSourceInfo reviewSourceInfo, GalleryViewerFragment galleryViewerFragment) {
        Object c098200Yq;
        if (C123100dR.LIZ(reviewSourceInfo.link)) {
            try {
                SmartRouter.buildRoute(view.getContext(), UriProtector.parse(reviewSourceInfo.link).toString()).open();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1019103yf.LIZ(EnumC1014603xw.ERR10005, thM5exceptionOrNullimpl, null);
                return;
            }
            return;
        }
        if (C123100dR.LIZ(reviewSourceInfo.title) && reviewSourceInfo.content != null) {
            TuxTextView tuxTextView = new TuxTextView(view.getContext(), null, 6, 0);
            C03C8.LJ(tuxTextView, reviewSourceInfo.content, "INCENTIVE_INFO_CLICK", new AObjectS537S0100000_26(tuxTextView, 0));
            tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            try {
                FragmentManager childFragmentManager = galleryViewerFragment.getChildFragmentManager();
                if (childFragmentManager != null) {
                    C808003Dq.LJFF(C808003Dq.LIZLLL(tuxTextView, reviewSourceInfo.title, true, AFwS348S0000000_26.get$arr$(2), 20), childFragmentManager, null, null, 12);
                }
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0min] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    public final void DQ2(String str, InterfaceC1761370vw7 interfaceC1761370vw7, View view) {
        String str2;
        T t;
        C259800zU c259800zU = new C259800zU();
        ?? r0 = EnumC1407150min.NONE;
        c259800zU.element = r0;
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = r0;
        CopyOnWriteArrayList<C1761300vw0> value = this.LLJJIII.getValue();
        if (value != null) {
            while (true) {
                boolean z = false;
                for (C1761300vw0 c1761300vw0 : value) {
                    C1761290vvz c1761290vvz = c1761300vw0.LIZIZ;
                    if (c1761290vvz != null) {
                        str2 = c1761290vvz.LIZ;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, str)) {
                        EnumC1407150min enumC1407150min = c1761300vw0.LIZIZ.LJJI;
                        ?? r02 = enumC1407150min;
                        if (enumC1407150min == null) {
                            r02 = EnumC1407150min.NONE;
                        }
                        c259800zU.element = r02;
                        int i = C1407110mij.LIZ[r02.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                return;
                            } else {
                                t = EnumC1407150min.SHOW_TRANSLATION;
                            }
                        } else {
                            t = EnumC1407150min.SHOW_ORIGINAL;
                        }
                        c259800zU2.element = t;
                        if (c1761300vw0.LIZIZ.LJJIFFI != null) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    AQ2(str, (EnumC1407150min) c259800zU2.element, interfaceC1761370vw7, null, Boolean.FALSE);
                    return;
                }
            }
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1407080mig(this, str, c259800zU2, interfaceC1761370vw7, view, c259800zU, null), 3);
    }

    public final void yQ2(C1761470vwH c1761470vwH, boolean z, String str) {
        String str2;
        if (this.LLILLL != null) {
            if (z) {
                str2 = "review_see_more";
            } else {
                str2 = "review_see_less";
            }
            C1748720vbi.LIZLLL(c1761470vwH, new C049Y(), new AwS76S1000000_26(str2, 47));
        }
        if (this.LLJJIII.getValue() != null) {
            List<C1761300vw0> listWQ2 = wQ2(new AwS76S1000000_26(str, 48), new AwS38S0010000_26(z, 15));
            this.LLJJJ = true;
            this.LLJJIII.postValue(new CopyOnWriteArrayList<>(listWQ2));
        }
    }

    public final void AQ2(String str, EnumC1407150min enumC1407150min, InterfaceC1761370vw7 interfaceC1761370vw7, ReviewTransData reviewTransData, Boolean bool) {
        if (this.LLJJIII.getValue() != null) {
            List<C1761300vw0> listWQ2 = wQ2(new AwS76S1000000_26(str, 6), new AwS235S0300000_26(enumC1407150min, bool, reviewTransData, 12));
            this.LLJJJ = true;
            this.LLJJIII.postValue(new CopyOnWriteArrayList<>(listWQ2));
            Integer num = this.LLJJJIL;
            if (num != null) {
                interfaceC1761370vw7.onPageSelected(num.intValue());
            }
        }
    }

    public final void CQ2(String str, InterfaceC1761370vw7 interfaceC1761370vw7, View view, EnumC1407150min enumC1407150min, String str2) {
        if (view != null) {
            C1748720vbi.LIZLLL(view, new AnonymousClass0481(), new AwS45S2100000_26(str, enumC1407150min, str2, 5));
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
            c1389890mGx.LJII(R.attr.ee);
            c1389890mGx.LJIIIZ(2131857258);
            c1389890mGx.LIZLLL(1000L);
            c1389890mGx.LJIIJJI();
        }
        AQ2(str, enumC1407150min, interfaceC1761370vw7, null, Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2(X.InterfaceC1748820vbs r28, java.lang.String r29, int r30, int r31, java.lang.String r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel.zQ2(X.0vbs, java.lang.String, int, int, java.lang.String, boolean):void");
    }

    public final void vQ2(View view, String str, boolean z, int i, C1761290vvz c1761290vvz, int i2, InterfaceC1761370vw7 interfaceC1761370vw7) {
        int iMax;
        String str2;
        List<ReviewItemStruct> list;
        Object objRemove;
        String str3;
        List<ShopReviewItemStruct> list2;
        Object objRemove2;
        ReviewItemStruct.MainReview mainReview;
        C04CK c04ck;
        boolean z2 = !z;
        if (z2) {
            iMax = i + 1;
        } else {
            iMax = Math.max(i - 1, 0);
        }
        C1761230vvt c1761230vvt = this.LLILLL;
        if (c1761230vvt != null) {
            if (z2) {
                c04ck = new C04CK() { // from class: X.04Eh
                    @Override // X.AbstractC1748790vbp
                    public final C1748850vbv LIZ() {
                        return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("review_id", new C1747940vaS[0]), new C1748840vbu("rank", new C1747940vaS(new C1748000vaY("page_name", "product_review")), new C1747940vaS(new C1748000vaY("page_name", "shop_review"))), new C1748840vbu("sku_id", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("previous_page", new C1747940vaS[0]), new C1748840vbu("product_id", new C1747940vaS[0]), new C1748840vbu("page_show_type", new C1747940vaS(new C1748000vaY("photo_cnt", "review_photo"))), new C1748840vbu("is_self", new C1747940vaS[0]), new C1748840vbu("has_add_review", new C1747940vaS(new C1748000vaY("page_name", "product_review")), new C1747940vaS(new C1748000vaY("page_name", "shop_review"))), new C1748840vbu("rate", new C1747940vaS[0]), new C1748840vbu("text_type", new C1747940vaS[0]), new C1748840vbu("like_cnt", new C1747940vaS[0]), new C1748840vbu("post_date", new C1747940vaS[0]), new C1748840vbu("filter_name", new C1747940vaS(new C1748000vaY("page_name", "product_review")), new C1747940vaS(new C1748000vaY("page_name", "shop_review"))), new C1748840vbu("filter_id", new C1747940vaS(new C1748000vaY("page_name", "product_review")), new C1747940vaS(new C1748000vaY("page_name", "shop_review"))), new C1748840vbu("reply_cnt", new C1747940vaS(new C1748000vaY("page_name", "product_review")), new C1747940vaS(new C1748000vaY("page_name", "shop_review"))), new C1748840vbu("photo_cnt", new C1747940vaS(new C1748000vaY("page_name", "product_review")), new C1747940vaS(new C1748000vaY("page_name", "shop_review"))), new C1748840vbu("video_cnt", new C1747940vaS(new C1748000vaY("page_name", "product_review")), new C1747940vaS(new C1748000vaY("page_name", "shop_review"))), new C1748840vbu("is_anonymous", new C1747940vaS[0]), new C1748840vbu("biz_type", new C1747940vaS[0]), new C1748840vbu("title_len", new C1747940vaS[0]), new C1748840vbu("fit_info", new C1747940vaS[0]), new C1748840vbu("is_local", new C1747940vaS[0]), new C1748840vbu("is_third_party", new C1747940vaS[0]));
                    }
                };
            } else {
                c04ck = new C04CK() { // from class: X.04Eg
                    @Override // X.AbstractC1748790vbp
                    public final C1748850vbv LIZ() {
                        return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("review_id", new C1747940vaS[0]), new C1748840vbu("rank", new C1747940vaS(new C1748000vaY("page_name", "product_review")), new C1747940vaS(new C1748000vaY("page_name", "shop_review"))), new C1748840vbu("sku_id", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("previous_page", new C1747940vaS[0]), new C1748840vbu("product_id", new C1747940vaS[0]), new C1748840vbu("page_show_type", new C1747940vaS(new C1748000vaY("photo_cnt", "review_photo"))), new C1748840vbu("is_self", new C1747940vaS[0]), new C1748840vbu("photo_cnt", new C1747940vaS[0]), new C1748840vbu("video_cnt", new C1747940vaS[0]), new C1748840vbu("rate", new C1747940vaS[0]), new C1748840vbu("text_type", new C1747940vaS[0]), new C1748840vbu("like_cnt", new C1747940vaS[0]), new C1748840vbu("post_date", new C1747940vaS[0]), new C1748840vbu("filter_name", new C1747940vaS(new C1748000vaY("page_name", "product_review")), new C1747940vaS(new C1748000vaY("page_name", "shop_review"))), new C1748840vbu("filter_id", new C1747940vaS(new C1748000vaY("page_name", "product_review")), new C1747940vaS(new C1748000vaY("page_name", "shop_review"))), new C1748840vbu("reply_cnt", new C1747940vaS(new C1748000vaY("page_name", "product_review")), new C1747940vaS(new C1748000vaY("page_name", "shop_review"))), new C1748840vbu("has_add_review", new C1747940vaS(new C1748000vaY("page_name", "product_review")), new C1747940vaS(new C1748000vaY("page_name", "shop_review"))), new C1748840vbu("is_anonymous", new C1747940vaS[0]), new C1748840vbu("biz_type", new C1747940vaS[0]), new C1748840vbu("title_len", new C1747940vaS[0]), new C1748840vbu("fit_info", new C1747940vaS[0]), new C1748840vbu("is_local", new C1747940vaS[0]), new C1748840vbu("is_third_party", new C1747940vaS[0]));
                    }
                };
            }
            C1748720vbi.LIZLLL(view, c04ck, new AwS107S0201000_26(iMax, c1761290vvz, c1761230vvt, 6));
        }
        C1760620vuu c1760620vuu = this.LLILLJJLI;
        if (c1760620vuu != null) {
            if (i2 == 2) {
                C1760610vut c1760610vut = c1760620vuu.LJII;
                AwS35S0010000_22 awS35S0010000_22 = new AwS35S0010000_22(z2, 36);
                for (ListShopReviewData listShopReviewData : c1760610vut.LIZIZ.values()) {
                    List<ShopReviewItemStruct> list3 = listShopReviewData.reviewItems;
                    if (list3 != null) {
                        Iterator<ShopReviewItemStruct> it2 = list3.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            ReviewItemStruct reviewItemStruct = it2.next().reviewItemStruct;
                            if (reviewItemStruct != null && (mainReview = reviewItemStruct.review) != null) {
                                str3 = mainReview.reviewId;
                            } else {
                                str3 = null;
                            }
                            if (Intrinsics.LJFF(str3, str)) {
                                if (i3 != -1 && (list2 = listShopReviewData.reviewItems) != null && (objRemove2 = ListProtector.remove(list2, i3)) != null) {
                                    ListProtector.add(listShopReviewData.reviewItems, i3, awS35S0010000_22.invoke(objRemove2));
                                }
                            } else {
                                i3++;
                            }
                        }
                    }
                }
            } else {
                C1760600vus c1760600vus = c1760620vuu.LJI;
                AwS35S0010000_22 awS35S0010000_222 = new AwS35S0010000_22(z2, 35);
                for (ListReviewData listReviewData : c1760600vus.LIZIZ.values()) {
                    List<ReviewItemStruct> list4 = listReviewData.reviewItems;
                    if (list4 != null) {
                        Iterator<ReviewItemStruct> it3 = list4.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            ReviewItemStruct.MainReview mainReview2 = it3.next().review;
                            if (mainReview2 != null) {
                                str2 = mainReview2.reviewId;
                            } else {
                                str2 = null;
                            }
                            if (Intrinsics.LJFF(str2, str)) {
                                if (i4 != -1 && (list = listReviewData.reviewItems) != null && (objRemove = ListProtector.remove(list, i4)) != null) {
                                    ListProtector.add(listReviewData.reviewItems, i4, awS35S0010000_222.invoke(objRemove));
                                }
                            } else {
                                i4++;
                            }
                        }
                    }
                }
            }
            ReviewApi.LIZ.getClass();
            if (z2) {
                ((ReviewApi) C1760770vv9.LIZIZ.create(ReviewApi.class)).LIZIZ(new ReviewApi.ReviewDiggRequest(str)).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.00Pw
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("ReviewApi$Companion@4719.dig$1");
                        C1C7U.LIZIZ("ReviewApi$Companion@4719.dig$1");
                    }
                }, new C09JN() { // from class: X.00Px
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("ReviewApi$Companion@4719.dig$2");
                        C1C7U.LIZIZ("ReviewApi$Companion@4719.dig$2");
                    }
                });
            } else {
                ((ReviewApi) C1760770vv9.LIZIZ.create(ReviewApi.class)).LJFF(new ReviewApi.ReviewDiggRequest(str)).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.00Py
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("ReviewApi$Companion@4719.unDig$1");
                        C1C7U.LIZIZ("ReviewApi$Companion@4719.unDig$1");
                    }
                }, new C09JN() { // from class: X.00Pz
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("ReviewApi$Companion@4719.unDig$2");
                        C1C7U.LIZIZ("ReviewApi$Companion@4719.unDig$2");
                    }
                });
            }
        }
        if (this.LLJJIII.getValue() != null) {
            List<C1761300vw0> listWQ2 = wQ2(new AwS76S1000000_26(str, 5), new AwS8S0011000_26(iMax, z2, 0));
            this.LLJJJ = true;
            this.LLJJIII.postValue(new CopyOnWriteArrayList<>(listWQ2));
            Integer num = this.LLJJJIL;
            if (num != null) {
                interfaceC1761370vw7.onPageSelected(num.intValue());
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("review_id", str);
        jSONObject.put("is_digged", z2);
        jSONObject.put("digg_count", iMax);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_review_digg", C786410Ut5.J3(jSONObject));
    }
}
