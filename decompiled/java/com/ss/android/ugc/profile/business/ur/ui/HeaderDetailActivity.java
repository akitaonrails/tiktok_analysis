package com.ss.android.ugc.profile.business.ur.ui;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XIR;
import X.C0XQ7;
import X.C1232410iAx;
import X.C1233040iBy;
import X.C1255030ilR;
import X.C1322200kVm;
import X.C1324630kZh;
import X.C1324840ka2;
import X.C1325700kbQ;
import X.C1325710kbR;
import X.C1329360khK;
import X.C1354920lMY;
import X.C1389600mGU;
import X.C2188811AlT;
import X.C23112093u;
import X.C2354709Kn;
import X.C452501pT;
import X.C810650Vr5;
import X.C844470XAv;
import X.InterfaceC1232420iAy;
import X.InterfaceC1255040ilS;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public class HeaderDetailActivity extends BaseActivity implements InterfaceC1255040ilS, InterfaceC1232420iAy {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISHELIOSspOjx9PTdiPCZ9ACAtLSohDCA4KCY/CSY4IDk6PDw=";
    public User LLILZIL;
    public C1325710kbR[] LLILZLL;
    public String LLJ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 747));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 744));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 745));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 746));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(520));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(521));

    @Override // X.InterfaceC1232420iAy
    public final void Pc0(boolean z) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.HeaderDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.HeaderDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.HeaderDetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.HeaderDetailActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.ui.HeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C1255030ilR LLLLZIL() {
        return (C1255030ilR) this.LLIZ.getValue();
    }

    public final ImageView LLLLZLL() {
        return (ImageView) this.LLILLJJLI.getValue();
    }

    public final ImageView LLLLZLLIL() {
        return (ImageView) this.LLILLL.getValue();
    }

    public final RemoteImageView LLLLZLLLI() {
        return (RemoteImageView) this.LL.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        int i = C1389600mGU.LIZIZ(this) ? 0 : R.anim.d_;
        overridePendingTransition(0, i);
    }

    @Override // X.InterfaceC1255040ilS
    public final void Eb0(AvatarUri avatarUri) {
        LLLLZIL().LIZLLL();
        if (avatarUri == null) {
            C1233040iBy c1233040iBy = new C1233040iBy(this);
            c1233040iBy.LIZIZ(2131824546);
            c1233040iBy.LIZLLL();
            return;
        }
        C1232410iAx c1232410iAx = (C1232410iAx) this.LLIZLLLIL.getValue();
        String str = avatarUri.uri;
        if (!c1232410iAx.LLILZIL) {
            c1232410iAx.LLILZIL = true;
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJJI(c1232410iAx.LLJILLL, c1232410iAx.LLIZLLLIL, str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file://");
        sbLIZ.append(this.LLJ);
        Uri uri = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
        C1322200kVm.LIZ().LIZJ(uri);
        LLLLLZL(LLLLZLLLI(), false, uri.toString());
    }

    public final C1325710kbR LLLLZI(String str) {
        int i;
        int i2;
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.LJ = false;
        C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
        c1325700kbQLIZLLL.LJFF = c1329360khK;
        Uri uri = UriProtector.parse(str);
        if (C2354709Kn.LIZIZ(uri.getPath())) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(uri.getPath(), options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            if (i3 <= 720 && i4 <= 1280) {
                i = 1;
            } else {
                int i5 = i3 >> 1;
                int i6 = i4 >> 1;
                i = 1;
                while (i5 / i > 720 && i6 / i > 1280) {
                    i <<= 1;
                }
            }
            int[] iArr = {i3 >> i, i4 >> i};
            int i7 = iArr[0];
            if (i7 > 0 && (i2 = iArr[1]) > 0) {
                c1325700kbQLIZLLL.LIZJ = new C1324630kZh(i7, i2);
            }
        }
        return c1325700kbQLIZLLL.LIZ();
    }

    @Override // X.InterfaceC1255040ilS
    public final void dN2(String str) {
        this.LLJ = str;
        LLLLZIL().LJII(0);
    }

    @Override // X.InterfaceC1255040ilS
    public final void hO(Exception exc) {
        if (isDestroyed()) {
            return;
        }
        LLLLZIL().LIZLLL();
        if ((exc instanceof C0XIR) && ((C23112093u) exc).getErrorCode() == 20022) {
            C810650Vr5.LIZ(this, "profile_image_setting", "review_failure");
        }
        C1354920lMY.LIZLLL(this, exc, 2131824546);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x030d  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.HeaderDetailActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC1232420iAy
    public final void JE2(int i, Exception exc) {
        if (isDestroyed()) {
            return;
        }
        if (4 == i) {
            LLLLZIL().LIZLLL();
            if ((exc instanceof C0XIR) && ((C23112093u) exc).getErrorCode() == 20022) {
                C810650Vr5.LIZ(this, "profile_image_setting", "review_failure");
            }
        } else if (i == 116) {
            return;
        }
        C1354920lMY.LIZLLL(this, exc, 2131845501);
    }

    @Override // X.InterfaceC1232420iAy
    public final void Ud0(int i, User user) {
        if (i == 4) {
            if (user.getAvatarMedium() != null) {
                RemoteImageView remoteImageViewLLLLZLLLI = LLLLZLLLI();
                String[] strArr = (String[]) user.getAvatarMedium().getUrlList().toArray(new String[0]);
                LLLLLZL(remoteImageViewLLLLZLLLI, false, (String[]) Arrays.copyOf(strArr, strArr.length));
            } else {
                C1324840ka2.LJFF(LLLLZLLLI(), user.getAvatarMedium());
            }
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZIZ(2131845488);
            c1233040iBy.LIZLLL();
        }
        LLLLZIL().LIZLLL();
    }

    @Override // X.InterfaceC1232420iAy
    public final void aL0(String str, boolean z) {
        if (isDestroyed()) {
            return;
        }
        LLLLZIL().LIZLLL();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C844470XAv.LIZ.getClass();
        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
        c1233040iBy.LIZJ(str);
        c1233040iBy.LIZLLL();
        if (z) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLZL(com.ss.android.ugc.aweme.base.ui.RemoteImageView r9, boolean r10, java.lang.String... r11) {
        /*
            r8 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r4 = 1
            if (r11 == 0) goto L22
            int r0 = r11.length
            if (r0 == 0) goto L22
            int r3 = r11.length
            r2 = 0
        Le:
            if (r2 >= r3) goto L22
            r1 = r11[r2]
            boolean r0 = X.C2093608Ic.LJ(r1)
            if (r0 != 0) goto L1f
            X.0kbR r0 = r8.LLLLZI(r1)
            r5.add(r0)
        L1f:
            int r2 = r2 + 1
            goto Le
        L22:
            r2 = 0
            if (r10 == 0) goto L6a
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.LLILZIL
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = X.C848410XPz.LIZ(r0)
            if (r0 == 0) goto L68
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L68
            X.0kbA r7 = X.C1322200kVm.LIZ()
            java.util.Iterator r3 = r0.iterator()
        L3b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            boolean r0 = r7.LJIIJJI(r0)
            if (r0 == 0) goto L3b
        L51:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L5b
            X.0kbR r2 = r8.LLLLZI(r1)
        L5b:
            boolean r0 = X.C1256140inE.LIZ(r5)
            if (r0 == 0) goto L6a
            r0 = 2130971789(0x7f040c8d, float:1.7552326E38)
            X.C1324840ka2.LIZ(r9, r0)
            return
        L68:
            r1 = r2
            goto L51
        L6a:
            X.0kbR[] r0 = new X.C1325710kbR[r6]
            java.lang.Object[] r0 = r5.toArray(r0)
            X.0kbR[] r0 = (X.C1325710kbR[]) r0
            r8.LLILZLL = r0
            X.0kTX r1 = X.C1322200kVm.LIZJ()
            X.0kbR[] r0 = r8.LLILZLL
            r1.LJFF(r0, r4)
            X.0kTb r0 = r9.getController()
            r1.LJIILJJIL = r0
            boolean r0 = r8 instanceof com.ss.android.ugc.profile.business.ur.ui.I18nHeaderDetailActivity
            r1.LJIIJJI = r0
            if (r2 == 0) goto L8b
            r1.LJ = r2
        L8b:
            X.0kTN r0 = r1.LIZ()
            r9.setController(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.HeaderDetailActivity.LLLLLZL(com.ss.android.ugc.aweme.base.ui.RemoteImageView, boolean, java.lang.String[]):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LLLLZIL().onActivityResult(i, i2, intent);
    }
}
