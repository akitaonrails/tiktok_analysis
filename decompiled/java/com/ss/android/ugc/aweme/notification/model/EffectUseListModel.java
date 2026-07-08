package com.ss.android.ugc.aweme.notification.model;

import X.AbstractC2238408pq;
import X.AbstractC666100QAu;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C11NZ;
import X.C11UD;
import X.C155000ia;
import X.C1909140zmS;
import X.C1C7U;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import X.InterfaceC1526205yG;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.EffectUseListResponse;
import com.ss.android.ugc.aweme.notification.bean.NoticeInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes5.dex */
public final class EffectUseListModel extends AbstractC666100QAu<EffectUseListResponse> {
    public final String effectId;
    public boolean isLoadMore;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;

    public static final class Companion {
    }

    @Override // X.AbstractC666100QAu
    public boolean checkParams(Object... objArr) {
        return true;
    }

    public final void loadMore() {
        this.isLoadMore = true;
        EffectUseListResponse data = getData();
        long j = data != null ? data.maxCursor : 0L;
        EffectUseListResponse data2 = getData();
        fetchEffectUseList(j, data2 != null ? data2.minCursor : 0L);
    }

    public final void refresh() {
        this.isLoadMore = false;
        fetchEffectUseList(Long.MAX_VALUE, 0L);
    }

    public final boolean isLoadMore() {
        return this.isLoadMore;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.notification.model.EffectUseListModel$fetchEffectUseList$1, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.notification.model.EffectUseListModel$fetchEffectUseList$1", f = "EffectUseListModel.kt", l = {40, 42, BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ long $maxCursor;
        public final /* synthetic */ long $minCursor;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, long j2, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$maxCursor = j;
            this.$minCursor = j2;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return EffectUseListModel.this.new AnonymousClass1(this.$maxCursor, this.$minCursor, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX INFO: renamed from: com.ss.android.ugc.aweme.notification.model.EffectUseListModel$fetchEffectUseList$1$1, reason: invalid class name and collision with other inner class name */
        @C09DV(c = "com.ss.android.ugc.aweme.notification.model.EffectUseListModel$fetchEffectUseList$1$1", f = "EffectUseListModel.kt", l = {}, m = "invokeSuspend")
        public final class C00171 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ EffectUseListModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00171(EffectUseListModel effectUseListModel, InterfaceC1364105Vn<? super C00171> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.this$0 = effectUseListModel;
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new C00171(this.this$0, interfaceC1364105Vn);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                C1C7U.LIZ("EffectUseListModel@db48.fetchEffectUseList$1$1");
                C099R.LJFF();
                if (this.label == 0) {
                    C155000ia.LIZIZ(obj);
                    List<InterfaceC1526205yG> list = this.this$0.mNotifyListeners;
                    if (list != null) {
                        Iterator<InterfaceC1526205yG> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onSuccess();
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EffectUseListModel@db48.fetchEffectUseList$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.ss.android.ugc.aweme.notification.model.EffectUseListModel$fetchEffectUseList$1$2, reason: invalid class name */
        @C09DV(c = "com.ss.android.ugc.aweme.notification.model.EffectUseListModel$fetchEffectUseList$1$2", f = "EffectUseListModel.kt", l = {}, m = "invokeSuspend")
        public final class AnonymousClass2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public final /* synthetic */ Exception $e;
            public int label;
            public final /* synthetic */ EffectUseListModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(EffectUseListModel effectUseListModel, Exception exc, InterfaceC1364105Vn<? super AnonymousClass2> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.this$0 = effectUseListModel;
                this.$e = exc;
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new AnonymousClass2(this.this$0, this.$e, interfaceC1364105Vn);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                C1C7U.LIZ("EffectUseListModel@db48.fetchEffectUseList$1$2");
                C099R.LJFF();
                if (this.label == 0) {
                    C155000ia.LIZIZ(obj);
                    List<InterfaceC1526205yG> list = this.this$0.mNotifyListeners;
                    if (list != null) {
                        Iterator<InterfaceC1526205yG> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onFailed(this.$e);
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EffectUseListModel@db48.fetchEffectUseList$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("EffectUseListModel@db48.fetchEffectUseList$1");
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EffectUseListModel.this, e, null);
                this.label = 3;
                if (C23250099c.LJI(this, abstractC2238408pq, anonymousClass2) == objLJFF) {
                    C1C7U.LIZIZ("EffectUseListModel@db48.fetchEffectUseList$1");
                    return objLJFF;
                }
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("EffectUseListModel@db48.fetchEffectUseList$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C11NZ c11nzLIZ = C1909140zmS.LIZ(EffectUseListModel.this.effectId, this.$maxCursor, this.$minCursor);
                this.label = 1;
                obj = C11UD.LIZJ(c11nzLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EffectUseListModel@db48.fetchEffectUseList$1");
                    return objLJFF;
                }
            }
            EffectUseListResponse effectUseListResponse = (EffectUseListResponse) obj;
            effectUseListResponse.checkValid();
            EffectUseListModel.this.handleData(effectUseListResponse);
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C00171 c00171 = new C00171(EffectUseListModel.this, null);
            this.label = 2;
            if (C23250099c.LJI(this, abstractC2238408pq2, c00171) == objLJFF) {
                C1C7U.LIZIZ("EffectUseListModel@db48.fetchEffectUseList$1");
                return objLJFF;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EffectUseListModel@db48.fetchEffectUseList$1");
            return unit2;
        }
    }

    public EffectUseListModel(String str) {
        this.effectId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC666100QAu
    public void handleData(EffectUseListResponse effectUseListResponse) {
        if (effectUseListResponse == 0) {
            this.mData = null;
            return;
        }
        List<NoticeInfo> list = effectUseListResponse.noticeInfoList;
        if (list == null || list.isEmpty()) {
            effectUseListResponse.hasMore = false;
        }
        this.mData = effectUseListResponse;
    }

    public final void setLoadMore(boolean z) {
        this.isLoadMore = z;
    }

    private final void fetchEffectUseList(long j, long j2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new AnonymousClass1(j, j2, null), 3);
    }
}
