package com.bytedance.android.livesdk.chatroom.banner.panel.model;

import X.C1092380eX6;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C2469909m5;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class BannerPanelItem implements Parcelable {
    public final String bannerId;
    public final int color;
    public final boolean isLight;
    public final String schema;
    public final String title;
    public static final C1092380eX6 Companion = new Object() { // from class: X.0eX6
    };
    public static final Parcelable.Creator<BannerPanelItem> CREATOR = new Parcelable.Creator<BannerPanelItem>() { // from class: X.0ehq
        @Override // android.os.Parcelable.Creator
        public final BannerPanelItem createFromParcel(Parcel parcel) {
            return new BannerPanelItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BannerPanelItem[] newArray(int i) {
            return new BannerPanelItem[i];
        }
    };
    public String activityId = "";
    public String bannerType = "default";

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.bannerId);
        parcel.writeString(this.schema);
    }

    public static int LIZ() {
        Context topContext;
        Integer numLIZJ;
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction == null || (topContext = iHostAction.getTopContext()) == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.fx1, topContext)) == null) {
            return -1;
        }
        return numLIZJ.intValue();
    }

    public BannerPanelItem(String str, String str2, String str3) {
        int iLIZ;
        boolean z;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uri;
        this.title = str;
        this.bannerId = str2;
        this.schema = str3;
        try {
            Uri uri2 = UriProtector.parse(str3);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "loading_bg_color");
            if ((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null && ((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "url")) == null || (uri = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "loading_bg_color")) == null)) || (iLIZ = Color.parseColor(C2469909m5.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2))) == 0) {
                iLIZ = LIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            iLIZ = LIZ();
        }
        this.color = iLIZ;
        boolean z2 = true;
        try {
            int iLIZ2 = LIZ();
            float fAlpha = Color.alpha(iLIZ) / 255.0f;
            float fAlpha2 = Color.alpha(iLIZ2) / 255.0f;
            if (fAlpha != 1.0f) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                float f = 1 - fAlpha;
                float f2 = (fAlpha2 * f) + fAlpha;
                iLIZ = Color.argb((int) (f2 * 255), (int) (((Color.red(iLIZ) * fAlpha) + ((Color.red(iLIZ2) * fAlpha2) * f)) / f2), (int) (((Color.green(iLIZ) * fAlpha) + ((Color.green(iLIZ2) * fAlpha2) * f)) / f2), (int) (((Color.blue(iLIZ) * fAlpha) + ((Color.blue(iLIZ2) * fAlpha2) * f)) / f2));
            }
            float f3 = 255;
            if ((((Color.red(iLIZ) / f3) + (Color.green(iLIZ) / f3)) + (Color.blue(iLIZ) / f3)) / 3 < 0.5d) {
                z2 = false;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        this.isLight = z2;
    }
}
