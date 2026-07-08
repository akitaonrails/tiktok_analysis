package com.ss.android.ugc.aweme.poi.recommendfeature.detail.vm;

import X.AbstractC316870CbV;
import X.C1165730gRP;
import X.C1183080gtO;
import X.C1183090gtP;
import X.C1183170gtX;
import X.C1183190gtZ;
import X.C1183200gta;
import X.C1183210gtb;
import X.C13BV;
import X.C14EU;
import X.C15438062q;
import X.C2189821An6;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C622680Oba;
import X.C627660Ojc;
import X.C737030Svd;
import X.EnumC1183110gtR;
import X.InterfaceC0148002o;
import X.InterfaceC1181010gq3;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiRecommendFeatureDetailFeedItemData;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiRecommendFeatureDetailFeedModule;
import com.ss.android.ugc.aweme.slash.data.SlashEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS132S1100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailSharedViewModel extends BaseDetailShareVM<C1183080gtO, InterfaceC1891350zJl, C1183090gtP> {
    public static final /* synthetic */ int LLJIJIL = 0;
    public InterfaceC1181010gq3 LLILZIL;
    public C1183210gtb LLILZLL;
    public List<SlashEvent> LLIZ;
    public PoiRecommendFeatureDetailFeedModule LLIZLLLIL;
    public C1183090gtP LLJ = new C1183090gtP(CardStruct.IStatusCode.DEFAULT, null, false);
    public String LLJI;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 55;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String BQ2() {
        /*
            r6 = this;
            java.lang.String r0 = r6.LLJI
            if (r0 != 0) goto L7b
            java.util.List<com.ss.android.ugc.aweme.slash.data.SlashEvent> r0 = r6.LLIZ
            if (r0 == 0) goto L7b
            r4 = 0
            X.04rF r5 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L64
        Lf:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L62
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L64
            r0 = r2
            com.ss.android.ugc.aweme.slash.data.SlashEvent r0 = (com.ss.android.ugc.aweme.slash.data.SlashEvent) r0     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = "load_more"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto Lf
        L28:
            com.ss.android.ugc.aweme.slash.data.SlashEvent r2 = (com.ss.android.ugc.aweme.slash.data.SlashEvent) r2     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L60
            java.util.List r0 = r2.getActions()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L60
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L64
        L36:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L5e
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L64
            r0 = r2
            com.ss.android.ugc.aweme.slash.data.SlashEventAction r0 = (com.ss.android.ugc.aweme.slash.data.SlashEventAction) r0     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r0.type     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = "request"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L36
        L4d:
            com.ss.android.ugc.aweme.slash.data.SlashEventAction r2 = (com.ss.android.ugc.aweme.slash.data.SlashEventAction) r2     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L60
            com.ss.android.ugc.aweme.slash.data.SlashParam r0 = r2.slashParam     // Catch: java.lang.Throwable -> L64
        L53:
            r5.getClass()     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = X.C1227904rF.LJI(r0)     // Catch: java.lang.Throwable -> L64
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L64
            goto L70
        L5e:
            r2 = r4
            goto L4d
        L60:
            r0 = r4
            goto L53
        L62:
            r2 = r4
            goto L28
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L70:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L77
            r4 = r1
        L77:
            java.lang.String r4 = (java.lang.String) r4
            r6.LLJI = r4
        L7b:
            java.lang.String r0 = r6.LLJI
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.recommendfeature.detail.vm.PoiRecommendFeatureDetailSharedViewModel.BQ2():java.lang.String");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1183080gtO(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C622680Oba.LIZJ(this);
    }

    public final AbstractC316870CbV<C1183090gtP> DQ2(PoiRecommendFeatureDetailFeedModule poiRecommendFeatureDetailFeedModule) {
        InterfaceC1891350zJl c1183190gtZ;
        List<PoiRecommendFeatureDetailFeedItemData> items = poiRecommendFeatureDetailFeedModule.getItems();
        if (items != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(items, 10));
            Iterator<PoiRecommendFeatureDetailFeedItemData> it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().aweme);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL((Aweme) it3.next());
            }
        }
        List<PoiRecommendFeatureDetailFeedItemData> items2 = poiRecommendFeatureDetailFeedModule.getItems();
        if (items2 == null) {
            items2 = C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(items2, 10));
        for (PoiRecommendFeatureDetailFeedItemData poiRecommendFeatureDetailFeedItemData : items2) {
            Integer num = poiRecommendFeatureDetailFeedItemData.itemType;
            int value = EnumC1183110gtR.AWEME.getValue();
            if (num != null && num.intValue() == value) {
                c1183190gtZ = new C1183170gtX(poiRecommendFeatureDetailFeedItemData, 0);
            } else {
                int value2 = EnumC1183110gtR.REVIEW.getValue();
                if (num != null && num.intValue() == value2) {
                    if (poiRecommendFeatureDetailFeedItemData.hasCropAwemeCoverImage()) {
                        c1183190gtZ = new C1183200gta(poiRecommendFeatureDetailFeedItemData);
                    } else {
                        c1183190gtZ = new C1183190gtZ(poiRecommendFeatureDetailFeedItemData);
                    }
                } else {
                    c1183190gtZ = new C1183190gtZ(poiRecommendFeatureDetailFeedItemData);
                }
            }
            arrayList2.add(c1183190gtZ);
        }
        String nextCursor = poiRecommendFeatureDetailFeedModule.getNextCursor();
        if (nextCursor == null) {
            nextCursor = "";
        }
        C1183090gtP c1183090gtP = new C1183090gtP(nextCursor, poiRecommendFeatureDetailFeedModule.getDataVersion(), Intrinsics.LJFF(poiRecommendFeatureDetailFeedModule.getHasMore(), Boolean.TRUE));
        this.LLJ = c1183090gtP;
        if (c1183090gtP.hasMore) {
            return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, c1183090gtP, arrayList2, 1);
        }
        AbstractC316870CbV.LIZ.getClass();
        return new C316640Cb8(arrayList2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 442));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1183090gtP>> interfaceC1364105Vn) {
        PoiRecommendFeatureDetailFeedModule poiRecommendFeatureDetailFeedModule = this.LLIZLLLIL;
        if (poiRecommendFeatureDetailFeedModule == null) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Exception exc = new Exception("initial module is null");
            c317290CcB.getClass();
            return new C316650Cb9(exc);
        }
        return DQ2(poiRecommendFeatureDetailFeedModule);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String str;
        if (c737030Svd.LIZ == 13) {
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof String) && (str = (String) obj) != null && str.length() != 0) {
                withState(new AwS132S1100000_18(str, this, 10));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        String aid;
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                if (interfaceC1891350zJl instanceof C1183170gtX) {
                    Aweme aweme = ((C1183170gtX) interfaceC1891350zJl).LL.aweme;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid, str)) {
                        i = i2;
                        if (i2 >= 0) {
                            listRemoveItemAt(i2);
                        }
                    }
                }
                i2++;
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1183170gtX c1183170gtX;
        PoiRecommendFeatureDetailFeedItemData poiRecommendFeatureDetailFeedItemData;
        if (!(interfaceC1891350zJl instanceof C1183170gtX) || (c1183170gtX = (C1183170gtX) interfaceC1891350zJl) == null || (poiRecommendFeatureDetailFeedItemData = c1183170gtX.LL) == null) {
            return null;
        }
        return poiRecommendFeatureDetailFeedItemData.aweme;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: CQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1183090gtP r14, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1183090gtP>> r15) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.recommendfeature.detail.vm.PoiRecommendFeatureDetailSharedViewModel.onLoadMore(X.0gtP, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C1183090gtP yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return this.LLJ;
    }
}
