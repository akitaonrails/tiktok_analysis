package com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C0TQG;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C1697810uHb;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C312690CNn;
import X.C335910DEv;
import X.C452501pT;
import X.C786090UsZ;
import X.C786260Usq;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.AObserverS216S0100000_12;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import defpackage.AdvertiserModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class AdvertiserSettingsActivity extends BaseActivity implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohHELIOSOSM6KSsvLGEyLDMpOzs6OyA+Zw43PiA+PSYgLTcfLDsnISsrOg4wPCw6IDsq";
    public TuxTextView LL;
    public TuxNavBar LLILLJJLI;
    public RecyclerView LLILLL;
    public RecyclerView LLILZ;
    public C0TQG LLILZIL;
    public C0TQG LLILZLL;
    public AdvertiserVM LLIZ;
    public C1390410mHn LLIZLLLIL;
    public RelativeLayout LLJ;
    public TuxTextView LLJI;
    public TuxIconView LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public View LLJILLL;
    public TuxTextView LLJJ;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public List<AdvertiserModel> LLJJI = new ArrayList();
    public List<AdvertiserModel> LLJJIII = new ArrayList();
    public int LLJJIJI = -1;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 342));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        List<AdvertiserModel> list = this.LLJJI;
        if (list != null) {
            for (AdvertiserModel advertiserModel : list) {
                Integer advStatus = advertiserModel.getAdvStatus();
                if (advStatus != null && advStatus.intValue() == 1) {
                    this.LLJJJ++;
                }
                Integer advStatus2 = advertiserModel.getAdvStatus();
                if (advStatus2 != null && advStatus2.intValue() == 2) {
                    this.LLJJJIL++;
                }
            }
        }
        List<AdvertiserModel> list2 = this.LLJJIII;
        if (list2 != null) {
            for (AdvertiserModel advertiserModel2 : list2) {
                Integer advStatus3 = advertiserModel2.getAdvStatus();
                if (advStatus3 != null && advStatus3.intValue() == 1) {
                    this.LLJJJ++;
                }
                Integer advStatus4 = advertiserModel2.getAdvStatus();
                if (advStatus4 != null && advStatus4.intValue() == 2) {
                    this.LLJJJIL++;
                }
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(this.LLJJJ, "num_toggle_on");
        c2344009Gk.LIZJ(this.LLJJJIL, "num_toggle_off");
        C20684815ws.LJIILLIIL("exit_advertise_settings_page", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer numValueOf;
        C0TQG c0tqg;
        C0TQG c0tqg2;
        C0TQG c0tqg3 = null;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null && numValueOf.intValue() == R.id.va1) {
            RecyclerView recyclerView = this.LLILLL;
            if (recyclerView == null) {
                recyclerView = null;
            }
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if (adapter != null) {
                if (adapter.getItemCount() > 5) {
                    ArrayList arrayList = new ArrayList();
                    List<AdvertiserModel> list = this.LLJJI;
                    if (list != null) {
                        int i = 0;
                        for (AdvertiserModel advertiserModel : list) {
                            int i2 = i + 1;
                            if (i == 5) {
                                break;
                            }
                            ListProtector.add(arrayList, i, advertiserModel);
                            i = i2;
                        }
                    }
                    C0TQG c0tqg4 = this.LLILZIL;
                    if (c0tqg4 == null) {
                        c0tqg2 = null;
                    } else {
                        c0tqg2 = c0tqg4;
                    }
                    c0tqg2.LLILLJJLI = arrayList;
                    if (c0tqg4 != null) {
                        c0tqg3 = c0tqg4;
                    }
                    c0tqg3.notifyDataSetChanged();
                    TuxTextView tuxTextView = this.LLJI;
                    if (tuxTextView != null) {
                        tuxTextView.setText(this.LLJILJIL);
                    }
                    TuxIconView tuxIconView = this.LLJIJIL;
                    if (tuxIconView != null) {
                        C786410Ut5.Fb(tuxIconView, 360.0f);
                        return;
                    }
                    return;
                }
                List list2 = this.LLJJI;
                if (list2 != null) {
                    C0TQG c0tqg5 = this.LLILZIL;
                    if (c0tqg5 == null) {
                        c0tqg = null;
                    } else {
                        c0tqg = c0tqg5;
                    }
                    c0tqg.LLILLJJLI = list2;
                    if (c0tqg5 != null) {
                        c0tqg3 = c0tqg5;
                    }
                    c0tqg3.notifyDataSetChanged();
                    TuxTextView tuxTextView2 = this.LLJI;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(this.LLJILJILJ);
                    }
                    TuxIconView tuxIconView2 = this.LLJIJIL;
                    if (tuxIconView2 != null) {
                        C786410Ut5.Fb(tuxIconView2, 180.0f);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        AdvertiserVM advertiserVM = (AdvertiserVM) ViewModelProviders.of(this, new C786090UsZ(0)).get(AdvertiserVM.class);
        this.LLIZ = advertiserVM;
        AdvertiserVM advertiserVM2 = null;
        if (advertiserVM == null) {
            advertiserVM = null;
        }
        advertiserVM.getClass();
        if (!C312690CNn.LIZIZ(C312690CNn.LIZ)) {
            advertiserVM.LL.getAdvertiserList().enqueue(new C786260Usq(advertiserVM, 0));
        }
        AdvertiserVM advertiserVM3 = this.LLIZ;
        if (advertiserVM3 == null) {
            advertiserVM3 = null;
        }
        advertiserVM3.LLILLJJLI.observe(this, new AObserverS216S0100000_12(this, 27));
        activityConfiguration(new AwS591S0100000_12(this, 583));
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("keyHitDisconnectFeatureExperiment", false)) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJJ = z;
        setContentView(R.layout.bc3);
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.ajd);
        this.LLILLJJLI = tuxNavBar;
        if (tuxNavBar == null) {
            tuxNavBar = null;
        }
        C1250250idj c1250250idj = new C1250250idj();
        if (this.LLJJJJ) {
            i = 2131822128;
        } else {
            i = 2131822127;
        }
        c1250250idj.LIZJ = getString(i);
        tuxNavBar.LJIJJ(c1250250idj);
        TuxNavBar tuxNavBar2 = this.LLILLJJLI;
        if (tuxNavBar2 == null) {
            tuxNavBar2 = null;
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LJIIIIZZ = getString(2131823332);
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 38));
        tuxNavBar2.LIZIZ(c1251150ifB);
        TuxNavBar tuxNavBar3 = this.LLILLJJLI;
        if (tuxNavBar3 == null) {
            tuxNavBar3 = null;
        }
        tuxNavBar3.LJIIZILJ(true);
        this.LLILLL = (RecyclerView) findViewById(R.id.vak);
        this.LLILZ = (RecyclerView) findViewById(R.id.jlx);
        this.LLJ = (RelativeLayout) findViewById(R.id.va1);
        this.LLJI = (TuxTextView) findViewById(R.id.va2);
        this.LLJIJIL = (TuxIconView) findViewById(R.id.va0);
        this.LLIZLLLIL = (C1390410mHn) findViewById(R.id.nmp);
        this.LLJILLL = findViewById(R.id.vv6);
        this.LLJJ = (TuxTextView) findViewById(R.id.vva);
        this.LLJILJIL = C786410Ut5.Q3(this).getString(2131821330);
        this.LLJILJILJ = C786410Ut5.Q3(this).getString(2131821332);
        C1390410mHn c1390410mHn = this.LLIZLLLIL;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
        }
        C1390410mHn c1390410mHn2 = this.LLIZLLLIL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
        AdvertiserVM advertiserVM4 = this.LLIZ;
        if (advertiserVM4 != null) {
            advertiserVM2 = advertiserVM4;
        }
        advertiserVM2.LLILLL.observe(this, new AObserverS216S0100000_12(this, 6));
        if (this.LLJJJJ) {
            KeyEvent.Callback callbackFindViewById = this.LL;
            if (callbackFindViewById == null) {
                callbackFindViewById = findViewById(R.id.aj9);
                this.LL = (TuxTextView) callbackFindViewById;
            }
            ((TextView) callbackFindViewById).setText(getResources().getString(2131822126));
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
