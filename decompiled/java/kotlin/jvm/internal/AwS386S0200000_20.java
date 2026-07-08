package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0U3O;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1290330jgN;
import X.C1317600kOM;
import X.C1322200kVm;
import X.C1323050kX9;
import X.C1324660kZk;
import X.C1325120kaU;
import X.C1325290kal;
import X.C1325710kbR;
import X.C1328060kfE;
import X.C1623820sMG;
import X.C16F5;
import X.C189200o6;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2252611DEt;
import X.C259800zU;
import X.C500260Jjc;
import X.C530820Kro;
import X.InterfaceC1325590kbF;
import X.InterfaceC20236714Gf;
import android.graphics.Bitmap;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.ExifInterface;
import android.net.Uri;
import com.bytedance.android.livesdk.broadcast.interaction.widget.debug.MockImageVideoWidget;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AwS386S0200000_20 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS386S0200000_20 awS386S0200000_20, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unzipAndFindJson failed: zip=");
        sbLIZ.append(((File) awS386S0200000_20.l0).getAbsolutePath());
        sbLIZ.append(", err=");
        sbLIZ.append(((Throwable) awS386S0200000_20.l1).getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS386S0200000_20 awS386S0200000_20, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((MockImageVideoWidget) awS386S0200000_20.l0).x1((C16F5) awS386S0200000_20.l1);
        } else {
            C500260Jjc.LJIILIIL((C16F5) awS386S0200000_20.l1);
            C500260Jjc.LJIILIIL(((MockImageVideoWidget) awS386S0200000_20.l0).LLJI);
            ((MockImageVideoWidget) awS386S0200000_20.l0).B1();
            ((MockImageVideoWidget) awS386S0200000_20.l0).A1();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS386S0200000_20 awS386S0200000_20, Object obj) throws Throwable {
        C2204961BRm.LJJLIIIJJI((SensorManager) awS386S0200000_20.l0, (SensorEventListener) awS386S0200000_20.l1, new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8J0V7e9qgMGxsaWRQe4rC+V3hU=", null));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS386S0200000_20 awS386S0200000_20, Object obj) throws Throwable {
        boolean latLong;
        ExifInterface exifInterface = (ExifInterface) awS386S0200000_20.l0;
        float[] fArr = (float[]) awS386S0200000_20.l1;
        String strLJLIL = null;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqvTs6u2WD2EmrYxSEV0iJkW04=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {fArr};
        C0WZW c0wzw = new C0WZW(false, "([F)Z", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(771, "android/media/ExifInterface", "getLatLong", exifInterface, objArr, "boolean", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(771, "android/media/ExifInterface", "getLatLong", null, objArr, exifInterface, c0wzw, false);
            latLong = ((Boolean) c0wsuLIZIZ.LIZIZ).booleanValue();
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj2 = objArr2[0];
                if (obj2 != null) {
                    exifInterface = (ExifInterface) obj2;
                }
                Object obj3 = objArr2[1];
                if (obj3 != null) {
                    fArr = (float[]) obj3;
                }
            }
            latLong = exifInterface.getLatLong(fArr);
            c0wst.LIZ(771, "android/media/ExifInterface", "getLatLong", Boolean.valueOf(latLong), objArr, exifInterface, c0wzw, true);
        }
        Boolean boolValueOf = Boolean.valueOf(latLong);
        if (latLong) {
            strLJLIL = C2204961BRm.LJLIL((ExifInterface) awS386S0200000_20.l0, "GPSStatus", new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqvTs6u2WD2EmrYxSEV0iJkW04=", null));
        }
        return new Pair(boolValueOf, strLJLIL);
    }

    public static final Object invoke$3(AwS386S0200000_20 awS386S0200000_20, Object obj) throws JSONException {
        JSONObject jSONObject;
        Object c098200Yq;
        String server_extra;
        JSONObject jSONObject2 = (JSONObject) obj;
        jSONObject2.put("use_effect", 1);
        C1623820sMG c1623820sMG = (C1623820sMG) awS386S0200000_20.l0;
        Effect effect = (Effect) awS386S0200000_20.l1;
        if (effect == null) {
            c1623820sMG.getClass();
            jSONObject = new JSONObject();
        } else {
            HashMap<String, JSONObject> map = c1623820sMG.LL;
            String effect_id = effect.getEffect_id();
            jSONObject = map.get(effect_id);
            if (jSONObject == null) {
                String server_extra2 = effect.getServer_extra();
                if (server_extra2 != null && !a0.LJJJIL(server_extra2)) {
                    try {
                        server_extra = effect.getServer_extra();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (server_extra != null) {
                        c098200Yq = new JSONObject(server_extra);
                        C189200o6.m2constructorimpl(c098200Yq);
                        JSONObject jSONObject3 = new JSONObject();
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = jSONObject3;
                        }
                        jSONObject = ((JSONObject) c098200Yq).optJSONObject("effect_features");
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    jSONObject = new JSONObject();
                }
                map.put(effect_id, jSONObject);
            }
        }
        jSONObject2.put("effect_label", jSONObject);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS386S0200000_20 awS386S0200000_20, Object obj) throws IllegalAccessException {
        C259800zU c259800zU = (C259800zU) awS386S0200000_20.l0;
        Object obj2 = ((Field) obj).get(((C1317600kOM) awS386S0200000_20.l1).LIZLLL.get());
        T t = obj2;
        if (obj2 == null) {
            t = 0;
        }
        c259800zU.element = t;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS386S0200000_20 awS386S0200000_20, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = null;
        c1324660kZkLIZIZ = null;
        C1324660kZk c1324660kZkLIZIZ = null;
        bitmap2 = null;
        if (bitmap != null && !bitmap.isRecycled()) {
            Bitmap bitmapLIZ = C1325290kal.LIZ(bitmap);
            C1325710kbR c1325710kbR = (C1325710kbR) awS386S0200000_20.l0;
            InterfaceC1325590kbF interfaceC1325590kbF = C1322200kVm.LIZ().LJIIJJI;
            if (interfaceC1325590kbF != null && c1325710kbR != null) {
                c1324660kZkLIZIZ = c1325710kbR.LJIJJ != null ? interfaceC1325590kbF.LIZIZ(c1325710kbR, null) : interfaceC1325590kbF.LIZJ(c1325710kbR, null);
            }
            C1323050kX9 c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(new C1325120kaU(bitmap, C530820Kro.LIZIZ(), C1328060kfE.LIZLLL, 0));
            C1323050kX9 c1323050kX9LJ = C1322200kVm.LIZ().LIZLLL.LJ(c1324660kZkLIZIZ, c1323050kX9LJIJJLI);
            if (c1323050kX9LJIJJLI != null) {
                c1323050kX9LJIJJLI.close();
            }
            if (c1323050kX9LJ != null) {
                c1323050kX9LJ.close();
            }
            bitmap2 = bitmapLIZ;
        }
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS386S0200000_20.l1;
        C189200o6.m2constructorimpl(bitmap2);
        interfaceC20236714Gf.resumeWith(bitmap2);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS386S0200000_20 awS386S0200000_20, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed url=");
        sbLIZ.append((Uri) awS386S0200000_20.l0);
        sbLIZ.append(", throwable=");
        sbLIZ.append((Throwable) awS386S0200000_20.l1);
        sbLIZ.append('}');
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS386S0200000_20 awS386S0200000_20, Object obj) {
        C0U3O c0u3o = (C0U3O) obj;
        c0u3o.LJFF(new AwS587S0100000_8((Function1) awS386S0200000_20.l0, 729));
        c0u3o.LIZIZ(new AwS634S0100000_20((Function1) awS386S0200000_20.l1, (Function1<? super String, Unit>) 5));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS386S0200000_20 awS386S0200000_20, Object obj) {
        ((C1290330jgN) awS386S0200000_20.l0).LJFF.put(((IHostSubscription.SpriteImage) awS386S0200000_20.l1).url, obj);
        C1290330jgN c1290330jgN = (C1290330jgN) awS386S0200000_20.l0;
        if (c1290330jgN.LJII.decrementAndGet() == 0) {
            c1290330jgN.LIZIZ.invoke(Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS386S0200000_20 awS386S0200000_20, Object obj) {
        ((C1290330jgN) awS386S0200000_20.l0).LJFF.remove(((IHostSubscription.SpriteImage) awS386S0200000_20.l1).url);
        C1290330jgN c1290330jgN = (C1290330jgN) awS386S0200000_20.l0;
        if (c1290330jgN.LJII.decrementAndGet() == 0) {
            c1290330jgN.LIZIZ.invoke(Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS386S0200000_20(C259800zU c259800zU, C259800zU<F> c259800zU2, C1317600kOM<T, F> c1317600kOM) {
        super(1);
        this.$t = c1317600kOM;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS386S0200000_20(C1290330jgN c1290330jgN, IHostSubscription.SpriteImage spriteImage, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1290330jgN;
        this.l1 = spriteImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS386S0200000_20(C1325710kbR c1325710kbR, C2252611DEt c2252611DEt, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1325710kbR;
        this.l1 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS386S0200000_20(C1623820sMG c1623820sMG, Effect effect, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1623820sMG;
        this.l1 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS386S0200000_20(SensorManager sensorManager, SensorEventListener sensorEventListener, int i) {
        super(1);
        this.$t = i;
        this.l0 = sensorManager;
        this.l1 = sensorEventListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS386S0200000_20(ExifInterface exifInterface, float[] fArr, int i) {
        super(1);
        this.$t = i;
        this.l0 = exifInterface;
        this.l1 = fArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS386S0200000_20(Uri uri, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.l0 = uri;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS386S0200000_20(MockImageVideoWidget mockImageVideoWidget, C16F5 c16f5, int i) {
        super(1);
        this.$t = i;
        this.l0 = mockImageVideoWidget;
        this.l1 = c16f5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS386S0200000_20(File file, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.l0 = file;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS386S0200000_20(AwS386S0200000_20 awS386S0200000_20, AwS386S0200000_20 awS386S0200000_202, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS386S0200000_20;
        this.l1 = awS386S0200000_202;
    }
}
