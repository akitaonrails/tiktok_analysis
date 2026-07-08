package com.ss.android.ugc.aweme.poi.quiz.assem;

import X.AnonymousClass0956;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0PEM;
import X.C1165940gRk;
import X.C1175020ggO;
import X.C1175120ggY;
import X.C1176580giu;
import X.C1177030gjd;
import X.C1177960gl8;
import X.C1178010glD;
import X.C1178050glH;
import X.C1178200glW;
import X.C1178250glb;
import X.C1178260glc;
import X.C1178280gle;
import X.C1178290glf;
import X.C1178310glh;
import X.C1178440glu;
import X.C1178480gly;
import X.C1178490glz;
import X.C1179470gnZ;
import X.C1179570gnj;
import X.C1180740gpc;
import X.C1192290h8F;
import X.C1203050hPb;
import X.C1205490hTX;
import X.C1388190mED;
import X.C13LE;
import X.C15438062q;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C2217381BqS;
import X.C2255108sX;
import X.C23250099c;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1182690gsl;
import X.EnumC1182750gsr;
import X.EnumC1203090hPf;
import X.EnumC1205570hTf;
import X.InterfaceC1176690gj5;
import X.InterfaceC1177110gjl;
import X.InterfaceC1177250gjz;
import X.InterfaceC1206010hUN;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.AComparatorS37S0000000_18;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.MessageSyncer;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.quiz.data.Location;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizItem;
import com.ss.android.ugc.aweme.poi.quiz.map.PoiQuizMapClusterPicLoader;
import com.ss.android.ugc.aweme.poi.quiz.permission.PoiQuizMapPermissionChangeObserver;
import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizMapVM;
import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizPageVM;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizHomePageMapAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final MessageSyncer LLJI;
    public InterfaceC1177250gjz LLJIJIL;
    public final C1178050glH LLJILJIL;
    public InterfaceC1177110gjl<C1178200glW> LLJILJILJ;
    public final Set<Function1<Boolean, Unit>> LLJILLL;
    public PoiQuizMapClusterPicLoader LLJJ;
    public EnumC1182690gsl LLJJI;
    public EnumC1182750gsr LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final PoiQuizMapPermissionChangeObserver LLJJJ;
    public C1179570gnj LLJJJIL;
    public FrameLayout LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public boolean LLJLILLLLZIIL;
    public Integer LLJLL;
    public boolean LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiQuizHomePageMapAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/quiz/vm/PoiQuizPageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiQuizHomePageMapAssem.class, "mapVM", "getMapVM()Lcom/ss/android/ugc/aweme/poi/quiz/vm/PoiQuizMapVM;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0glH] */
    public PoiQuizHomePageMapAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiQuizPageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS556S0100000_12(c19719912DlLIZ, 561), AFwS256S0000000_18.get$arr$(549), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiQuizMapVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS556S0100000_12(c19719912DlLIZ2, 562), AFwS256S0000000_18.get$arr$(550), null, true);
        this.LLJI = new MessageSyncer();
        this.LLJILJIL = new InterfaceC1206010hUN<C1178200glW>() { // from class: X.0glH
            @Override // X.InterfaceC1206010hUN
            public final Set<InterfaceC1177120gjm<C1178200glW>> LIZ(Set<? extends InterfaceC1177120gjm<C1178200glW>> set) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    InterfaceC1177120gjm interfaceC1177120gjm = (InterfaceC1177120gjm) it2.next();
                    if (interfaceC1177120gjm != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it3 = interfaceC1177120gjm.getItems().iterator();
                        while (it3.hasNext()) {
                            arrayList.add(it3.next());
                        }
                        linkedHashSet.add(new C1178020glE(interfaceC1177120gjm.getPosition(), C13LP.LJLLLL(new AComparatorS37S0000000_18(17), arrayList)));
                    }
                }
                return linkedHashSet;
            }
        };
        this.LLJILLL = new LinkedHashSet();
        this.LLJJIJI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(435));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1679));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1677));
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        this.LLJJJ = new PoiQuizMapPermissionChangeObserver(iLocationBaseServiceForMT != null ? iLocationBaseServiceForMT.LJIIZILJ() : null, new AwS562S0100000_18(this, 1678));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1676));
        this.LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1681));
        this.LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1680));
        this.LLJLL = 0;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1192290h8F.LIZ(this, "poi_quiz", null, false, null, null, 30);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 779));
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 781));
    }

    public final PoiQuizMapVM Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (PoiQuizMapVM) assemVMLazy.getValue();
    }

    public final int Lo() {
        return ((Number) this.LLJJIJIL.getValue()).intValue();
    }

    public final PoiQuizPageVM No() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (PoiQuizPageVM) assemVMLazy.getValue();
    }

    public final C1178440glu Oo() {
        return (C1178440glu) this.LLJJIJIIJIL.getValue();
    }

    public final void Ho() {
        C1178440glu c1178440gluOo = Oo();
        if (c1178440gluOo != null) {
            if (c1178440gluOo.LIZJ != null) {
                c1178440gluOo.LJ.LJ(c1178440gluOo);
            } else {
                c1178440gluOo.LIZIZ(new AwS562S0100000_18(c1178440gluOo, 2652), new AwS597S0100000_18(c1178440gluOo, 960));
            }
        }
    }

    public final void Vo(C1175020ggO c1175020ggO) {
        PoiQuizItem poiQuizItem;
        Double dValueOf;
        Double dValueOf2;
        ArrayList arrayList;
        InterfaceC1177250gjz interfaceC1177250gjz;
        Double dValueOf3;
        Double dValueOf4;
        Float f;
        Float f2;
        Location location;
        Float f3;
        Location location2;
        Float f4;
        PoiQuizItem next;
        String str;
        try {
            List<PoiQuizItem> listVQ2 = No().vQ2();
            if (listVQ2 != null) {
                Iterator<PoiQuizItem> it2 = listVQ2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        String str2 = next.poiId;
                        if (c1175020ggO != null) {
                            str = c1175020ggO.LIZ;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str2, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                poiQuizItem = next;
            } else {
                poiQuizItem = null;
            }
            if (poiQuizItem != null && (location2 = poiQuizItem.location) != null && (f4 = location2.lat) != null) {
                dValueOf = Double.valueOf(f4.floatValue());
            } else {
                dValueOf = null;
            }
            double dLIZ = C1175120ggY.LIZ(dValueOf);
            if (poiQuizItem != null && (location = poiQuizItem.location) != null && (f3 = location.lng) != null) {
                dValueOf2 = Double.valueOf(f3.floatValue());
            } else {
                dValueOf2 = null;
            }
            C1177960gl8 c1177960gl8 = new C1177960gl8(dLIZ, C1175120ggY.LIZ(dValueOf2));
            List<PoiQuizItem> listVQ22 = No().vQ2();
            if (listVQ22 != null) {
                ArrayList<PoiQuizItem> arrayList2 = new ArrayList();
                for (PoiQuizItem poiQuizItem2 : listVQ22) {
                    Location location3 = poiQuizItem2.location;
                    if (location3 != null && location3.lat != null && location3.lng != null) {
                        arrayList2.add(poiQuizItem2);
                    }
                }
                arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (PoiQuizItem poiQuizItem3 : arrayList2) {
                    Location location4 = poiQuizItem3.location;
                    if (location4 != null && (f2 = location4.lat) != null) {
                        dValueOf3 = Double.valueOf(f2.floatValue());
                    } else {
                        dValueOf3 = null;
                    }
                    double dLIZ2 = C1175120ggY.LIZ(dValueOf3);
                    Location location5 = poiQuizItem3.location;
                    if (location5 != null && (f = location5.lng) != null) {
                        dValueOf4 = Double.valueOf(f.floatValue());
                    } else {
                        dValueOf4 = null;
                    }
                    arrayList.add(new C1177960gl8(dLIZ2, C1175120ggY.LIZ(dValueOf4)));
                }
            } else {
                arrayList = null;
            }
            C1177030gjd.LIZ.getClass();
            List listLIZ = C1177030gjd.LIZ(arrayList, c1177960gl8);
            if (listLIZ != null && (interfaceC1177250gjz = this.LLJIJIL) != null) {
                C1178480gly c1178480gly = new C1178480gly();
                c1178480gly.LIZ = false;
                C1177960gl8[] c1177960gl8Arr = (C1177960gl8[]) listLIZ.toArray(new C1177960gl8[0]);
                interfaceC1177250gjz.LJIIIIZZ(100, c1178480gly, (C1177960gl8[]) Arrays.copyOf(c1177960gl8Arr, c1177960gl8Arr.length));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            EnumC1205570hTf enumC1205570hTf = EnumC1205570hTf.POI_QUIZ_MAP_ERROR;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(enumC1205570hTf, "initial_poi_pick", null, e);
        }
    }

    public final void Zo(C1175020ggO c1175020ggO) {
        Iterable data;
        C1178490glz c1178490glz;
        InterfaceC1177250gjz interfaceC1177250gjz;
        C1165940gRk c1165940gRkLJJIJIIJIL;
        C1176580giu c1176580giu;
        C1178490glz c1178490glzLIZ;
        String str;
        TuxIconView tuxIconView = this.LLJJJJJIL;
        if (tuxIconView != null) {
            C339190DRl.LIZIZ(tuxIconView);
        }
        InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl = this.LLJILJILJ;
        Object obj = null;
        if (interfaceC1177110gjl != null && (data = interfaceC1177110gjl.getData()) != null) {
            Iterator it2 = data.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                String str2 = ((C1178200glW) next).LIZ;
                if (c1175020ggO != null) {
                    str = c1175020ggO.LIZ;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    obj = next;
                    break;
                }
            }
            C1178200glW c1178200glW = (C1178200glW) obj;
            if (c1178200glW != null && (c1178490glz = c1178200glW.LJIIIIZZ) != null && (interfaceC1177250gjz = this.LLJIJIL) != null && (c1165940gRkLJJIJIIJIL = interfaceC1177250gjz.LJJIJIIJIL()) != null && (c1176580giu = c1165940gRkLJJIJIIJIL.bounds) != null && (c1178490glzLIZ = C1178010glD.LIZ(c1176580giu, c1178490glz, (Pair) this.LLJL.getValue(), ((Number) this.LLJLIL.getValue()).intValue())) != null) {
                C1179570gnj c1179570gnj = this.LLJJJIL;
                if (c1179570gnj != null) {
                    c1179570gnj.LLILZ = true;
                }
                C1177960gl8 c1177960gl8LIZJ = C1178010glD.LIZJ(c1178490glzLIZ);
                Float fValueOf = Float.valueOf(interfaceC1177250gjz.LJIJJ());
                C1178480gly c1178480gly = new C1178480gly();
                c1178480gly.LIZ = true;
                c1178480gly.LIZIZ = 300L;
                c1178480gly.LIZJ = new AwS562S0100000_18(this, 2519);
                c1178480gly.LIZLLL = AFwS206S0000000_18.get$arr$(692);
                interfaceC1177250gjz.LIZIZ(c1177960gl8LIZJ, fValueOf, c1178480gly);
            }
        }
    }

    public final void ap(C1175020ggO c1175020ggO) {
        IPoiMapService iPoiMapService;
        C1176580giu c1176580giuLIZ;
        PoiQuizItem poiQuizItem;
        double dFloatValue;
        Float f;
        Location location;
        Float f2;
        PoiQuizItem next;
        String str;
        Float f3;
        try {
            List<PoiQuizItem> listVQ2 = No().vQ2();
            if (listVQ2 != null) {
                ArrayList arrayList = new ArrayList();
                for (PoiQuizItem poiQuizItem2 : listVQ2) {
                    Location location2 = poiQuizItem2.location;
                    if (location2 != null && (f3 = location2.lat) != null) {
                        float fFloatValue = f3.floatValue();
                        if (poiQuizItem2.location.lng != null) {
                            arrayList.add(new C1177960gl8(fFloatValue, r0.floatValue()));
                        }
                    }
                }
                if ((!arrayList.isEmpty()) && (iPoiMapService = (IPoiMapService) PluggableExtentionKt.pluggableSpi$default(IPoiMapService.class, false, false, false, 14, null)) != null && (c1176580giuLIZ = iPoiMapService.LIZ(arrayList)) != null) {
                    C1176580giu c1176580giuLIZIZ = C1178010glD.LIZIZ(c1176580giuLIZ, new Pair(Integer.valueOf(((DisplayMetrics) this.LLJJIJI.getValue()).widthPixels), Integer.valueOf((((DisplayMetrics) this.LLJJIJI.getValue()).heightPixels - Lo()) - C1178310glh.LIZIZ)), (Pair) this.LLJL.getValue(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
                    if (c1176580giuLIZIZ == null) {
                        return;
                    }
                    List<PoiQuizItem> listVQ22 = No().vQ2();
                    if (listVQ22 != null) {
                        Iterator<PoiQuizItem> it2 = listVQ22.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                String str2 = next.poiId;
                                if (c1175020ggO != null) {
                                    str = c1175020ggO.LIZ;
                                } else {
                                    str = null;
                                }
                                if (Intrinsics.LJFF(str2, str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        poiQuizItem = next;
                    } else {
                        poiQuizItem = null;
                    }
                    double dFloatValue2 = 0.0d;
                    if (poiQuizItem != null && (location = poiQuizItem.location) != null && (f2 = location.lat) != null) {
                        dFloatValue = f2.floatValue();
                    } else {
                        dFloatValue = 0.0d;
                        if (poiQuizItem != null) {
                        }
                        Go(this, c1176580giuLIZIZ, new C1178490glz(dFloatValue, dFloatValue2), false, 12);
                    }
                    Location location3 = poiQuizItem.location;
                    if (location3 != null && (f = location3.lng) != null) {
                        dFloatValue2 = f.floatValue();
                    }
                    Go(this, c1176580giuLIZIZ, new C1178490glz(dFloatValue, dFloatValue2), false, 12);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            EnumC1205570hTf enumC1205570hTf = EnumC1205570hTf.POI_QUIZ_MAP_ERROR;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(enumC1205570hTf, "move in poi pick", null, e);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        super.onViewCreated(view);
        this.LLJJJIL = (C1179570gnj) view.findViewById(R.id.r99);
        this.LLJJJJ = (FrameLayout) view.findViewById(R.id.r96);
        this.LLJJJJJIL = (TuxIconView) view.findViewById(R.id.r97);
        C1179570gnj c1179570gnj = this.LLJJJIL;
        if (c1179570gnj != null) {
            c1179570gnj.LLILZLL = new AwS632S0100000_18(this, 237);
        }
        TuxIconView tuxIconView = this.LLJJJJJIL;
        if (tuxIconView != null) {
            C339190DRl.LIZIZ(tuxIconView);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_scope;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
            tuxIconView.setBackground(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(tuxIconView.getContext())));
            C786410Ut5.I7(new AbS699S0100000_18(this, 47), tuxIconView);
        }
        C1178440glu c1178440gluOo = Oo();
        if (c1178440gluOo != null) {
            c1178440gluOo.LIZIZ = Jo();
        }
        getLifecycle().addObserver(this.LLJJJ);
        C1180740gpc.LIZ.getClass();
        IPoiMapService iPoiMapServiceLIZ = C1180740gpc.LIZ();
        C1179470gnZ c1179470gnZ = new C1179470gnZ();
        c1179470gnZ.LJFF = EnumC1203090hPf.MAP_TYPE_NORMAL;
        c1179470gnZ.LIZJ = false;
        c1179470gnZ.LJ = false;
        c1179470gnZ.LJII = false;
        c1179470gnZ.LJI = C1178280gle.LIZ(getContext());
        InterfaceC1176690gj5 iMapManager = iPoiMapServiceLIZ.getIMapManager(new C1203050hPb(c1179470gnZ));
        Fragment fragmentLIZIZ = iMapManager.LIZIZ();
        if (fragmentLIZIZ != null && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LIZIZ(R.id.r96, fragmentLIZIZ);
            c19ehLJIIJ.LJIIIZ();
        }
        iMapManager.X(new AwS597S0100000_18(this, 777));
        C1179570gnj c1179570gnj2 = this.LLJJJIL;
        AwS632S0100000_18 awS632S0100000_18 = new AwS632S0100000_18(this, 236);
        if (c1179570gnj2 == null) {
            awS632S0100000_18.invoke(0, 0);
        } else if (c1179570gnj2.getWidth() > 0) {
            awS632S0100000_18.invoke(Integer.valueOf(c1179570gnj2.getWidth()), Integer.valueOf(c1179570gnj2.getHeight()));
        } else {
            HandlerHook.viewPost(c1179570gnj2, new ARunnableS75S0200000_6(c1179570gnj2, awS632S0100000_18, 37));
        }
        InterfaceC665370Q7z interfaceC665370Q7z = No().LLIZ;
        if (interfaceC665370Q7z != null) {
            IPoiQuizMapAssemAbility iPoiQuizMapAssemAbility = new IPoiQuizMapAssemAbility(this) { // from class: com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHomePageMapAssem$loadAbility$1
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, IPoiQuizMapAssemAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7z, iPoiQuizMapAssemAbility, IPoiQuizMapAssemAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(iPoiQuizMapAssemAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(iPoiQuizMapAssemAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IPoiQuizMapAssemAbility.class.getClassLoader(), new Class[]{IPoiQuizMapAssemAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) objNewProxyInstance, IPoiQuizMapAssemAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.quiz.assem.IPoiQuizMapAssemAbility");
                    }
                }
            }
        }
        PoiQuizPageVM poiQuizPageVMNo = No();
        selectSubscribe(poiQuizPageVMNo, new C2217381BqS() { // from class: X.0gll
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0glm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0glj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1178340glk) obj).LLILLL);
            }
        }, new C2217381BqS() { // from class: X.0glr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0gli
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LLILZIL;
            }
        }, C736820SvI.LIZIZ(poiQuizPageVMNo.usedInReusedScene), null, new C1178290glf(this));
    }

    public final void So(String str, C1175020ggO c1175020ggO) {
        String str2;
        InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl;
        Iterable<C1178200glW> data;
        C1176580giu c1176580giu;
        C1165940gRk c1165940gRkLJJIJIIJIL;
        Iterable<C1178200glW> data2;
        C1178200glW c1178200glWLIZJ;
        InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl2;
        Iterable<C1178200glW> data3;
        InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl3;
        if (c1175020ggO != null && (str2 = c1175020ggO.LIZ) != null) {
            if (str2.length() == 0) {
                InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl4 = this.LLJILJILJ;
                if (interfaceC1177110gjl4 != null && (data3 = interfaceC1177110gjl4.getData()) != null) {
                    for (C1178200glW c1178200glW : data3) {
                        if (c1178200glW.LJFF && (interfaceC1177110gjl3 = this.LLJILJILJ) != null) {
                            interfaceC1177110gjl3.LJ(c1178200glW, C1178200glW.LIZJ(c1178200glW, null, false, false, false, 2015));
                        }
                    }
                }
                InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl5 = this.LLJILJILJ;
                if (interfaceC1177110gjl5 != null) {
                    interfaceC1177110gjl5.LJIIIIZZ();
                    return;
                }
                return;
            }
            InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl6 = this.LLJILJILJ;
            if (interfaceC1177110gjl6 != null && (data2 = interfaceC1177110gjl6.getData()) != null) {
                for (C1178200glW c1178200glW2 : data2) {
                    if (Intrinsics.LJFF(c1178200glW2.LIZ, str)) {
                        if (Intrinsics.LJFF(c1178200glW2.LIZ, str2)) {
                            c1178200glWLIZJ = C1178200glW.LIZJ(c1178200glW2, null, true, true, true, 2001);
                        } else if (c1178200glW2.LJFF) {
                            c1178200glWLIZJ = C1178200glW.LIZJ(c1178200glW2, null, true, true, false, 2001);
                        } else {
                            c1178200glWLIZJ = C1178200glW.LIZJ(c1178200glW2, null, true, true, false, 2033);
                        }
                        InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl7 = this.LLJILJILJ;
                        if (interfaceC1177110gjl7 != null) {
                            interfaceC1177110gjl7.LJ(c1178200glW2, c1178200glWLIZJ);
                        }
                        PoiQuizMapClusterPicLoader poiQuizMapClusterPicLoader = this.LLJJ;
                        if (poiQuizMapClusterPicLoader != null) {
                            AnonymousClass0956 anonymousClass0956 = poiQuizMapClusterPicLoader.LLILLL;
                            if (anonymousClass0956 != null) {
                                anonymousClass0956.LIZIZ(null);
                            }
                            poiQuizMapClusterPicLoader.LLILLL = C23250099c.LIZLLL(poiQuizMapClusterPicLoader, C0PEM.LIZJ, null, new C1178250glb(poiQuizMapClusterPicLoader, str, null), 2);
                        }
                    } else if (Intrinsics.LJFF(c1178200glW2.LIZ, str2)) {
                        InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl8 = this.LLJILJILJ;
                        if (interfaceC1177110gjl8 != null) {
                            interfaceC1177110gjl8.LJ(c1178200glW2, C1178200glW.LIZJ(c1178200glW2, null, false, false, true, 2015));
                        }
                    } else if (c1178200glW2.LJFF && (interfaceC1177110gjl2 = this.LLJILJILJ) != null) {
                        interfaceC1177110gjl2.LJ(c1178200glW2, C1178200glW.LIZJ(c1178200glW2, null, false, false, false, 2015));
                    }
                }
            }
            InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl9 = this.LLJILJILJ;
            if (interfaceC1177110gjl9 != null) {
                interfaceC1177110gjl9.LJIIIIZZ();
            }
            if (c1175020ggO.LIZIZ && (interfaceC1177110gjl = this.LLJILJILJ) != null && (data = interfaceC1177110gjl.getData()) != null) {
                for (C1178200glW c1178200glW3 : data) {
                    if (Intrinsics.LJFF(c1178200glW3.LIZ, str2)) {
                        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJIJIL;
                        if (interfaceC1177250gjz != null && (c1165940gRkLJJIJIIJIL = interfaceC1177250gjz.LJJIJIIJIL()) != null) {
                            c1176580giu = c1165940gRkLJJIJIIJIL.bounds;
                        } else {
                            c1176580giu = null;
                        }
                        Go(this, c1176580giu, c1178200glW3.LJIIIIZZ, true, 8);
                    }
                }
            }
        }
    }

    public final void bp(String str, boolean z, boolean z2) {
        Float f;
        List<PoiQuizItem> listVQ2 = No().vQ2();
        if (listVQ2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (PoiQuizItem poiQuizItem : listVQ2) {
            int i2 = i + 1;
            if (i >= 0) {
                PoiQuizItem poiQuizItem2 = poiQuizItem;
                Location location = poiQuizItem2.location;
                if (location != null && (f = location.lat) != null) {
                    float fFloatValue = f.floatValue();
                    Float f2 = poiQuizItem2.location.lng;
                    if (f2 != null) {
                        float fFloatValue2 = f2.floatValue();
                        boolean zLJFF = Intrinsics.LJFF(poiQuizItem2.poiId, str);
                        String str2 = poiQuizItem2.poiId;
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str4 = poiQuizItem2.poiName;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        arrayList.add(new C1178200glW(str2, Intrinsics.LJFF(poiQuizItem2.isFinishPoiQuiz(), Boolean.TRUE), z2, str3, zLJFF, z, listVQ2.size() - i, new C1178490glz(fFloatValue, fFloatValue2), poiQuizItem2.poiTitleImg, poiQuizItem2.poiTitleFinishImg, 2));
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl = this.LLJILJILJ;
        if (interfaceC1177110gjl != null) {
            interfaceC1177110gjl.clearData();
        }
        InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl2 = this.LLJILJILJ;
        if (interfaceC1177110gjl2 != null) {
            interfaceC1177110gjl2.LJII(arrayList);
        }
        InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl3 = this.LLJILJILJ;
        if (interfaceC1177110gjl3 != null) {
            interfaceC1177110gjl3.LJIIIIZZ();
        }
        PoiQuizMapClusterPicLoader poiQuizMapClusterPicLoader = this.LLJJ;
        if (poiQuizMapClusterPicLoader != null) {
            AnonymousClass0956 anonymousClass0956 = poiQuizMapClusterPicLoader.LLILLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            poiQuizMapClusterPicLoader.LLILLL = C23250099c.LIZLLL(poiQuizMapClusterPicLoader, C0PEM.LIZJ, null, new C1178260glc(arrayList, poiQuizMapClusterPicLoader, null), 2);
        }
    }

    public static void Go(PoiQuizHomePageMapAssem poiQuizHomePageMapAssem, C1176580giu c1176580giu, C1178490glz c1178490glz, boolean z, int i) {
        C1178490glz c1178490glzLIZ;
        if ((i & 4) != 0) {
            z = true;
        }
        poiQuizHomePageMapAssem.getClass();
        if (c1176580giu != null) {
            try {
                InterfaceC1177250gjz interfaceC1177250gjz = poiQuizHomePageMapAssem.LLJIJIL;
                if (interfaceC1177250gjz != null && (c1178490glzLIZ = C1178010glD.LIZ(c1176580giu, c1178490glz, (Pair) poiQuizHomePageMapAssem.LLJL.getValue(), ((Number) poiQuizHomePageMapAssem.LLJJLIIIJLLLLLLLZ.getValue()).intValue())) != null) {
                    C1179570gnj c1179570gnj = poiQuizHomePageMapAssem.LLJJJIL;
                    if (c1179570gnj != null) {
                        c1179570gnj.LLILZ = true;
                    }
                    C1177960gl8 c1177960gl8LIZJ = C1178010glD.LIZJ(c1178490glzLIZ);
                    Float fValueOf = Float.valueOf(interfaceC1177250gjz.LJIJJ());
                    C1178480gly c1178480gly = new C1178480gly();
                    c1178480gly.LIZ = z;
                    c1178480gly.LIZIZ = 300L;
                    c1178480gly.LIZJ = new AwS419S0200000_18(poiQuizHomePageMapAssem, (PoiQuizHomePageMapAssem) null, (Function0<Unit>) 121);
                    c1178480gly.LIZLLL = new AwS562S0100000_18((Function0) null, (Function0<Unit>) 2521);
                    interfaceC1177250gjz.LIZIZ(c1177960gl8LIZJ, fValueOf, c1178480gly);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                EnumC1205570hTf enumC1205570hTf = EnumC1205570hTf.POI_QUIZ_MAP_ERROR;
                c1205490hTX.getClass();
                C1205490hTX.LIZLLL(enumC1205570hTf, "center poi", null, e);
            }
        }
    }
}
