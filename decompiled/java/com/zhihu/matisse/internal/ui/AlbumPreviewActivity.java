package com.zhihu.matisse.internal.ui;

import X.AbstractC20148113sV;
import X.AnonymousClass1475;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C12MK;
import X.C20148913sd;
import X.C20149313sh;
import X.C786410Ut5;
import X.InterfaceC20149113sf;
import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhihu.matisse.internal.entity.Item;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes31.dex */
public class AlbumPreviewActivity extends AnonymousClass1475 implements InterfaceC20149113sf {
    public static final String _pnsPageId = "KyohZzU7IS05ZyIyPCw/Oip9ISs4LD09KSHELIOSliPCZ9CSkuPCIDOiA6ICokCSY4IDk6PDw=";
    public final C20148913sd LLJJ = new C20148913sd();
    public boolean LLJJI;

    @Override // X.InterfaceC20149113sf
    public final void yy() {
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C20148913sd c20148913sd = this.LLJJ;
        AbstractC20148113sV abstractC20148113sV = c20148913sd.LIZIZ;
        if (abstractC20148113sV != null) {
            abstractC20148113sV.LIZ(2);
        }
        c20148913sd.LIZJ = null;
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC20149113sf
    public final void Xi(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(Item.LIZLLL(cursor));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C12MK c12mk = (C12MK) this.LLILLL.getAdapter();
        c12mk.LLIZ.addAll(arrayList);
        c12mk.notifyDataSetChanged();
        if (!this.LLJJI) {
            this.LLJJI = true;
            int iIndexOf = arrayList.indexOf(getIntent().getParcelableExtra("extra_item"));
            this.LLILLL.setCurrentItem(iIndexOf, false);
            this.LLJ = iIndexOf;
        }
    }

    @Override // X.AnonymousClass1475, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        Activity activity;
        super.onCreate(bundle);
        int iIntValue = 0;
        if (!C20149313sh.LIZ.LJIIJ) {
            C0WZX c0wzx = new C0WZX("dzBzEhgyVsLJG1ogURuXdeTD7xn4Xw2VUneGADEF2KRD79wbO7209yCr9hMuzHmAKmU=", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {0};
            C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/zhihu/matisse/internal/ui/AlbumPreviewActivity", "setResult", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11071, "com/zhihu/matisse/internal/ui/AlbumPreviewActivity", "setResult", null, objArr, this, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                if (objArr2 != null) {
                    Object obj = objArr2[0];
                    if (obj != null) {
                        activity = (Activity) obj;
                    } else {
                        activity = this;
                    }
                    Object obj2 = objArr2[1];
                    if (obj2 != null) {
                        iIntValue = ((Integer) obj2).intValue();
                    }
                } else {
                    activity = this;
                }
                activity.setResult(iIntValue);
                c0wst.LIZ(11071, "com/zhihu/matisse/internal/ui/AlbumPreviewActivity", "setResult", null, objArr, activity, c0wzw, true);
            }
            finish();
            return;
        }
        C20148913sd c20148913sd = this.LLJJ;
        c20148913sd.getClass();
        c20148913sd.LIZ = new WeakReference<>(this);
        c20148913sd.LIZIZ = getSupportLoaderManager();
        c20148913sd.LIZJ = this;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("extra_album");
        C20148913sd c20148913sd2 = this.LLJJ;
        c20148913sd2.getClass();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIJL(bundle2, "args_album", parcelableExtra);
        bundle2.putBoolean("args_enable_capture", false);
        c20148913sd2.LIZIZ.LIZJ(2, bundle2, c20148913sd2);
        Item item = (Item) getIntent().getParcelableExtra("extra_item");
        if (this.LLILLJJLI.LJFF) {
            this.LLILZIL.setCheckedNum(this.LL.LIZIZ(item));
        } else {
            this.LLILZIL.setChecked(this.LL.LIZIZ.contains(item));
        }
        LLLLZIL(item);
    }
}
