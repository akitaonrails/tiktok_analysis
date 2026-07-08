package com.ss.android.ugc.aweme.anchor;

import X.AnonymousClass1192;
import X.C118L;
import X.C118S;
import X.C118U;
import X.C1389600mGU;
import X.C19EH;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2276411E8h;
import X.C497820Jfg;
import X.C786410Ut5;
import X.EnumC1430380nKG;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AnchorBaseFragment;
import com.ss.android.ugc.aweme.AnchorRecentlyAddFragment;
import com.ss.android.ugc.aweme.AnchorSearchFragment;
import com.ss.android.ugc.aweme.AnchorSelectionFragment;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public class AnchorBaseActivity extends BaseActivity implements AnonymousClass1192 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSQiKic8OmsNJyw7JzcOKDw2CSY4IDk6PDw=";
    public View LL;
    public AnchorRecentlyAddFragment LLILLJJLI;
    public AnchorSearchFragment LLILLL;
    public AnchorSelectionFragment LLILZ;
    public String LLILZIL;
    public String LLILZLL;

    @Override // X.AnonymousClass1192
    public void LLJJIJI(LiveEventModule liveEventModule) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AnonymousClass1192
    public final void LLLLILI() {
        C118S c118s;
        Object next;
        Pair pair;
        Integer num;
        ArrayList<AnchorCell> arrayList;
        AnchorSelectionFragment anchorSelectionFragment = this.LLILZ;
        if (anchorSelectionFragment == null || (c118s = anchorSelectionFragment.LLJIJIL) == null) {
            return;
        }
        C118L c118l = (C118L) c118s.LL;
        Iterator it2 = ((ArrayList) c118l.LLILZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Integer num2 = ((AnchorModule) next).type;
            if (num2 != null && num2.intValue() == 2) {
                break;
            }
        }
        AnchorModule anchorModule = (AnchorModule) next;
        if (anchorModule != null && (arrayList = anchorModule.cells) != null) {
            arrayList.clear();
        }
        int iLJIIJ = c118l.LJIIJ();
        Iterator it3 = ((ArrayList) c118l.LLILLL).iterator();
        int i = 0;
        while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            }
            Object next2 = it3.next();
            if ((next2 instanceof AnchorModule) && (num = ((AnchorModule) next2).type) != null && num.intValue() == 1) {
                break;
            } else {
                i++;
            }
        }
        if (iLJIIJ > i) {
            C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error module range, from=");
            sbLIZ.append(iLJIIJ);
            sbLIZ.append(", to=");
            sbLIZ.append(i);
            c2276411E8h.log("anchor_business", C2188811AlT.LIZIZ(sbLIZ));
            pair = new Pair(0, 0);
        } else {
            pair = new Pair(Integer.valueOf(iLJIIJ), Integer.valueOf(i));
        }
        ((ArrayList) c118l.LLILLL).subList(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue()).clear();
        ((C118U) c118s.LLILLJJLI).xe2(((C118L) c118s.LL).LJIIJ());
    }

    @Override // X.AnonymousClass1192
    public final String getCreationId() {
        String str = this.LLILZLL;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // X.AnonymousClass1192
    public final String getShootWay() {
        String str = this.LLILZIL;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // X.AnonymousClass1192
    public final void LJLLL() {
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        if (this.LLILLL == null) {
            this.LLILLL = new AnchorSearchFragment();
        }
        AnchorSearchFragment anchorSearchFragment = this.LLILLL;
        if (anchorSearchFragment != null) {
            if (!anchorSearchFragment.isAdded()) {
                c19ehLJIIJ.LIZIZ(R.id.iio, anchorSearchFragment);
            }
            AnchorSelectionFragment anchorSelectionFragment = this.LLILZ;
            if (anchorSelectionFragment != null) {
                c19ehLJIIJ.LJJIFFI(anchorSearchFragment);
                c19ehLJIIJ.LJIILL(anchorSelectionFragment);
                c19ehLJIIJ.LJII(null);
                c19ehLJIIJ.LJIIJ();
            }
        }
    }

    public void LLLLLZL() {
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        if (this.LLILZ == null) {
            this.LLILZ = new AnchorSelectionFragment();
        }
        AnchorSelectionFragment anchorSelectionFragment = this.LLILZ;
        if (anchorSelectionFragment != null) {
            c19ehLJIIJ.LIZIZ(R.id.iio, anchorSelectionFragment);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        int i;
        int i2;
        super.finish();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
            i2 = 0;
        } else {
            i = R.anim.db;
            i2 = R.anim.f476dc;
        }
        overridePendingTransition(i, i2);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        AnchorRecentlyAddFragment anchorRecentlyAddFragment;
        if (getSupportFragmentManager().LJJLIIIIJ() == 0) {
            super.onBackPressed();
            return;
        }
        AnchorRecentlyAddFragment anchorRecentlyAddFragment2 = this.LLILLJJLI;
        if (anchorRecentlyAddFragment2 == null || !anchorRecentlyAddFragment2.isVisible() || (anchorRecentlyAddFragment = this.LLILLJJLI) == null || !anchorRecentlyAddFragment.LLJIJIL) {
            getSupportFragmentManager().LJLLILLLL();
        } else {
            anchorRecentlyAddFragment.MR(false);
        }
    }

    @Override // X.AnonymousClass1192
    public final void LLJI() {
        finish();
    }

    @Override // X.AnonymousClass1192
    public final void LJL(ArrayList<AnchorCell> arrayList) {
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new AnchorRecentlyAddFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIL(bundle, "recently_add", arrayList);
            AnchorRecentlyAddFragment anchorRecentlyAddFragment = this.LLILLJJLI;
            if (anchorRecentlyAddFragment != null) {
                anchorRecentlyAddFragment.setArguments(bundle);
            }
        }
        AnchorRecentlyAddFragment anchorRecentlyAddFragment2 = this.LLILLJJLI;
        if (anchorRecentlyAddFragment2 != null) {
            if (!anchorRecentlyAddFragment2.isAdded()) {
                c19ehLJIIJ.LIZIZ(R.id.iio, anchorRecentlyAddFragment2);
            }
            AnchorSelectionFragment anchorSelectionFragment = this.LLILZ;
            if (anchorSelectionFragment != null) {
                c19ehLJIIJ.LJJIFFI(anchorRecentlyAddFragment2);
                c19ehLJIIJ.LJIILL(anchorSelectionFragment);
                c19ehLJIIJ.LJII(null);
                c19ehLJIIJ.LJIIJ();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        int type;
        String stringExtra;
        String stringExtra2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        Integer numLJIIJJI;
        EnumC1430380nKG enumC1430380nKG;
        String stringExtra3;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onCreate", true);
        activityConfiguration(AFwS273S0000000_29.get$arr$(25));
        super.onCreate(bundle);
        setContentView(R.layout.i9);
        String str = "";
        if (getIntent().getData() == null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("anchor_type");
            if (!(serializableExtra instanceof EnumC1430380nKG) || (enumC1430380nKG = (EnumC1430380nKG) serializableExtra) == null) {
                enumC1430380nKG = EnumC1430380nKG.NO_TYPE;
            }
            AnchorBaseFragment.LLILLJJLI = enumC1430380nKG;
            try {
                stringExtra3 = getIntent().getStringExtra("shoot_way");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            this.LLILZIL = stringExtra3;
            try {
                String stringExtra4 = getIntent().getStringExtra("creation_id");
                if (stringExtra4 != null) {
                    str = stringExtra4;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            this.LLILZLL = str;
        } else {
            Uri data = getIntent().getData();
            if (data != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "business_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) != null) {
                type = numLJIIJJI.intValue();
            } else {
                type = EnumC1430380nKG.COMMON_TYPE.getTYPE();
            }
            EnumC1430380nKG enumC1430380nKG2 = EnumC1430380nKG.COMMON_TYPE;
            enumC1430380nKG2.setTYPE(type);
            AnchorBaseFragment.LLILLJJLI = enumC1430380nKG2;
            try {
                stringExtra = getIntent().getStringExtra("shoot_way");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.LLILZIL = stringExtra;
            if (stringExtra.length() == 0) {
                if (data == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "shoot_way")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                this.LLILZIL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
            }
            try {
                stringExtra2 = getIntent().getStringExtra("creation_id");
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.LLILZLL = stringExtra2;
            if (stringExtra2.length() == 0) {
                if (data != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "creation_id")) != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
                this.LLILZLL = str;
            }
        }
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.w0u);
            this.LL = viewFindViewById;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = C497820Jfg.LIZJ(this);
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            viewFindViewById2 = findViewById(R.id.w0u);
            this.LL = viewFindViewById2;
        }
        C786410Ut5.W5(viewFindViewById2, layoutParams);
        LLLLLZL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onCreate", false);
    }

    public final void setStatusBarFromXml(View view) {
        this.LL = view;
    }
}
