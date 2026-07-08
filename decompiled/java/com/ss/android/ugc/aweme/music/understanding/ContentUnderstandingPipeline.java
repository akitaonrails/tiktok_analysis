package com.ss.android.ugc.aweme.music.understanding;

import X.C09RB;
import X.C13BV;
import X.C13EL;
import X.C13EM;
import X.C13LP;
import X.C1440550naf;
import X.C15438062q;
import X.C1939607ik;
import X.C1D80;
import X.C1D82;
import X.C1D8B;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C556270Lrl;
import X.InterfaceC1840230xzJ;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingPipeline;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult;
import com.ss.android.ugc.aweme.music.understanding.IPipelineListener;
import com.ss.android.ugc.aweme.music.understanding.NodeTag;
import com.ss.android.ugc.aweme.music.understanding.PipelineTag;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ContentUnderstandingPipeline {
    public final ContentPipelineContext context;
    public final IPipelineListener externalListener;
    public ContentUnderstandingResult finalNodeResult;
    public final String finalNodeTag;

    /* JADX INFO: renamed from: net, reason: collision with root package name */
    public final C1D80 f388net;
    public final String netTag;
    public final List<PipelineNodeConfig> nodeConfigs;

    public final void start() {
        this.f388net.LJII();
    }

    private final void attachObserver(C1D80 c1d80) {
        final PipelineTag pipelineTag = this.context.pipelineTag;
        c1d80.LIZ(new InterfaceC1840230xzJ() { // from class: X.0o40
            @Override // X.InterfaceC1840230xzJ
            public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
                IPipelineListener iPipelineListener;
                ContentUnderstandingResult contentUnderstandingResult;
                IPipelineListener iPipelineListener2;
                if (abstractC556190Lrd instanceof C556240Lri) {
                    Object obj = abstractC556190Lrd.LIZ;
                    if (Intrinsics.LJFF(obj, this.LIZ.netTag)) {
                        ContentUnderstandingPipeline contentUnderstandingPipeline = this.LIZ;
                        IPipelineListener iPipelineListener3 = contentUnderstandingPipeline.externalListener;
                        if (iPipelineListener3 != null) {
                            iPipelineListener3.onStart(pipelineTag, contentUnderstandingPipeline.context.request);
                            return;
                        }
                        return;
                    }
                    if (!(obj instanceof NodeTag) || (iPipelineListener2 = this.LIZ.externalListener) == null) {
                        return;
                    }
                    iPipelineListener2.mo17onNodeStartR6Iu3AI(pipelineTag, ((NodeTag) abstractC556190Lrd.LIZ).m288unboximpl());
                    return;
                }
                if (abstractC556190Lrd instanceof C556250Lrj) {
                    Object obj2 = abstractC556190Lrd.LIZ;
                    if (Intrinsics.LJFF(obj2, this.LIZ.netTag)) {
                        ContentUnderstandingPipeline contentUnderstandingPipeline2 = this.LIZ;
                        IPipelineListener iPipelineListener4 = contentUnderstandingPipeline2.externalListener;
                        if (iPipelineListener4 == null) {
                            return;
                        }
                        iPipelineListener4.onFinishSuccess(pipelineTag, contentUnderstandingPipeline2.context.request, contentUnderstandingPipeline2.finalNodeResult);
                        return;
                    }
                    if (!(obj2 instanceof NodeTag)) {
                        return;
                    }
                    String strM288unboximpl = ((NodeTag) abstractC556190Lrd.LIZ).m288unboximpl();
                    C556250Lrj c556250Lrj = (C556250Lrj) abstractC556190Lrd;
                    Object obj3 = c556250Lrj.LIZLLL;
                    if (obj3 instanceof ContentUnderstandingResult) {
                        contentUnderstandingResult = (ContentUnderstandingResult) obj3;
                    } else {
                        contentUnderstandingResult = null;
                    }
                    if (Intrinsics.LJFF(strM288unboximpl, this.LIZ.finalNodeTag)) {
                        this.LIZ.finalNodeResult = contentUnderstandingResult;
                    }
                    IPipelineListener iPipelineListener5 = this.LIZ.externalListener;
                    if (iPipelineListener5 == null) {
                        return;
                    }
                    iPipelineListener5.mo18onNodeSuccessqawTgY(pipelineTag, strM288unboximpl, contentUnderstandingResult, c556250Lrj.LJ);
                    return;
                }
                if (!(abstractC556190Lrd instanceof C556230Lrh)) {
                    return;
                }
                Object obj4 = abstractC556190Lrd.LIZ;
                if (Intrinsics.LJFF(obj4, this.LIZ.netTag)) {
                    ContentUnderstandingPipeline contentUnderstandingPipeline3 = this.LIZ;
                    IPipelineListener iPipelineListener6 = contentUnderstandingPipeline3.externalListener;
                    if (iPipelineListener6 == null) {
                        return;
                    }
                    C556230Lrh c556230Lrh = (C556230Lrh) abstractC556190Lrd;
                    iPipelineListener6.onFinishFailed(pipelineTag, contentUnderstandingPipeline3.context.request, c556230Lrh.LIZLLL.getT(), c556230Lrh.LIZLLL.getCode());
                    return;
                }
                if (!(obj4 instanceof NodeTag) || (iPipelineListener = this.LIZ.externalListener) == null) {
                    return;
                }
                PipelineTag pipelineTag2 = pipelineTag;
                String strM288unboximpl2 = ((NodeTag) abstractC556190Lrd.LIZ).m288unboximpl();
                C556230Lrh c556230Lrh2 = (C556230Lrh) abstractC556190Lrd;
                iPipelineListener.mo16onNodeFailedqawTgY(pipelineTag2, strM288unboximpl2, c556230Lrh2.LIZLLL.getT(), c556230Lrh2.LIZLLL.getCode());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C1D80 buildNet(List<PipelineNodeConfig> list) {
        if (!list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PipelineNodeConfig pipelineNodeConfig : list) {
                NodeTag nodeTagM282boximpl = NodeTag.m282boximpl(pipelineNodeConfig.m290getNodeTagq0GeycQ());
                Object arrayList = linkedHashMap.get(nodeTagM282boximpl);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(nodeTagM282boximpl, arrayList);
                }
                ((List) arrayList).add(pipelineNodeConfig);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((List) entry.getValue()).size() > 1) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            Set setKeySet = linkedHashMap2.keySet();
            if (setKeySet.isEmpty()) {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                int i = 16;
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iLIZIZ);
                for (PipelineNodeConfig pipelineNodeConfig2 : list) {
                    linkedHashMap3.put(NodeTag.m282boximpl(pipelineNodeConfig2.m290getNodeTagq0GeycQ()), pipelineNodeConfig2);
                }
                for (PipelineNodeConfig pipelineNodeConfig3 : list) {
                    Iterator<NodeTag> it2 = pipelineNodeConfig3.getDependsOn().iterator();
                    while (it2.hasNext()) {
                        String strM288unboximpl = it2.next().m288unboximpl();
                        if (!linkedHashMap3.containsKey(NodeTag.m282boximpl(strM288unboximpl))) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("node ");
                            sbLIZ.append((Object) NodeTag.m287toStringimpl(pipelineNodeConfig3.m290getNodeTagq0GeycQ()));
                            sbLIZ.append(" depends on missing nodeTag: ");
                            sbLIZ.append((Object) NodeTag.m287toStringimpl(strM288unboximpl));
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            strLIZIZ.toString();
                            throw new IllegalArgumentException(strLIZIZ);
                        }
                    }
                }
                int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                if (iLIZIZ2 >= 16) {
                    i = iLIZIZ2;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i);
                for (PipelineNodeConfig pipelineNodeConfig4 : list) {
                    NodeTag nodeTagM282boximpl2 = NodeTag.m282boximpl(pipelineNodeConfig4.m290getNodeTagq0GeycQ());
                    Function0<C1D8B> taskFactory = pipelineNodeConfig4.getTaskFactory();
                    AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(pipelineNodeConfig4, 139);
                    C556270Lrl c556270Lrl = new C556270Lrl(taskFactory, nodeTagM282boximpl2);
                    awS601S0100000_22.invoke(c556270Lrl);
                    C1D82 c1d82 = new C1D82(taskFactory, nodeTagM282boximpl2);
                    c1d82.LIZLLL = c556270Lrl.LIZ;
                    c1d82.LIZIZ = c556270Lrl.LIZIZ;
                    c1d82.LJIIJ = c556270Lrl.LIZJ;
                    Function1<C1D82, Unit> nodeBlock = pipelineNodeConfig4.getNodeBlock();
                    if (nodeBlock != null) {
                        nodeBlock.invoke(c1d82);
                    }
                    Pair pair = new Pair(NodeTag.m282boximpl(pipelineNodeConfig4.m290getNodeTagq0GeycQ()), c1d82);
                    linkedHashMap4.put(pair.getFirst(), pair.getSecond());
                }
                for (PipelineNodeConfig pipelineNodeConfig5 : list) {
                    C1D82 c1d822 = (C1D82) C2097608Jq.LJFF(NodeTag.m282boximpl(pipelineNodeConfig5.m290getNodeTagq0GeycQ()), linkedHashMap4);
                    Iterator<NodeTag> it3 = pipelineNodeConfig5.getDependsOn().iterator();
                    while (it3.hasNext()) {
                        c1d822.LIZ(C2097608Jq.LJFF(NodeTag.m282boximpl(it3.next().m288unboximpl()), linkedHashMap4));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (PipelineNodeConfig pipelineNodeConfig6 : list) {
                    if (pipelineNodeConfig6.getDependsOn().isEmpty()) {
                        arrayList2.add(pipelineNodeConfig6);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(C2097608Jq.LJFF(NodeTag.m282boximpl(((PipelineNodeConfig) it4.next()).m290getNodeTagq0GeycQ()), linkedHashMap4));
                }
                C1D82[] c1d82Arr = (C1D82[]) arrayList3.toArray(new C1D82[0]);
                if (c1d82Arr.length == 0) {
                    "no start nodes (nodes without dependsOn)".toString();
                    throw new IllegalArgumentException("no start nodes (nodes without dependsOn)");
                }
                C1440550naf c1440550naf = new C1440550naf(this.netTag, (C1D82[]) Arrays.copyOf(c1d82Arr, c1d82Arr.length));
                ((ArrayList) c1440550naf.LIZLLL).add(this.context);
                C1D80 c1d80LIZ = c1440550naf.LIZ();
                attachObserver(c1d80LIZ);
                return c1d80LIZ;
            }
            String str = "duplicated nodeTag: " + setKeySet;
            str.toString();
            throw new IllegalArgumentException(str);
        }
        "nodeConfigs is empty".toString();
        throw new IllegalArgumentException("nodeConfigs is empty");
    }

    /* JADX INFO: renamed from: resolveFinalNodeTag-o_eKHks, reason: not valid java name */
    private final String m279resolveFinalNodeTago_eKHks(List<PipelineNodeConfig> list) {
        Object next;
        Set setLJJIIJ = C09RB.LJJIIJ(C09RB.LJIILIIL(new C1939607ik(list), AFwS261S0000000_22.get$arr$(81)));
        Object it2 = new C13EL(list).iterator();
        while (true) {
            C13EM c13em = (C13EM) it2;
            if (c13em.hasNext()) {
                next = c13em.next();
                if (!setLJJIIJ.contains(NodeTag.m282boximpl(((PipelineNodeConfig) next).m290getNodeTagq0GeycQ()))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PipelineNodeConfig pipelineNodeConfig = (PipelineNodeConfig) next;
        if (pipelineNodeConfig != null) {
            return pipelineNodeConfig.m290getNodeTagq0GeycQ();
        }
        return ((PipelineNodeConfig) C13LP.LJJLIIIJJI(list)).m290getNodeTagq0GeycQ();
    }

    public final void cancel(Object obj) {
        this.f388net.LIZIZ(obj);
    }

    public ContentUnderstandingPipeline(ContentPipelineContext contentPipelineContext, IPipelineListener iPipelineListener, List<PipelineNodeConfig> list) {
        this.context = contentPipelineContext;
        this.externalListener = iPipelineListener;
        this.nodeConfigs = list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content_understanding_");
        sbLIZ.append(contentPipelineContext.pipelineTag.getValue());
        this.netTag = C2188811AlT.LIZIZ(sbLIZ);
        this.finalNodeTag = m279resolveFinalNodeTago_eKHks(list);
        this.f388net = buildNet(list);
    }

    public ContentUnderstandingPipeline(ContentPipelineContext contentPipelineContext, IPipelineListener iPipelineListener, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentPipelineContext, iPipelineListener, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
