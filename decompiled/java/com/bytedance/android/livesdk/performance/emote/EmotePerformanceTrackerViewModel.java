package com.bytedance.android.livesdk.performance.emote;

import X.C0IJT;
import X.C474500IjA;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePerformanceTrackerViewModel extends ViewModel {
    public static final /* synthetic */ int LLJI = 0;
    public String LL;
    public long LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public final List<EmoteModel> LLJ = new ArrayList();

    public final void init() {
        if (this.LLILLJJLI > 0) {
            return;
        }
        this.LLILLJJLI = 0L;
        this.LLILLL = 0L;
        this.LLILZ = 0;
        this.LLILZIL = 0;
        this.LLILZLL = 0;
        ((ArrayList) this.LLJ).clear();
        this.LLILLJJLI = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2() {
        /*
            r13 = this;
            long r3 = r13.LLILLJJLI
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto Lb0
            long r1 = r13.LLILLL
            long r1 = r1 - r3
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto Lb0
            int r4 = r13.LLILZ
            r2 = 0
            if (r4 != 0) goto Lb5
            r0 = 0
        L17:
            int r4 = r13.LLILZIL
            if (r4 == 0) goto L20
            int r2 = r13.LLILZLL
            double r2 = (double) r2
            double r4 = (double) r4
            double r2 = r2 / r4
        L20:
            long r4 = r13.LLIZ
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 == 0) goto Lb1
            long r6 = r13.LLIZLLLIL
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto Lb1
            long r6 = r6 - r4
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto Lb1
        L31:
            java.lang.String r4 = "livesdk_sub_emote_list_fmp"
            X.0IjA r12 = X.C0IJT.LIZ(r4)
            int r4 = r13.LLILZ
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "emote_count"
            r12.LJJII(r5, r4)
            int r5 = r13.LLILZ
            java.util.List<com.bytedance.android.live.base.model.emoji.EmoteModel> r4 = r13.LLJ
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            int r5 = r5 - r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r4 = "success_count"
            r12.LJJII(r5, r4)
            java.util.List<com.bytedance.android.live.base.model.emoji.EmoteModel> r4 = r13.LLJ
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "failure_cout"
            r12.LJJII(r5, r4)
            long r10 = r13.LLILLL
            long r4 = r13.LLILLJJLI
            long r10 = r10 - r4
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            java.lang.String r4 = "total_cost"
            r12.LJJII(r5, r4)
            java.lang.String r5 = "show_entrance"
            java.lang.String r4 = r13.LL
            r12.LJJII(r4, r5)
            java.lang.String r4 = "success_ratio"
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r12.LJJIII(r4, r0)
            java.lang.String r1 = "cached_ratio"
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r12.LJJIII(r1, r0)
            java.lang.String r1 = "privilege_page_cost"
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r12.LJJII(r0, r1)
            r12.LIZ()
            r13.LLILLJJLI = r8
            r13.LLILLL = r8
            r0 = 0
            r13.LLILZ = r0
            r13.LLILZIL = r0
            r13.LLILZLL = r0
            java.util.List<com.bytedance.android.live.base.model.emoji.EmoteModel> r0 = r13.LLJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            r13.LLIZLLLIL = r8
            r13.LLIZ = r8
        Lb0:
            return
        Lb1:
            r6 = -1
            goto L31
        Lb5:
            int r0 = r13.LLILZIL
            double r0 = (double) r0
            double r4 = (double) r4
            double r0 = r0 / r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.performance.emote.EmotePerformanceTrackerViewModel.xQ2():void");
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZIL = 0;
        this.LLILZLL = 0;
        this.LLILLJJLI = 0L;
        this.LLILLL = 0L;
        this.LLILZ = 0;
        this.LL = null;
        this.LLIZLLLIL = 0L;
        this.LLIZ = 0L;
        ((ArrayList) this.LLJ).clear();
    }

    public EmotePerformanceTrackerViewModel(String str) {
        this.LL = str;
    }

    public final void vQ2(EmoteModel emoteModel) {
        if (this.LLILLJJLI == 0) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(((ArrayList) this.LLJ).add(emoteModel));
        if (boolValueOf.booleanValue()) {
            boolValueOf.booleanValue();
            this.LLILZ++;
        }
    }

    public final boolean wQ2(EmoteModel emoteModel, boolean z) {
        if (((ArrayList) this.LLJ).contains(emoteModel)) {
            this.LLILZIL++;
            if (z) {
                this.LLILZLL++;
            }
            return ((ArrayList) this.LLJ).remove(emoteModel);
        }
        return false;
    }

    public final void yQ2(int i, String str, long j, int i2, String str2, String str3) {
        long j2 = this.LLILLJJLI;
        if (j2 != 0 && j - j2 >= 0) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_emote_load");
            c474500IjALIZ.LJJII(Integer.valueOf(i2), "err_code");
            c474500IjALIZ.LJJII(str2, "error_detail");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "hit_cache_type");
            c474500IjALIZ.LJJII(Long.valueOf(j - this.LLILLJJLI), "cost");
            c474500IjALIZ.LJJII(this.LL, "show_entrance");
            c474500IjALIZ.LJJII(str, "emote_id");
            c474500IjALIZ.LJJII(str3, "image_ext");
            c474500IjALIZ.LIZ();
        }
    }
}
