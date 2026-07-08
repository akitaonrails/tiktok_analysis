package com.ss.android.ugc.aweme.web.creation;

import X.C0TGX;
import X.C0TWH;
import X.C0TWI;
import X.C0XI4;
import X.C1202004n4;
import X.C1537900q7g;
import X.C1541950qED;
import X.C266020Abg;
import X.C823050WQl;
import X.InterfaceC2217701Bqy;
import Y.ARunnableS9S1000000_16;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.IWebCreationPromoteService;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes13.dex */
public final class WebCreationPromoteServiceImpl implements IWebCreationPromoteService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final boolean LIZLLL() {
        if (((Number) C266020Abg.LIZ.getValue()).intValue() != 1 || C0TWH.LIZ().getBoolean("key_has_open_h5_page", false)) {
            return false;
        }
        int i = C0TWH.LIZ().getInt("key_cancel_profile_gudie_time", 0);
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("web_promote_notice_max_cancel_cnt", 2);
        return i < (iLJ > 0 ? iLJ : 2);
    }

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final void LIZJ() {
        if (LIZLLL()) {
            C823050WQl.LIZLLL().submit(new ARunnableS9S1000000_16(0));
        }
    }

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final void LIZIZ(Context context) {
        C0XI4 c0xi4 = new C0XI4(C1202004n4.LIZ());
        c0xi4.LJ("enter_from", "personal_homepage");
        String string = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", c0xi4.LJFF()).appendQueryParameter("enter_from", "personal_homepage").appendQueryParameter("target_handler", "target_handler").build().toString();
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(string);
        sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0QUu
            public SparkActivity LL;

            @Override // X.InterfaceC2217701Bqy
            public final Context LIZJ(Context context2) {
                return context2;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIILLIIL(boolean z) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIL(Activity activity, Context context2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIII(SparkActivity sparkActivity, boolean z) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIJIIJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJZI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                return false;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLJLI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void finish() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                this.LL = null;
                EventBus.LIZLLL().LJJI(this);
            }

            @C14EU
            public final void onEvent(C1365870leD c1365870leD) {
                String str;
                SparkFragment sparkFragment;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
                if (c1365870leD != null) {
                    str = c1365870leD.LIZLLL;
                } else {
                    str = null;
                }
                if (TextUtils.equals("web", str)) {
                    IMSharePanelApi.LIZ.getClass();
                    InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                    SparkActivity sparkActivity = this.LL;
                    if (sparkActivity != null && (sparkFragment = sparkActivity.LLJILJIL) != null) {
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL;
                    }
                    shareService.LJIL(sparkActivity, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, c1365870leD);
                }
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                this.LL = sparkActivity;
                EventBus.LIZLLL().LJIJJ(this);
            }
        });
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final void LIZ(ViewGroup viewGroup, C0TGX c0tgx) {
        PopupManager.LJIJI(new C0TWI(viewGroup, c0tgx), true);
    }
}
