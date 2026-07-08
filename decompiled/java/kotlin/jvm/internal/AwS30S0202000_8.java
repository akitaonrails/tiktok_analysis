package kotlin.jvm.internal;

import X.C09AY;
import X.C1322110kVd;
import X.C1463670oBx;
import X.C2475309mx;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.services.ISDKService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS30S0202000_8 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS30S0202000_8 awS30S0202000_8) {
        ((ISDKService.SplitCallback) awS30S0202000_8.l0).onSuccess(awS30S0202000_8.i3, awS30S0202000_8.i2);
        ((C1463670oBx) awS30S0202000_8.l1).destroy();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS30S0202000_8 awS30S0202000_8) {
        BitmapDrawable bitmapDrawable;
        Drawable drawable = ((C1322110kVd) awS30S0202000_8.l0).getDrawable();
        Bitmap bitmap = null;
        if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
            bitmap = bitmapDrawable.getBitmap();
        }
        ((C1322110kVd) awS30S0202000_8.l0).setImageBitmap(C2475309mx.LJII((Bitmap) awS30S0202000_8.l1, awS30S0202000_8.i2, awS30S0202000_8.i3, 0, 1));
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0202000_8(C1322110kVd c1322110kVd, Bitmap bitmap, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c1322110kVd;
        this.l1 = bitmap;
        this.i2 = i;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0202000_8(ISDKService.SplitCallback splitCallback, int i, int i2, C1463670oBx c1463670oBx, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = splitCallback;
        this.i3 = i;
        this.i2 = i2;
        this.l1 = c1463670oBx;
    }
}
