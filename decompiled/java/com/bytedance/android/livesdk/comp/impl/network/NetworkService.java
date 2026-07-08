package com.bytedance.android.livesdk.comp.impl.network;

import X.AbstractC2343909Gj;
import X.C01GW;
import X.C09S8;
import X.C09SJ;
import X.C09SM;
import X.C09SQ;
import X.C09SS;
import X.C09UD;
import X.C0IMD;
import X.C0K8R;
import X.C0X9S;
import X.C1161920gLG;
import X.C1500830p9t;
import X.C1502000pBm;
import X.C1506350pIn;
import X.C1508660pMW;
import X.C1508670pMX;
import X.C1508680pMY;
import X.C1514050pVD;
import X.C1515090pWt;
import X.C1515390pXN;
import X.C1516530pZD;
import X.C1528330psF;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2163708dn;
import X.C2188811AlT;
import X.C2336109Dj;
import X.C2396409aE;
import X.C496230Jd7;
import X.C497120JeY;
import X.C520610KbL;
import X.InterfaceC1132110fZB;
import X.InterfaceC1502020pBo;
import X.InterfaceC1528010prj;
import X.InterfaceC2221911Bxl;
import android.content.Context;
import com.bytedance.android.live.network.ResponseInterceptorV2;
import com.bytedance.android.live.network.combine.LiveCombineResponse;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.android.live.network.interceptors.InjectFeedFeatureInterceptor;
import com.bytedance.android.live.network.interceptors.NtpTimeInterceptor;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public class NetworkService implements INetworkService {
    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final List<AbstractC2343909Gj> mk1() {
        C01GW c01gw = C1515390pXN.LIZ;
        List<AbstractC2343909Gj> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C1528330psF(new C2336109Dj((Gson) c01gw.getValue())), new C1506350pIn());
        if (LiveCombineRequestExp.INSTANCE.enable()) {
            final Gson gson = (Gson) c01gw.getValue();
            listLJIILJJIL.add(new AbstractC2343909Gj(gson) { // from class: X.09E0
                public static final /* synthetic */ int LIZIZ = 0;
                public final Gson LIZ;

                @Override // X.AbstractC2343909Gj
                public final InterfaceC1501660pBE<?, TypedOutput> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
                    return null;
                }

                {
                    this.LIZ = gson;
                }

                @Override // X.AbstractC2343909Gj
                public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
                    if (!(type instanceof ParameterizedType)) {
                        return null;
                    }
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Type rawType = parameterizedType.getRawType();
                    if (!(rawType instanceof Class) || !C1515820pY4.class.isAssignableFrom((Class) rawType)) {
                        return null;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    if (actualTypeArguments.length == 1) {
                        Type type2 = actualTypeArguments[0];
                        if (!(type2 instanceof Class) || !Intrinsics.LJFF(type2, LiveCombineResponse.class)) {
                            return null;
                        }
                        return new C09G9(this.LIZ, this.LIZ.LJIIIZ(TypeToken.get((Class) type2)));
                    }
                    throw new RuntimeException("ChunkBundle should have one generic type.");
                }
            });
        }
        return listLJIILJJIL;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void SI0() {
        C497120JeY<C496230Jd7> c497120JeY = C497120JeY.LJIIZILJ;
        c497120JeY.LJIILL = true;
        c497120JeY.LJFF.clear();
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final NtpTimeInterceptor X01() {
        return new NtpTimeInterceptor();
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final InjectFeedFeatureInterceptor kR0() {
        return new InjectFeedFeatureInterceptor();
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final Map K60() {
        C1514050pVD c1514050pVDLIZ = C1514050pVD.LIZ();
        c1514050pVDLIZ.getClass();
        Map<String, String> commonParams = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getCommonParams();
        c1514050pVDLIZ.LIZJ.LIZJ(commonParams);
        return commonParams;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final Retrofit P80() {
        return C1515090pWt.LIZ().LIZLLL;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final ResponseInterceptorV2 e72() {
        return ResponseInterceptorV2.LIZ();
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final Map<String, String> getCommonParams() {
        C1514050pVD c1514050pVDLIZ = C1514050pVD.LIZ();
        c1514050pVDLIZ.getClass();
        Map<String, String> commonParams = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getCommonParams();
        c1514050pVDLIZ.LIZJ.LIZJ(commonParams);
        return commonParams;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final String getHostDomain() {
        C1514050pVD.LIZ().getClass();
        return ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getHostDomain();
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void Co1(Map<String, String> map) {
        C1514050pVD.LIZ().LIZJ.LIZJ(map);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void Ht1(Map<Class<?>, ? extends C0IMD<?>> map) {
        ((ConcurrentHashMap) C1514050pVD.LIZ().LIZ).putAll(map);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void Pg0(C1502000pBm c1502000pBm) {
        C1515090pWt c1515090pWtLIZ = C1515090pWt.LIZ();
        if (c1502000pBm == null) {
            c1515090pWtLIZ.getClass();
        } else {
            ((CopyOnWriteArrayList) c1515090pWtLIZ.LJII).remove(c1502000pBm);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final <T> InterfaceC1132110fZB<T> R00(Class<T> cls) {
        C1514050pVD c1514050pVDLIZ = C1514050pVD.LIZ();
        InterfaceC1132110fZB<T> interfaceC1132110fZB = (InterfaceC1132110fZB) ((ConcurrentHashMap) c1514050pVDLIZ.LIZIZ).get(cls);
        if (interfaceC1132110fZB == null) {
            Object objLIZIZ = C1514050pVD.LIZIZ(cls, "_ProtoEncoder");
            if (objLIZIZ != null) {
                interfaceC1132110fZB = (InterfaceC1132110fZB) objLIZIZ;
                if (interfaceC1132110fZB != null) {
                    ((ConcurrentHashMap) c1514050pVDLIZ.LIZIZ).put(cls, interfaceC1132110fZB);
                }
            } else {
                return null;
            }
        }
        return interfaceC1132110fZB;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void RF1(C1502000pBm c1502000pBm) {
        C1515090pWt c1515090pWtLIZ = C1515090pWt.LIZ();
        if (c1502000pBm != null) {
            if (!((CopyOnWriteArrayList) c1515090pWtLIZ.LJII).contains(c1502000pBm)) {
                ((CopyOnWriteArrayList) c1515090pWtLIZ.LJII).add(c1502000pBm);
                return;
            }
            return;
        }
        c1515090pWtLIZ.getClass();
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void Rb1(Map<Class<?>, ? extends InterfaceC1132110fZB<?>> map) {
        ((ConcurrentHashMap) C1514050pVD.LIZ().LIZIZ).putAll(map);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final <T> T SP2(Class<T> cls) {
        C1515090pWt c1515090pWtLIZ = C1515090pWt.LIZ();
        T t = (T) c1515090pWtLIZ.LIZ.get(cls);
        if (t == null) {
            ConcurrentHashMap<Class, Object> concurrentHashMap = c1515090pWtLIZ.LIZ;
            t = (T) c1515090pWtLIZ.LJ.LIZ(cls);
            concurrentHashMap.putIfAbsent(cls, t);
        }
        Iterator it2 = ((CopyOnWriteArrayList) c1515090pWtLIZ.LJII).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1502020pBo) it2.next()).LIZ(cls);
        }
        return t;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final boolean cc0(C09SJ<?, ?> c09sj) {
        if (!(c09sj instanceof C09UD)) {
            return false;
        }
        C09UD c09ud = (C09UD) c09sj;
        c09ud.getClass();
        if (!C09UD.LJ.getValue().optBoolean(c09ud.LIZIZ.key, false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final <T> T eo1(Class<T> cls) {
        C1515090pWt c1515090pWtLIZ = C1515090pWt.LIZ();
        T t = (T) c1515090pWtLIZ.LIZJ.get(cls);
        if (t == null) {
            ConcurrentHashMap<Class, Object> concurrentHashMap = c1515090pWtLIZ.LIZJ;
            t = (T) c1515090pWtLIZ.LJI.LIZ(cls);
            concurrentHashMap.putIfAbsent(cls, t);
        }
        Iterator it2 = ((CopyOnWriteArrayList) c1515090pWtLIZ.LJII).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1502020pBo) it2.next()).LIZ(cls);
        }
        return t;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final <T> T getService(Class<T> cls) {
        C1515090pWt c1515090pWtLIZ = C1515090pWt.LIZ();
        T t = (T) c1515090pWtLIZ.LIZIZ.get(cls);
        if (t == null) {
            t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C1516530pZD(c1515090pWtLIZ.LJFF, cls));
            c1515090pWtLIZ.LIZIZ.putIfAbsent(cls, t);
        }
        Iterator it2 = ((CopyOnWriteArrayList) c1515090pWtLIZ.LJII).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1502020pBo) it2.next()).LIZ(cls);
        }
        return t;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void iG(C2163708dn c2163708dn) {
        C1508670pMX.LIZ.add(c2163708dn);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final List<C09S8> lr2(boolean z) {
        if (z) {
            return C1697810uHb.LJIILJJIL(new C09SS(C2396409aE.LIZIZ()), new C09SM(0), new C09SQ());
        }
        return C1697810uHb.LJIILJJIL(new C09SS(new C2396409aE(true)), new C09SM(0), new C09SQ());
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final <T> C0IMD<T> qL2(Class<T> cls) {
        C1514050pVD c1514050pVDLIZ = C1514050pVD.LIZ();
        C0IMD<T> c0imd = (C0IMD) ((ConcurrentHashMap) c1514050pVDLIZ.LIZ).get(cls);
        if (c0imd == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getProtoDecoder pb decoder class from map failed. class:");
            sbLIZ.append(cls);
            C20441214yg.LJIIIZ("NetworkServiceProvider", C2188811AlT.LIZIZ(sbLIZ));
            Object objLIZIZ = C1514050pVD.LIZIZ(cls, "_ProtoDecoder");
            if (objLIZIZ != null) {
                c0imd = (C0IMD) objLIZIZ;
                if (c0imd != null) {
                    ((ConcurrentHashMap) c1514050pVDLIZ.LIZ).put(cls, c0imd);
                }
            } else {
                return null;
            }
        }
        return c0imd;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final C0K8R<C1500830p9t> get(String str, List<? extends C520610KbL> list) {
        C1508660pMW c1508660pMW = C1514050pVD.LIZ().LIZJ;
        C1508680pMY c1508680pMY = new C1508680pMY(str, list);
        c1508660pMW.LIZIZ(c1508680pMY);
        return ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).get(c1508680pMY.LIZ, list, null);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final C0K8R<C1500830p9t> get(String str, List<? extends C520610KbL> list, Object obj) {
        C1508660pMW c1508660pMW = C1514050pVD.LIZ().LIZJ;
        C1508680pMY c1508680pMY = new C1508680pMY(str, list);
        c1508660pMW.LIZIZ(c1508680pMY);
        return ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).get(c1508680pMY.LIZ, list, obj);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final C0K8R<C1500830p9t> LU1(String str, List<? extends C520610KbL> list, String str2, byte[] bArr) {
        return C1514050pVD.LIZ().LIZLLL(str, list, str2, bArr, null);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final C0X9S<TypedInput> do3rdPartPost(String str, Map<String, String> map, String str2, byte[] bArr) {
        C1514050pVD.LIZ().getClass();
        return ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).do3rdPartPost(str, map, str2, bArr);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final InterfaceC2221911Bxl registerWsChannel(Context context, String str, Map<String, String> map, InterfaceC1528010prj interfaceC1528010prj) {
        C1514050pVD.LIZ().getClass();
        return ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerWsChannel(context, str, map, interfaceC1528010prj);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final C0K8R<C1500830p9t> downloadFile(boolean z, int i, String str, List<? extends C520610KbL> list, Object obj) {
        C1508660pMW c1508660pMW = C1514050pVD.LIZ().LIZJ;
        C1508680pMY c1508680pMY = new C1508680pMY(str, list);
        c1508660pMW.LIZIZ(c1508680pMY);
        return ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).downloadFile(false, Integer.MAX_VALUE, c1508680pMY.LIZ, list, null);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final C0K8R<C1500830p9t> post(String str, List<? extends C520610KbL> list, String str2, byte[] bArr, Object obj) {
        return C1514050pVD.LIZ().LIZLLL(str, list, str2, bArr, obj);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final C0K8R<C1500830p9t> uploadFile(int i, String str, List<? extends C520610KbL> list, String str2, byte[] bArr, long j, String str3) {
        C1508660pMW c1508660pMW = C1514050pVD.LIZ().LIZJ;
        C1508680pMY c1508680pMY = new C1508680pMY(str, list);
        c1508660pMW.LIZIZ(c1508680pMY);
        return ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).uploadFile(i, c1508680pMY.LIZ, list, str2, bArr, j, str3);
    }
}
