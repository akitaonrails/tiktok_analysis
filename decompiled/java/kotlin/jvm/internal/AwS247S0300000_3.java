package kotlin.jvm.internal;

import X.C080X;
import X.C09AY;
import X.C09I6;
import X.C1621190sI1;
import X.C19EG;
import X.C2020907vr;
import X.C2027407wu;
import X.C2142308aL;
import X.C2188811AlT;
import X.C259800zU;
import X.C724710Sbl;
import X.InterfaceC1670800ta2;
import X.InterfaceC723730SaB;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.compression.zstd.ZstdDecompress;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.retrofit2.mime.AbsTypedOutput;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadApiData;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui.TakoDisclaimerWithTosFragment;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public class AwS247S0300000_3 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS247S0300000_3 r5) {
        /*
            java.lang.Object r4 = r5.l0
            com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui.TakoDisclaimerWithTosFragment r4 = (com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui.TakoDisclaimerWithTosFragment) r4
            java.lang.Object r2 = r5.l1
            com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel r2 = (com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel) r2
            java.lang.Object r1 = r5.l2
            java.util.Map r1 = (java.util.Map) r1
            r4.getClass()
            if (r1 == 0) goto L4b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L4b
            java.lang.String r0 = r2.url
            if (r0 == 0) goto L4f
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r0 == 0) goto L4f
            android.net.Uri$Builder r3 = r0.buildUpon()
            if (r3 == 0) goto L4f
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.appendQueryParameter(r1, r0)
            goto L2f
        L4b:
            java.lang.String r2 = r2.url
            if (r2 != 0) goto L5e
        L4f:
            java.lang.String r2 = ""
            goto L5e
        L52:
            android.net.Uri r0 = r3.build()
            if (r0 == 0) goto L4f
            java.lang.String r2 = r0.toString()
            if (r2 == 0) goto L4f
        L5e:
            java.lang.String r0 = "aweme://webview/"
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "url"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r2)
            android.net.Uri r0 = r0.build()
            java.lang.String r1 = r0.toString()
            android.content.Context r0 = r4.getContext()
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r1)
            r0.open()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS247S0300000_3.invoke$0(kotlin.jvm.internal.AwS247S0300000_3):java.lang.Object");
    }

    public static final Object invoke$1(AwS247S0300000_3 awS247S0300000_3) {
        C2027407wu c2027407wu = C2027407wu.LIZ;
        Context context = (Context) awS247S0300000_3.l0;
        PlaceholderInfoModel placeholderInfoModel = (PlaceholderInfoModel) awS247S0300000_3.l1;
        Map map = (Map) awS247S0300000_3.l2;
        c2027407wu.getClass();
        C2027407wu.LIZIZ(context, placeholderInfoModel, map);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS247S0300000_3 awS247S0300000_3) {
        ((LiveData) awS247S0300000_3.l0).observe((LifecycleOwner) awS247S0300000_3.l1, (Observer) awS247S0300000_3.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$3(AwS247S0300000_3 awS247S0300000_3) {
        Object obj = awS247S0300000_3.l0;
        if (obj == null) {
            return ((C2142308aL) awS247S0300000_3.l1).LL.invoke((K) awS247S0300000_3.l2);
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.String] */
    public static final Object invoke$4(AwS247S0300000_3 awS247S0300000_3) throws Throwable {
        byte[] byteArray;
        AbsTypedOutput absTypedOutput;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request body is AbsTypedOutput = ");
        sbLIZ.append(((TypedOutput) awS247S0300000_3.l0) instanceof AbsTypedOutput);
        sbLIZ.append(", compressType=");
        TypedOutput typedOutput = (TypedOutput) awS247S0300000_3.l0;
        String strBodyCompressType = null;
        if ((typedOutput instanceof AbsTypedOutput) && (absTypedOutput = (AbsTypedOutput) typedOutput) != null) {
            strBodyCompressType = absTypedOutput.bodyCompressType();
        }
        sbLIZ.append(strBodyCompressType);
        C2188811AlT.LIZIZ(sbLIZ);
        TypedOutput typedOutput2 = (TypedOutput) awS247S0300000_3.l0;
        if (typedOutput2 instanceof AbsTypedOutput) {
            String strBodyCompressType2 = ((AbsTypedOutput) typedOutput2).bodyCompressType();
            if (Intrinsics.LJFF(strBodyCompressType2, "gzip")) {
                byte[] byteArray2 = ((ByteArrayOutputStream) awS247S0300000_3.l1).toByteArray();
                if (byteArray2 != null) {
                    try {
                        byte[] bArrGzipDecompress = TTRequestCompressManager.gzipDecompress(byteArray2);
                        if (bArrGzipDecompress != null) {
                            ((C259800zU) awS247S0300000_3.l2).element = new String(bArrGzipDecompress, Charsets.UTF_8);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } else if (Intrinsics.LJFF(strBodyCompressType2, "zstd") && (byteArray = ((ByteArrayOutputStream) awS247S0300000_3.l1).toByteArray()) != null) {
                try {
                    byte[] bArrDecompress = ZstdDecompress.decompress(byteArray);
                    if (bArrDecompress != null) {
                        ((C259800zU) awS247S0300000_3.l2).element = new String(bArrDecompress, Charsets.UTF_8);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS247S0300000_3 awS247S0300000_3) {
        if (((List) awS247S0300000_3.l0).size() == ((List) awS247S0300000_3.l1).size()) {
            ((Function2) awS247S0300000_3.l2).invoke(C09I6.COMPLETE, (List) awS247S0300000_3.l1);
        } else {
            ((Function2) awS247S0300000_3.l2).invoke(C09I6.ERROR, (List) awS247S0300000_3.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.String] */
    public static final Object invoke$6(AwS247S0300000_3 awS247S0300000_3) throws Throwable {
        byte[] byteArray;
        AbsTypedOutput absTypedOutput;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request body os is AbsTypedOutput = ");
        sbLIZ.append(((TypedOutput) awS247S0300000_3.l0) instanceof AbsTypedOutput);
        sbLIZ.append(", compressType=");
        TypedOutput typedOutput = (TypedOutput) awS247S0300000_3.l0;
        String strBodyCompressType = null;
        if ((typedOutput instanceof AbsTypedOutput) && (absTypedOutput = (AbsTypedOutput) typedOutput) != null) {
            strBodyCompressType = absTypedOutput.bodyCompressType();
        }
        sbLIZ.append(strBodyCompressType);
        C2188811AlT.LIZIZ(sbLIZ);
        TypedOutput typedOutput2 = (TypedOutput) awS247S0300000_3.l0;
        if (typedOutput2 instanceof AbsTypedOutput) {
            String strBodyCompressType2 = ((AbsTypedOutput) typedOutput2).bodyCompressType();
            if (Intrinsics.LJFF(strBodyCompressType2, "gzip")) {
                byte[] byteArray2 = ((ByteArrayOutputStream) awS247S0300000_3.l1).toByteArray();
                if (byteArray2 != null) {
                    try {
                        byte[] bArrGzipDecompress = TTRequestCompressManager.gzipDecompress(byteArray2);
                        if (bArrGzipDecompress != null) {
                            ((C259800zU) awS247S0300000_3.l2).element = new String(bArrGzipDecompress, Charsets.UTF_8);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } else if (Intrinsics.LJFF(strBodyCompressType2, "zstd") && (byteArray = ((ByteArrayOutputStream) awS247S0300000_3.l1).toByteArray()) != null) {
                try {
                    byte[] bArrDecompress = ZstdDecompress.decompress(byteArray);
                    if (bArrDecompress != null) {
                        ((C259800zU) awS247S0300000_3.l2).element = new String(bArrDecompress, Charsets.UTF_8);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS247S0300000_3 awS247S0300000_3) {
        Map<String, ? extends Object> map = (Map) awS247S0300000_3.l0;
        if (map != null) {
            C080X c080x = (C080X) awS247S0300000_3.l1;
            c080x.LIZ.invoke((ArrayList) awS247S0300000_3.l2, map, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS247S0300000_3 awS247S0300000_3) {
        Lifecycle lifecycle = ((C19EG) awS247S0300000_3.l0).getLifecycle();
        final C19EG c19eg = (C19EG) awS247S0300000_3.l0;
        final C724710Sbl c724710Sbl = (C724710Sbl) awS247S0300000_3.l1;
        final Assembler assembler = (Assembler) awS247S0300000_3.l2;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.arch.extensions.assemble.ActivityAssembleExtKt$activityAssembleInit$serviceStore$1$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (C2020907vr.LIZ[event.ordinal()] == 1) {
                    InterfaceC1670800ta2 interfaceC1670800ta2 = c19eg;
                    if (interfaceC1670800ta2 instanceof InterfaceC723730SaB) {
                        C724710Sbl c724710Sbl2 = c724710Sbl;
                        InterfaceC723730SaB interfaceC723730SaB = (InterfaceC723730SaB) interfaceC1670800ta2;
                        Class<?> superclass = interfaceC723730SaB.getClass();
                        Class<?>[] interfaces = superclass.getInterfaces();
                        if (interfaces != null && interfaces.length != 0) {
                            while (superclass != Object.class) {
                                Class<?>[] interfaces2 = superclass.getInterfaces();
                                ArrayList arrayList = new ArrayList();
                                for (Class<?> cls : interfaces2) {
                                    if (InterfaceC723730SaB.class.isAssignableFrom(cls)) {
                                        arrayList.add(cls);
                                    }
                                }
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    c724710Sbl2.LJ((Class) it2.next(), interfaceC723730SaB);
                                }
                                superclass = superclass.getSuperclass();
                                if (superclass == null) {
                                    break;
                                }
                            }
                        }
                    }
                    assembler.xQ2(c19eg);
                }
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS247S0300000_3(C19EG c19eg, C724710Sbl c724710Sbl, Assembler assembler, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = c724710Sbl;
        this.l2 = assembler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS247S0300000_3(Context context, Context context2, PlaceholderInfoModel placeholderInfoModel, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = placeholderInfoModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS247S0300000_3(LiveData liveData, BaseActivity baseActivity, Observer observer, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveData;
        this.l1 = baseActivity;
        this.l2 = observer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS247S0300000_3(TypedOutput typedOutput, TypedOutput typedOutput2, ByteArrayOutputStream byteArrayOutputStream, C259800zU<String> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = typedOutput;
        this.l1 = typedOutput2;
        this.l2 = byteArrayOutputStream;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS247S0300000_3(TakoDisclaimerWithTosFragment takoDisclaimerWithTosFragment, TakoDisclaimerWithTosFragment takoDisclaimerWithTosFragment2, PlaceholderInfoModel placeholderInfoModel, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l0 = takoDisclaimerWithTosFragment;
        this.l1 = takoDisclaimerWithTosFragment2;
        this.l2 = placeholderInfoModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS247S0300000_3(Object obj, Object obj2, C2142308aL<Object, Object> c2142308aL, Object obj3) {
        super(0);
        this.$t = obj3;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = c2142308aL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS247S0300000_3(List list, List<C1621190sI1> list2, List<VEFrame> list3, Function2<? super C09I6, ? super List<? extends VEFrame>, Unit> function2) {
        super(0);
        this.$t = function2;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS247S0300000_3(Map map, Map<String, ? extends Object> map2, C080X c080x, ArrayList<ECPreloadApiData> arrayList) {
        super(0);
        this.$t = arrayList;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = c080x;
    }
}
