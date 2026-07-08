package com.google.android.gms.common.images;

import X.C0W0T;
import X.C786410Ut5;
import X.C817940W6u;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new Parcelable.Creator<WebImage>() { // from class: X.0VzL
        @Override // android.os.Parcelable.Creator
        public final WebImage createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            Uri uri = null;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                            }
                        } else {
                            iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        uri = (Uri) C0W6J.LJI(parcel, i, Uri.CREATOR);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new WebImage(iLJIJJLI, uri, iLJIJJLI3, iLJIJJLI2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WebImage[] newArray(int i) {
            return new WebImage[i];
        }
    };
    public final int LL;
    public final Uri zab;
    public final int zac;
    public final int zad;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zab, Integer.valueOf(this.zac), Integer.valueOf(this.zad)});
    }

    public final String toString() {
        return C786410Ut5.k4(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.zac), Integer.valueOf(this.zad), this.zab.toString()});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WebImage(JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = UriProtector.parse(JSONObjectProtectorUtils.getString(jSONObject, "url"));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (C0W0T.LIZIZ(this.zab, webImage.zab) && this.zac == webImage.zac && this.zad == webImage.zad) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIZILJ(parcel, 2, this.zab, i, false);
        C817940W6u.LJIIJ(parcel, 3, this.zac);
        C817940W6u.LJIIJ(parcel, 4, this.zad);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public WebImage(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri != null) {
            if (i >= 0 && i2 >= 0) {
                return;
            } else {
                throw new IllegalArgumentException("width and height must not be negative");
            }
        }
        throw new IllegalArgumentException("url cannot be null");
    }

    public WebImage(int i, Uri uri, int i2, int i3) {
        this.LL = i;
        this.zab = uri;
        this.zac = i2;
        this.zad = i3;
    }
}
