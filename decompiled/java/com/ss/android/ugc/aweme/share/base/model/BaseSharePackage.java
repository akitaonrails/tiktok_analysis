package com.ss.android.ugc.aweme.share.base.model;

import X.AbstractC1375550ltp;
import X.AbstractC19483511Kn;
import X.C0M7Y;
import X.C1370910lmL;
import X.C1370930lmN;
import X.C1371430lnB;
import X.C1402020maW;
import X.C786410Ut5;
import X.InterfaceC1254030ijp;
import X.InterfaceC1294060jmO;
import X.InterfaceC1369790lkX;
import X.InterfaceC1370310llN;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS144S0201000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class BaseSharePackage implements Parcelable {
    public final String description;
    public final Bundle extras;
    public final String identifier;
    public String itemType;
    public final ShareContentType[] shareContentTypes;
    public final ShareModel shareModel;
    public final String title;
    public String url;
    public static final C1370930lmN Companion = new Object() { // from class: X.0lmN
    };
    public static final Parcelable.Creator<BaseSharePackage> CREATOR = new C1402020maW(5);

    public boolean LIZJ() {
        return !(this instanceof HybridImageSharePackage);
    }

    public boolean LIZLLL(InterfaceC1369790lkX interfaceC1369790lkX) {
        return true;
    }

    @InterfaceC1294060jmO
    public boolean LJI(Context context, InterfaceC1369790lkX interfaceC1369790lkX) {
        return false;
    }

    public boolean LJIIJJI(InterfaceC1370310llN interfaceC1370310llN, Context context) {
        return false;
    }

    public List<String> LJIJI() {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 < 5) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJFF() {
        /*
            r8 = this;
            X.0llk r0 = X.C1370370llT.LJII
            r7 = 0
            if (r0 == 0) goto L2d
            int r5 = r0.LJII()
        L9:
            android.os.Bundle r1 = r8.extras
            java.lang.String r6 = "enter_method"
            java.lang.String r0 = ""
            java.lang.String r0 = r1.getString(r6, r0)
            java.lang.String r4 = "share_panel"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            r3 = 5
            r2 = 3
            r0 = 1
            if (r1 == 0) goto L2f
            if (r0 > r5) goto L2f
            if (r5 >= r2) goto L2a
            boolean r0 = r8.LJIJJ()
            if (r0 != 0) goto L2c
            if (r2 > r5) goto L2f
        L2a:
            if (r5 >= r3) goto L2f
        L2c:
            return r5
        L2d:
            r5 = 0
            goto L9
        L2f:
            android.os.Bundle r1 = r8.extras
            java.lang.String r0 = "panel_source"
            java.lang.String r0 = r1.getString(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L50
            android.os.Bundle r0 = r8.extras
            java.lang.String r1 = r0.getString(r6)
            java.lang.String r0 = "live_cover"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L50
            if (r2 > r5) goto L50
            if (r5 >= r3) goto L50
            return r5
        L50:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.base.model.BaseSharePackage.LJFF():int");
    }

    public final boolean LJIILIIL() {
        return this.extras.getBoolean("drag_to_expand_handle_visible", false);
    }

    public final boolean LJIILJJIL() {
        if (this.extras.containsKey("is_portrait")) {
            return Intrinsics.LJFF(LIZIZ(this.extras, "is_portrait"), Boolean.TRUE);
        }
        return true;
    }

    public final boolean LJIILL() {
        return this.extras.getBoolean("share_panel_use_vertical_im", false);
    }

    public final boolean LJIJJ() {
        return this.extras.containsKey("use_small_style_on_large_screen") && this.extras.containsKey("enter_method") && Intrinsics.LJFF(LIZIZ(this.extras, "use_small_style_on_large_screen"), Boolean.TRUE) && Intrinsics.LJFF(LIZIZ(this.extras, "enter_method"), "share_panel");
    }

    public BaseSharePackage(C1370910lmL c1370910lmL) {
        Bundle bundle = new Bundle();
        this.extras = bundle;
        String str = c1370910lmL.LIZ;
        this.itemType = str == null ? "" : str;
        String str2 = c1370910lmL.LIZIZ;
        this.identifier = str2 == null ? "" : str2;
        this.shareContentTypes = c1370910lmL.LIZJ;
        String str3 = c1370910lmL.LIZLLL;
        this.title = str3 == null ? "" : str3;
        String str4 = c1370910lmL.LJ;
        this.description = str4 == null ? "" : str4;
        String str5 = c1370910lmL.LJFF;
        this.url = str5 != null ? str5 : "";
        this.shareModel = c1370910lmL.LJI;
        C786410Ut5.LJJIIJZLJL(bundle, c1370910lmL.LJII);
    }

    public final Object LJ(String str) {
        Bundle bundle;
        if (this.extras.containsKey("share_panel_config") && (bundle = this.extras.getBundle("share_panel_config")) != null) {
            return LIZIZ(bundle, str);
        }
        return null;
    }

    public AbstractC1375550ltp LJIILLIIL(InterfaceC1369790lkX interfaceC1369790lkX) {
        return new C1371430lnB(this.url, (String) null, 6);
    }

    public AbstractC19483511Kn<AbstractC1375550ltp> LJIIZILJ(final InterfaceC1369790lkX interfaceC1369790lkX) {
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmQ
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(this.LIZ.LJIILLIIL(interfaceC1369790lkX));
            }
        });
    }

    public static Object LIZIZ(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public void LJIJ(InterfaceC1369790lkX interfaceC1369790lkX, Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2) {
        function2.invoke(LJIILLIIL(interfaceC1369790lkX), Boolean.TRUE);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemType);
        parcel.writeString(this.identifier);
        parcel.writeArray(this.shareContentTypes);
        parcel.writeParcelable(this.shareModel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
        parcel.writeBundle(this.extras);
    }

    public void LJIIL(Context context, InterfaceC1370310llN interfaceC1370310llN, AwS144S0201000_21 awS144S0201000_21) {
        awS144S0201000_21.invoke();
    }

    public void LJIIIZ(Context context, InterfaceC1369790lkX interfaceC1369790lkX, View view, Function0<Unit> function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        return LJI(context, interfaceC1369790lkX);
    }
}
