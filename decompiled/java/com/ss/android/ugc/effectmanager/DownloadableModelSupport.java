package com.ss.android.ugc.effectmanager;

import X.AbstractC20000013Ne;
import X.C1284770jXP;
import X.C13MA;
import X.C13NE;
import X.C13OY;
import X.C13Q5;
import X.C13QU;
import X.C13SS;
import X.C1528550psb;
import X.C1662010tLr;
import X.C1700140uLM;
import X.C20001113Np;
import X.C20005113Pd;
import X.C20005413Pg;
import X.C20005513Ph;
import X.C20005613Pi;
import X.C20005913Pl;
import X.C20006413Pq;
import X.C20006713Pt;
import X.C20007313Pz;
import X.C2188811AlT;
import X.InterfaceC20001313Nr;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.common.utils.Preconditions;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS274S0300000_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class DownloadableModelSupport {
    public static DownloadableModelSupport INSTANCE;
    public static DownloadableModelSupportLibraryLoader sLibraryLoader = new DownloadableModelSupportLibraryLoader.SystemLoader();
    public final DownloadableModelConfig config;
    public DownloadableModelSupportResourceFinder resourceFinder;

    public interface EventListener extends ModelEventListener {
    }

    public EffectFetcher getEffectFetcher() {
        return null;
    }

    public static DownloadableModelSupport getInstance() {
        DownloadableModelSupport downloadableModelSupport = INSTANCE;
        if (downloadableModelSupport != null) {
            return downloadableModelSupport;
        }
        throw new IllegalStateException("downloadableModelSupport not initialize");
    }

    public static boolean isInitialized() {
        return INSTANCE != null;
    }

    public static void loadSo() {
        C1700140uLM.LIZ.LIZ();
    }

    private DownloadableModelSupportResourceFinder getOrCreateResourceFinder() {
        if (!C13Q5.LIZJ()) {
            throw new IllegalStateException("AlgorithmResourceManager hasn't been initialized");
        }
        if (this.resourceFinder == null) {
            this.resourceFinder = new DownloadableModelSupportResourceFinder();
        }
        return this.resourceFinder;
    }

    public DownloadableModelSupportResourceFinder getResourceFinder() {
        return getOrCreateResourceFinder();
    }

    public DownloadableModelSupport(DownloadableModelConfig downloadableModelConfig) {
        this.config = downloadableModelConfig;
    }

    public static synchronized void initialize(DownloadableModelConfig downloadableModelConfig) {
        if (downloadableModelConfig != null) {
            if (downloadableModelConfig.getKNEffectConfig() != null) {
                if (INSTANCE != null) {
                    return;
                }
                if (!C13Q5.LIZJ()) {
                    C20005413Pg.LJ(downloadableModelConfig.getKNEffectConfig());
                }
                INSTANCE = new DownloadableModelSupport(downloadableModelConfig);
                return;
            }
        }
        throw new NullPointerException();
    }

    public static void setLibraryLoader(DownloadableModelSupportLibraryLoader downloadableModelSupportLibraryLoader) {
        Preconditions.checkNotNull(downloadableModelSupportLibraryLoader);
        sLibraryLoader = downloadableModelSupportLibraryLoader;
        C20005413Pg.LJIIIZ = downloadableModelSupportLibraryLoader;
        C1700140uLM.LIZIZ = downloadableModelSupportLibraryLoader;
    }

    public int getMaxDowngradeLevelForRequirements(String[] strArr) {
        String[] strArrLIZ;
        C20006713Pt c20006713PtLIZIZ;
        Map<String, ModelInfo> mapLIZIZ;
        ModelInfo modelInfo;
        List<ModelInfo> demotion_list;
        Integer num;
        int iIntValue;
        if (!C13Q5.LIZJ()) {
            return 0;
        }
        C20005413Pg c20005413PgLIZ = C13Q5.LIZ();
        List listAsList = Arrays.asList(strArr);
        C20005513Ph c20005513Ph = c20005413PgLIZ.LJFF;
        c20005513Ph.getClass();
        if (listAsList.isEmpty() || (strArrLIZ = C1284770jXP.LIZ((String[]) listAsList.toArray(new String[0]))) == null) {
            return 0;
        }
        int i = 0;
        for (String str : strArrLIZ) {
            String strLIZLLL = C20006413Pq.LIZLLL(str);
            C20005913Pl c20005913Pl = c20005513Ph.LIZIZ;
            if (c20005913Pl != null && (c20006713PtLIZIZ = c20005913Pl.LIZIZ(0, true)) != null && (mapLIZIZ = c20006713PtLIZIZ.LIZIZ()) != null && (modelInfo = (ModelInfo) ((LinkedHashMap) mapLIZIZ).get(strLIZLLL)) != null && (demotion_list = modelInfo.getDemotion_list()) != null) {
                Iterator<ModelInfo> it2 = demotion_list.iterator();
                if (it2.hasNext()) {
                    Integer numValueOf = Integer.valueOf(it2.next().getLevel());
                    while (true) {
                        num = numValueOf;
                        while (it2.hasNext()) {
                            numValueOf = Integer.valueOf(it2.next().getLevel());
                            if (num.compareTo(numValueOf) < 0) {
                                break;
                            }
                        }
                    }
                    if (num != null && (iIntValue = num.intValue()) > i) {
                        i = iIntValue;
                    }
                }
            }
        }
        return i;
    }

    public void fetchResourcesNeededByRequirements(String[] strArr, IFetchModelListener iFetchModelListener) {
        if (!C13Q5.LIZJ()) {
            return;
        }
        C20005413Pg c20005413PgLIZ = C13Q5.LIZ();
        List listAsList = Arrays.asList(strArr);
        C13MA<String[]> kNListener = ModelListenerAdaptKt.toKNListener(iFetchModelListener);
        C20005513Ph c20005513Ph = c20005413PgLIZ.LJFF;
        c20005513Ph.getClass();
        C20005513Ph.LJ(listAsList);
        C20001113Np c20001113Np = c20005513Ph.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(new C20007313Pz(c20005513Ph, listAsList, kNListener, C1528550psb.LIZ()));
        }
    }

    public boolean isEffectReady(EffectManager effectManager, Effect effect) {
        boolean zLIZ;
        boolean z;
        boolean z2;
        if (C13Q5.LIZJ()) {
            if (effectManager.getKNEffectPlatform() != null) {
                C20005413Pg c20005413PgLIZ = C13Q5.LIZ();
                C13OY kNEffectPlatform = effectManager.getKNEffectPlatform();
                long jCurrentTimeMillis = System.currentTimeMillis();
                C13QU c13qu = C13QU.LIZIZ;
                if (c13qu.LIZIZ() && (!a0.LJJJIL(effect.getUnzipPath()))) {
                    String unzipPath = effect.getUnzipPath();
                    long jLIZ = c13qu.LIZ();
                    Long l = (Long) ((ConcurrentHashMap) C13NE.LIZ.getValue()).get(unzipPath);
                    if (l != null && System.currentTimeMillis() - l.longValue() < jLIZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("effectPath: ");
                    sbLIZ.append(unzipPath);
                    sbLIZ.append(", isReadyByCache: ");
                    sbLIZ.append(z);
                    sbLIZ.append(". has: ");
                    if (l != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sbLIZ.append(z2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c13ss.getClass();
                    C13SS.LIZ("isEffectReadyWithCache", strLIZIZ);
                    if (z) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("effect: ");
                        sbLIZ2.append(effect.getEffect_id());
                        sbLIZ2.append(", name:");
                        sbLIZ2.append(effect.getName());
                        sbLIZ2.append(", readyByCache");
                        C13SS.LIZ("isEffectReady", C2188811AlT.LIZIZ(sbLIZ2));
                        return true;
                    }
                }
                if (kNEffectPlatform.LJIJ(effect)) {
                    zLIZ = c20005413PgLIZ.LJFF.LIZ(effect);
                } else {
                    zLIZ = false;
                }
                if (c13qu.LIZIZ() && zLIZ) {
                    String unzipPath2 = effect.getUnzipPath();
                    if (!a0.LJJJIL(unzipPath2)) {
                        ((ConcurrentHashMap) C13NE.LIZ.getValue()).put(unzipPath2, Long.valueOf(System.currentTimeMillis()));
                    }
                }
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("effect: ");
                sbLIZ3.append(effect.getEffect_id());
                sbLIZ3.append(", name:");
                sbLIZ3.append(effect.getName());
                sbLIZ3.append(", result: ");
                sbLIZ3.append(zLIZ);
                sbLIZ3.append(", time cost: ");
                sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sbLIZ3.append(" ms");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                c13ss2.getClass();
                C13SS.LIZ("isEffectReady", strLIZIZ2);
                return zLIZ;
            }
            throw new IllegalStateException("KNEffectPlatform is null");
        }
        throw new IllegalStateException("AlgorithmResourceManager hasn't been initialized");
    }

    public void fetchResourcesNeededByRequirements(List<String> list, IFetchModelListener iFetchModelListener) {
        if (!C13Q5.LIZJ()) {
            return;
        }
        C20005413Pg c20005413PgLIZ = C13Q5.LIZ();
        C13MA<String[]> kNListener = ModelListenerAdaptKt.toKNListener(iFetchModelListener);
        C20005513Ph c20005513Ph = c20005413PgLIZ.LJFF;
        c20005513Ph.getClass();
        C20005513Ph.LJ(list);
        C20001113Np c20001113Np = c20005513Ph.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(new C20007313Pz(c20005513Ph, list, kNListener, C1528550psb.LIZ()));
        }
    }

    public void fetchResourcesByRequirementsAndModelNames(String[] strArr, Map<String, List<String>> map, IFetchResourceListener iFetchResourceListener) {
        boolean zLJI = MethodIDManager.LJI(137699);
        if (!C13Q5.LIZJ()) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            C13Q5.LIZ().LIZ(strArr, map, IFetchResourceListenerKt.toKNListener(iFetchResourceListener));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public void fetchResourcesNeededByRequirements(String[] strArr, final boolean z, IFetchModelListener iFetchModelListener) {
        if (!C13Q5.LIZJ()) {
            return;
        }
        C20005413Pg c20005413PgLIZ = C13Q5.LIZ();
        final List listAsList = Arrays.asList(strArr);
        final C13MA<String[]> kNListener = ModelListenerAdaptKt.toKNListener(iFetchModelListener);
        final C20005513Ph c20005513Ph = c20005413PgLIZ.LJFF;
        c20005513Ph.getClass();
        C20005513Ph.LJ(listAsList);
        C20001113Np c20001113Np = c20005513Ph.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            final String strLIZ = C1528550psb.LIZ();
            c20001113Np.LIZIZ(new AbstractC20000013Ne(strLIZ) { // from class: X.13Pf
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.AbstractC20000013Ne
                public final void execute() {
                    try {
                        c20005513Ph.LIZJ().LIZLLL(z, listAsList, null);
                        C13MA<String[]> c13ma = kNListener;
                        if (c13ma != 0) {
                            c13ma.onSuccess(listAsList.toArray(new String[0]));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C13MA<String[]> c13ma2 = kNListener;
                        if (c13ma2 != null) {
                            c13ma2.onFail(null, new C1662010tLr(e));
                        }
                    }
                }

                @Override // X.AbstractC20000013Ne
                public final void onCancel() {
                }

                @Override // X.AbstractC20000013Ne, X.InterfaceC20001313Nr
                public final void pause(boolean z2) {
                }
            });
        }
    }

    public void fetchResourcesWithModelNames(int i, final String[] strArr, final FetchResourcesListener fetchResourcesListener) {
        if (C20005513Ph.LJI == null) {
            C20005513Ph.LJI = new C20005513Ph(this.config.getKNEffectConfig());
        }
        C20005513Ph c20005513PhLIZ = C20005113Pd.LIZ();
        final C13MA<String[]> c13ma = new C13MA<String[]>() { // from class: com.ss.android.ugc.effectmanager.DownloadableModelSupport.1
            @Override // X.C13MA
            public void preProcess(String[] strArr2) {
            }

            @Override // X.C13MA
            public void onSuccess(String[] strArr2) {
                FetchResourcesListener fetchResourcesListener2 = fetchResourcesListener;
                if (fetchResourcesListener2 != null) {
                    fetchResourcesListener2.onSuccess();
                }
            }

            @Override // X.C13MA
            public void onFail(String[] strArr2, C1662010tLr c1662010tLr) {
                FetchResourcesListener fetchResourcesListener2 = fetchResourcesListener;
                if (fetchResourcesListener2 != null) {
                    fetchResourcesListener2.onFailed(c1662010tLr.LIZLLL);
                }
            }
        };
        boolean zLJI = MethodIDManager.LJI(137926);
        final C20005613Pi c20005613Pi = new C20005613Pi(c20005513PhLIZ.LIZ, c20005513PhLIZ.LIZIZ, c20005513PhLIZ.LJ, c20005513PhLIZ.LIZLLL, strArr, i, 8128);
        C20001113Np c20001113Np = c20005513PhLIZ.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(new InterfaceC20001313Nr() { // from class: X.13Q0
                public int LIZ;
                public long LIZIZ;

                @Override // X.InterfaceC20001313Nr
                public final void cancel() {
                }

                @Override // X.InterfaceC20001313Nr
                public final String getId() {
                    return "";
                }

                @Override // X.InterfaceC20001313Nr
                public final void pause(boolean z) {
                }

                @Override // X.InterfaceC20001313Nr
                public final void setTag(String str) {
                }

                @Override // X.InterfaceC20001313Nr
                public final void run() {
                    try {
                        c20005613Pi.run();
                        C13QI.LIZ(new RunnableC514801zW(new AwS431S0200000_30((C13MA) c13ma, (C13MA<String[]>) strArr, (String[]) 55), (Function0<Unit>) 165));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C13QI.LIZ(new RunnableC514801zW(new AwS274S0300000_30((C13MA) c13ma, (C13MA<String[]>) strArr, (String[]) e, (Exception) 16), (Function0<Unit>) 165));
                    }
                }

                @Override // X.InterfaceC20001313Nr
                public final int getLevel() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC20001313Nr
                public final long getModifyTime() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC20001313Nr
                public final void setLevel(int i2) {
                    this.LIZ = i2;
                }

                @Override // X.InterfaceC20001313Nr
                public final void setModifyTime(long j) {
                    this.LIZIZ = j;
                }
            });
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void fetchResourcesNeededByRequirements(String[] strArr, final int i, IFetchModelListener iFetchModelListener) {
        if (!C13Q5.LIZJ()) {
            return;
        }
        C20005413Pg c20005413PgLIZ = C13Q5.LIZ();
        final List listAsList = Arrays.asList(strArr);
        final C13MA<String[]> kNListener = ModelListenerAdaptKt.toKNListener(iFetchModelListener);
        final C20005513Ph c20005513Ph = c20005413PgLIZ.LJFF;
        C20001113Np c20001113Np = c20005513Ph.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            final String strLIZ = C1528550psb.LIZ();
            c20001113Np.LIZIZ(new AbstractC20000013Ne(strLIZ) { // from class: X.13Pc
                @Override // X.AbstractC20000013Ne
                public final void onCancel() {
                }

                @Override // X.AbstractC20000013Ne, X.InterfaceC20001313Nr
                public final void pause(boolean z) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.AbstractC20000013Ne
                public final void execute() {
                    try {
                        c20005513Ph.LIZJ().LIZJ(i, listAsList);
                        C13MA<String[]> c13ma = kNListener;
                        if (c13ma != 0) {
                            c13ma.onSuccess(listAsList.toArray(new String[0]));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C13MA<String[]> c13ma2 = kNListener;
                        if (c13ma2 != null) {
                            c13ma2.onFail(null, new C1662010tLr(e));
                        }
                    }
                }
            });
        }
    }
}
