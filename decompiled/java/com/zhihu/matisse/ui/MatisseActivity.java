package com.zhihu.matisse.ui;

import X.AbstractC20148113sV;
import X.AbstractViewOnTouchListenerC21551119Vt;
import X.AnonymousClass1478;
import X.AnonymousClass1479;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1324980kaG;
import X.C147C;
import X.C147E;
import X.C147M;
import X.C1513670pUb;
import X.C1701330uNH;
import X.C19EH;
import X.C19GS;
import X.C19V8;
import X.C19W7;
import X.C20149013se;
import X.C20149313sh;
import X.C201963140r;
import X.C201965140t;
import X.C21553019Wm;
import X.C2204961BRm;
import X.C418960Gbm;
import X.C786410Ut5;
import X.InterfaceC20149213sg;
import Y.ACListenerS164S0100000_30;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.ui.AlbumPreviewActivity;
import com.zhihu.matisse.internal.ui.MediaSelectionFragment;
import com.zhihu.matisse.internal.ui.SelectedPreviewActivity;
import com.zhihu.matisse.internal.ui.widget.IncapableDialog;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import jv6.a;

/* JADX INFO: loaded from: classes31.dex */
public class MatisseActivity extends C19GS implements InterfaceC20149213sg, AdapterView.OnItemSelectedListener, AnonymousClass1479, View.OnClickListener, C147C, AnonymousClass1478, C147E {
    public static final String _pnsPageId = "KyohZzU7IS05ZyIyPCw/Oip9HELIOSPSxiBC4nITY/LA4wPCw6IDsq";
    public final C20149013se LL = new C20149013se();
    public final C201965140t LLILLJJLI = new C201965140t(this);
    public C201963140r LLILLL;
    public C147M LLILZ;
    public C1324980kaG LLILZIL;
    public TextView LLILZLL;
    public TextView LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public LinearLayout LLJI;
    public C418960Gbm LLJIJIL;
    public boolean LLJILJIL;
    public MediaSelectionFragment LLJILJILJ;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZIL() {
        /*
            r6 = this;
            X.140t r0 = r6.LLILLJJLI
            java.util.Set<com.zhihu.matisse.internal.entity.Item> r0 = r0.LIZIZ
            int r5 = r0.size()
            r4 = 0
            r2 = 2131837073(0x7f114091, float:1.930733E38)
            if (r5 != 0) goto L2d
            android.widget.TextView r0 = r6.LLILZLL
            r0.setEnabled(r4)
            android.widget.TextView r0 = r6.LLIZ
            r0.setEnabled(r4)
            android.widget.TextView r1 = r6.LLIZ
            java.lang.String r0 = r6.getString(r2)
            r1.setText(r0)
        L21:
            X.140r r0 = r6.LLILLL
            r0.getClass()
            android.widget.LinearLayout r1 = r6.LLJI
            r0 = 4
            X.C786410Ut5.LJZL(r0, r1)
            return
        L2d:
            r3 = 1
            if (r5 != r3) goto L4a
            X.140r r1 = r6.LLILLL
            boolean r0 = r1.LJFF
            if (r0 != 0) goto L4a
            int r0 = r1.LJI
            if (r0 != r3) goto L4a
            android.widget.TextView r0 = r6.LLILZLL
            r0.setEnabled(r3)
            android.widget.TextView r0 = r6.LLIZ
            r0.setText(r2)
            android.widget.TextView r0 = r6.LLIZ
            r0.setEnabled(r3)
            goto L21
        L4a:
            android.widget.TextView r0 = r6.LLILZLL
            r0.setEnabled(r3)
            android.widget.TextView r0 = r6.LLIZ
            r0.setEnabled(r3)
            android.widget.TextView r2 = r6.LLIZ
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1[r4] = r0
            r0 = 2131837072(0x7f114090, float:1.9307329E38)
            java.lang.String r0 = r6.getString(r0, r1)
            r2.setText(r0)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhihu.matisse.ui.MatisseActivity.LLLLZIL():void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() throws Throwable {
        C2204961BRm.Y(this, new C0WZX("dzBzEhgyVsLJG1ogURuXdeTD8x6idx6PWmjbEBlI7aEYXrza", null));
        super.onBackPressed();
    }

    @Override // X.C147C
    public final void d0() {
        LLLLZIL();
        this.LLILLL.getClass();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C20149013se c20149013se = this.LL;
        AbstractC20148113sV abstractC20148113sV = c20149013se.LIZIZ;
        if (abstractC20148113sV != null) {
            abstractC20148113sV.LIZ(1);
        }
        c20149013se.LIZJ = null;
        this.LLILLL.getClass();
        this.LLILLL.getClass();
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

    @Override // X.C147E
    public final void LJJJJ() {
        throw null;
    }

    @Override // X.AnonymousClass1479
    public final C201965140t LJJLIIIJJIZ() {
        return this.LLILLJJLI;
    }

    public final void LLLLZI(Album album) {
        if (album.LIZIZ() && album.mCount == 0) {
            C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL);
            C786410Ut5.LJLLLLLL(0, this.LLJ);
            return;
        }
        C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL);
        C786410Ut5.LJLLLLLL(8, this.LLJ);
        if (this.LLJILJILJ != null) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(this.LLJILJILJ);
            c19ehLJIIJ.LJIIJ();
        }
        MediaSelectionFragment mediaSelectionFragment = new MediaSelectionFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "extra_album", album);
        mediaSelectionFragment.setArguments(bundle);
        this.LLJILJILJ = mediaSelectionFragment;
        C19EH c19ehLJIIJ2 = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ2.LIZJ(R.id.eqx, this.LLJILJILJ, "MediaSelectionFragment");
        c19ehLJIIJ2.LJIIJ();
    }

    @Override // X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
            context = i18nServiceApi.LIZ().LIZJ(context);
        }
        a.install(context);
        super.attachBaseContext(context);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        if (view.getId() == R.id.d7v) {
            Intent intent = new Intent(this, (Class<?>) SelectedPreviewActivity.class);
            intent.putExtra("extra_default_bundle", this.LLILLJJLI.LIZJ());
            intent.putExtra("extra_result_original_enable", this.LLJILJIL);
            LLLLLZL(this, intent);
            return;
        }
        if (view.getId() == R.id.d6y) {
            Intent intent2 = new Intent();
            C201965140t c201965140t = this.LLILLJJLI;
            c201965140t.getClass();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<Item> it2 = c201965140t.LIZIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().uri);
            }
            intent2.putParcelableArrayListExtra("extra_result_selection", arrayList);
            intent2.putExtra("extra_result_original_enable", this.LLJILJIL);
            C2204961BRm.X(intent2, new C0WZX("dzBzEhgyVsLJG1ogURuXdeTD8x6idx6PWmjbEBlI7aEYXrza", null), this);
            finish();
            return;
        }
        if (view.getId() != R.id.ptl) {
            return;
        }
        int size = this.LLILLJJLI.LIZIZ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C201965140t c201965140t2 = this.LLILLJJLI;
            c201965140t2.getClass();
            Item item = (Item) ListProtector.get(new ArrayList(c201965140t2.LIZIZ), i2);
            if (item.LIZIZ() && C1513670pUb.LIZ(item.size) > this.LLILLL.LJIIJJI) {
                i++;
            }
        }
        if (i > 0) {
            IncapableDialog.MR("", getString(2131837079, Integer.valueOf(i), Integer.valueOf(this.LLILLL.LJIIJJI))).show(getSupportFragmentManager(), IncapableDialog.class.getName());
            return;
        }
        boolean z = true ^ this.LLJILJIL;
        this.LLJILJIL = z;
        this.LLJIJIL.setChecked(z);
        this.LLILLL.getClass();
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.0kaG] */
    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        C201963140r c201963140r = C20149313sh.LIZ;
        this.LLILLL = c201963140r;
        setTheme(c201963140r.LIZLLL);
        super.onCreate(bundle);
        if (!this.LLILLL.LJIIJ) {
            C2204961BRm.Y(this, new C0WZX("dzBzEhgyVsLJG1ogURuXdeTD8x6idx6PWmjbEBlI7aEYXrza", null));
            finish();
            return;
        }
        setContentView(R.layout.j9);
        int i = this.LLILLL.LJ;
        if (i != -1) {
            setRequestedOrientation(i);
        }
        this.LLILLL.getClass();
        C19V8 c19v8 = (C19V8) findViewById(R.id.y6m);
        setSupportActionBar(c19v8);
        C19W7 supportActionBar = getSupportActionBar();
        supportActionBar.LJIILL();
        supportActionBar.LJIILIIL(true);
        Drawable navigationIcon = c19v8.getNavigationIcon();
        TypedArray typedArrayObtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.b9_});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        navigationIcon.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        this.LLILZLL = (TextView) findViewById(R.id.d7v);
        this.LLIZ = (TextView) findViewById(R.id.d6y);
        C786410Ut5.T7(this.LLILZLL, this);
        C786410Ut5.T7(this.LLIZ, this);
        this.LLIZLLLIL = findViewById(R.id.eqx);
        this.LLJ = findViewById(R.id.h3n);
        this.LLJI = (LinearLayout) findViewById(R.id.ptl);
        this.LLJIJIL = (C418960Gbm) findViewById(R.id.ptk);
        C786410Ut5.R7(this.LLJI, this);
        this.LLILLJJLI.LJFF(bundle);
        if (bundle != null) {
            this.LLJILJIL = bundle.getBoolean("checkState");
        }
        LLLLZIL();
        this.LLILZIL = new CursorAdapter(this) { // from class: X.0kaG
            public final Drawable LL;

            {
                super(this, (Cursor) null, false);
                TypedArray typedArrayObtainStyledAttributes2 = this.getTheme().obtainStyledAttributes(new int[]{R.attr.b9c});
                this.LL = typedArrayObtainStyledAttributes2.getDrawable(0);
                typedArrayObtainStyledAttributes2.recycle();
            }

            @Override // android.widget.CursorAdapter
            public final void bindView(View view, Context context, Cursor cursor) {
                Album albumLIZJ = Album.LIZJ(cursor);
                ((TextView) view.findViewById(R.id.avx)).setText(albumLIZJ.LIZ(context));
                ((TextView) view.findViewById(R.id.avw)).setText(String.valueOf(albumLIZJ.mCount));
                C1322110kVd c1322110kVd = (C1322110kVd) view.findViewById(R.id.avi);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.a77);
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(albumLIZJ.mCoverUri);
                c1325700kbQLIZLLL.LIZJ = new C1324630kZh(dimensionPixelSize, dimensionPixelSize);
                C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
                C1331070kk5 hierarchy = c1322110kVd.getHierarchy();
                if (hierarchy == null) {
                    hierarchy = new C1331090kk7(context.getResources()).LIZ();
                }
                hierarchy.LJIJ(this.LL, 1);
                c1322110kVd.setHierarchy(hierarchy);
                c1322110kVd.setImageRequest(c1325710kbRLIZ);
            }

            @Override // android.widget.CursorAdapter
            public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ow, viewGroup, false);
            }
        };
        C147M c147m = new C147M(this);
        this.LLILZ = c147m;
        c147m.LIZLLL = this;
        TextView textView = (TextView) findViewById(R.id.uly);
        c147m.LIZIZ = textView;
        Drawable drawable = textView.getCompoundDrawables()[2];
        TypedArray typedArrayObtainStyledAttributes2 = c147m.LIZIZ.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.b9_});
        int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
        typedArrayObtainStyledAttributes2.recycle();
        drawable.setColorFilter(color2, PorterDuff.Mode.SRC_IN);
        C786410Ut5.LLIL(c147m.LIZIZ, 8);
        C786410Ut5.T7(c147m.LIZIZ, new ACListenerS164S0100000_30(c147m, 40));
        final TextView textView2 = c147m.LIZIZ;
        final C21553019Wm c21553019Wm = c147m.LIZJ;
        c21553019Wm.getClass();
        textView2.setOnTouchListener(new AbstractViewOnTouchListenerC21551119Vt(textView2) { // from class: X.19Vv
            @Override // X.AbstractViewOnTouchListenerC21551119Vt
            public final /* bridge */ /* synthetic */ InterfaceC21551219Vu LIZIZ() {
                return c21553019Wm;
            }
        });
        this.LLILZ.LIZJ.LLJJ = findViewById(R.id.y6m);
        C147M c147m2 = this.LLILZ;
        C1324980kaG c1324980kaG = this.LLILZIL;
        c147m2.LIZJ.LJIILJJIL(c1324980kaG);
        c147m2.LIZ = c1324980kaG;
        C20149013se c20149013se = this.LL;
        c20149013se.getClass();
        c20149013se.LIZ = new WeakReference<>(this);
        c20149013se.LIZIZ = getSupportLoaderManager();
        c20149013se.LIZJ = this;
        C20149013se c20149013se2 = this.LL;
        c20149013se2.getClass();
        if (bundle != null) {
            c20149013se2.LIZLLL = bundle.getInt("state_current_selection");
        }
        C20149013se c20149013se3 = this.LL;
        c20149013se3.LIZIZ.LIZJ(1, null, c20149013se3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) throws Throwable {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C201965140t c201965140t = this.LLILLJJLI;
        c201965140t.getClass();
        C786410Ut5.LJJIL(bundle, "state_selection", new ArrayList(c201965140t.LIZIZ));
        bundle.putInt("state_collection_type", c201965140t.LIZJ);
        bundle.putInt("state_current_selection", this.LL.LIZLLL);
        bundle.putBoolean("checkState", this.LLJILJIL);
    }

    public static void LLLLLZL(MatisseActivity matisseActivity, Intent intent) throws Throwable {
        Intent intent2;
        ComponentActivity componentActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(matisseActivity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, matisseActivity);
        C0WZX c0wzx = new C0WZX("dzBzEhgyVsLJG1ogURuXdeTD8x6idx6PWmjbEBlI7aEYXrza", null);
        C0WST c0wst = new C0WST();
        int iIntValue = 23;
        Object[] objArr = {intent, 23};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "com/zhihu/matisse/ui/MatisseActivity", "startActivityForResult", matisseActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "com/zhihu/matisse/ui/MatisseActivity", "startActivityForResult", null, objArr, matisseActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                componentActivity = (ComponentActivity) obj;
            } else {
                componentActivity = matisseActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            intent2 = intent;
            componentActivity = matisseActivity;
        }
        componentActivity.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11094, "com/zhihu/matisse/ui/MatisseActivity", "startActivityForResult", null, objArr, componentActivity, c0wzw, true);
    }

    @Override // X.AnonymousClass1478
    public final void gL(Album album, Item item, int i) throws Throwable {
        Intent intent = new Intent(this, (Class<?>) AlbumPreviewActivity.class);
        intent.putExtra("extra_album", album);
        intent.putExtra("extra_item", item);
        intent.putExtra("extra_default_bundle", this.LLILLJJLI.LIZJ());
        intent.putExtra("extra_result_original_enable", this.LLJILJIL);
        LLLLLZL(this, intent);
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 23) {
            Bundle bundleG3 = C786410Ut5.g3(intent, "extra_result_bundle");
            ArrayList parcelableArrayList = bundleG3.getParcelableArrayList("state_selection");
            this.LLJILJIL = intent.getBooleanExtra("extra_result_original_enable", false);
            int i3 = bundleG3.getInt("state_collection_type", 0);
            if (intent.getBooleanExtra("extra_result_apply", false)) {
                Intent intent2 = new Intent();
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                if (parcelableArrayList != null) {
                    Iterator it2 = parcelableArrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((Item) it2.next()).uri);
                    }
                }
                intent2.putParcelableArrayListExtra("extra_result_selection", arrayList);
                intent2.putExtra("extra_result_original_enable", this.LLJILJIL);
                C2204961BRm.X(intent2, new C0WZX("dzBzEhgyVsLJG1ogURuXdeTD8x6idx6PWmjbEBlI7aEYXrza", null), this);
                finish();
                return;
            }
            C201965140t c201965140t = this.LLILLJJLI;
            c201965140t.getClass();
            if (parcelableArrayList.size() == 0) {
                c201965140t.LIZJ = 0;
            } else {
                c201965140t.LIZJ = i3;
            }
            c201965140t.LIZIZ.clear();
            c201965140t.LIZIZ.addAll(parcelableArrayList);
            Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("MediaSelectionFragment");
            if (fragmentLJJJJZI instanceof MediaSelectionFragment) {
                ((MediaSelectionFragment) fragmentLJJJJZI).LLILLL.notifyDataSetChanged();
            }
            LLLLZIL();
            return;
        }
        if (i == 24) {
            throw null;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.LL.LIZLLL = i;
        getCursor().moveToPosition(i);
        Album albumLIZJ = Album.LIZJ(getCursor());
        albumLIZJ.LIZIZ();
        LLLLZI(albumLIZJ);
    }
}
