package ttpobfuscated;

import X.AbstractC23140094w;
import X.C095D;
import X.C09AX;
import X.C09DV;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import X.InterfaceC346701Wf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ttp.orbu.sdk.app.domain.usecase.UseCaseResult;
import ttp.orbu.sdk.constants.TTPErrorCode;
import ttpobfuscated.i2;

/* JADX INFO: loaded from: classes24.dex */
public final class g2 implements i5<e2, j2, f2> {
    public final h5 a;
    public final s4 b;
    public final u1 c;
    public final b6 d;
    public final j0 e;
    public final i2 f;
    public final e5 g;
    public final List<String> h;

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.crashlog.CrashLogProcessUseCase$invoke$2", f = "CrashLogProcessUseCase.kt", l = {60, 63, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 77, 85, 90, 93, 99, 101, 106, 117, 120, 125, 130, 137, 142, 149, 151, 156, 168, 177, 181, 186, 191, 194, 200, 246, 255}, m = "invokeSuspend")
    public final class b extends C09AX implements Function2<InterfaceC346701Wf<? super UseCaseResult<j2, f2>>, InterfaceC1364105Vn<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ e2 k;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[d5.values().length];
                try {
                    iArr[d5.NOT_CREATED.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    iArr[d5.UNCHANGED.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                try {
                    iArr[d5.MODIFIED.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                try {
                    iArr[d5.CREATED.ordinal()] = 4;
                } catch (NoSuchFieldError e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                try {
                    iArr[d5.DELETED.ordinal()] = 5;
                } catch (NoSuchFieldError e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
                a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0415  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0435  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0476  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0477 A[Catch: all -> 0x04e1, TRY_ENTER, TryCatch #0 {all -> 0x04e1, blocks: (B:90:0x03ab, B:99:0x03c7, B:100:0x03cc, B:110:0x0437, B:116:0x0477), top: B:331:0x03ab }] */
        /* JADX WARN: Removed duplicated region for block: B:121:0x04bb  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x04e4 A[Catch: all -> 0x0792, TRY_ENTER, TryCatch #19 {all -> 0x0792, blocks: (B:85:0x0382, B:87:0x0388, B:141:0x04e4), top: B:364:0x0382 }] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0526  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x053d A[Catch: all -> 0x078c, TryCatch #16 {all -> 0x078c, blocks: (B:150:0x0537, B:152:0x053d, B:204:0x067e, B:206:0x0684, B:208:0x068a, B:212:0x06b0, B:214:0x06b8), top: B:359:0x0537 }] */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0574  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x05ce  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x05ee  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x0612 A[Catch: all -> 0x0678, TryCatch #6 {all -> 0x0678, blocks: (B:155:0x0563, B:166:0x0581, B:167:0x0585, B:174:0x05d0, B:177:0x05ef, B:180:0x0612, B:183:0x063a, B:107:0x0417, B:113:0x0459, B:119:0x049e), top: B:340:0x0417 }] */
        /* JADX WARN: Removed duplicated region for block: B:185:0x0658  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x067e A[Catch: all -> 0x078c, TRY_ENTER, TryCatch #16 {all -> 0x078c, blocks: (B:150:0x0537, B:152:0x053d, B:204:0x067e, B:206:0x0684, B:208:0x068a, B:212:0x06b0, B:214:0x06b8), top: B:359:0x0537 }] */
        /* JADX WARN: Removed duplicated region for block: B:220:0x0702  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x0710 A[Catch: all -> 0x0783, TryCatch #13 {all -> 0x0783, blocks: (B:223:0x070a, B:225:0x0710), top: B:353:0x070a }] */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0754  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x076d  */
        /* JADX WARN: Removed duplicated region for block: B:280:0x07d2  */
        /* JADX WARN: Removed duplicated region for block: B:326:0x08c5  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0361  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0388 A[Catch: all -> 0x0792, TryCatch #19 {all -> 0x0792, blocks: (B:85:0x0382, B:87:0x0388, B:141:0x04e4), top: B:364:0x0382 }] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x03bc  */
        /* JADX WARN: Type inference failed for: r3v10, types: [X.01Wf, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v100 */
        /* JADX WARN: Type inference failed for: r3v101 */
        /* JADX WARN: Type inference failed for: r3v102 */
        /* JADX WARN: Type inference failed for: r3v103 */
        /* JADX WARN: Type inference failed for: r3v104 */
        /* JADX WARN: Type inference failed for: r3v105 */
        /* JADX WARN: Type inference failed for: r3v106 */
        /* JADX WARN: Type inference failed for: r3v107 */
        /* JADX WARN: Type inference failed for: r3v108 */
        /* JADX WARN: Type inference failed for: r3v109 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v110 */
        /* JADX WARN: Type inference failed for: r3v111 */
        /* JADX WARN: Type inference failed for: r3v112 */
        /* JADX WARN: Type inference failed for: r3v113 */
        /* JADX WARN: Type inference failed for: r3v114 */
        /* JADX WARN: Type inference failed for: r3v115 */
        /* JADX WARN: Type inference failed for: r3v116 */
        /* JADX WARN: Type inference failed for: r3v117 */
        /* JADX WARN: Type inference failed for: r3v118 */
        /* JADX WARN: Type inference failed for: r3v119 */
        /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v120 */
        /* JADX WARN: Type inference failed for: r3v121 */
        /* JADX WARN: Type inference failed for: r3v122 */
        /* JADX WARN: Type inference failed for: r3v123 */
        /* JADX WARN: Type inference failed for: r3v124 */
        /* JADX WARN: Type inference failed for: r3v125 */
        /* JADX WARN: Type inference failed for: r3v126 */
        /* JADX WARN: Type inference failed for: r3v127 */
        /* JADX WARN: Type inference failed for: r3v128 */
        /* JADX WARN: Type inference failed for: r3v129 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v130 */
        /* JADX WARN: Type inference failed for: r3v131 */
        /* JADX WARN: Type inference failed for: r3v132 */
        /* JADX WARN: Type inference failed for: r3v133 */
        /* JADX WARN: Type inference failed for: r3v134 */
        /* JADX WARN: Type inference failed for: r3v135 */
        /* JADX WARN: Type inference failed for: r3v136 */
        /* JADX WARN: Type inference failed for: r3v137 */
        /* JADX WARN: Type inference failed for: r3v138 */
        /* JADX WARN: Type inference failed for: r3v139 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v36, types: [X.01Wf, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v37, types: [X.01Wf, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v39 */
        /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v45 */
        /* JADX WARN: Type inference failed for: r3v60, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v61, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v62, types: [X.01Wf, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v63, types: [X.01Wf, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v64, types: [X.01Wf, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v68, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v71 */
        /* JADX WARN: Type inference failed for: r3v78, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v79, types: [X.01Wf, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v80, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v83 */
        /* JADX WARN: Type inference failed for: r3v84 */
        /* JADX WARN: Type inference failed for: r3v85 */
        /* JADX WARN: Type inference failed for: r3v86 */
        /* JADX WARN: Type inference failed for: r3v87 */
        /* JADX WARN: Type inference failed for: r3v88 */
        /* JADX WARN: Type inference failed for: r3v89 */
        /* JADX WARN: Type inference failed for: r3v90 */
        /* JADX WARN: Type inference failed for: r3v91 */
        /* JADX WARN: Type inference failed for: r3v92 */
        /* JADX WARN: Type inference failed for: r3v93 */
        /* JADX WARN: Type inference failed for: r3v97 */
        /* JADX WARN: Type inference failed for: r3v98 */
        /* JADX WARN: Type inference failed for: r3v99 */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v100 */
        /* JADX WARN: Type inference failed for: r6v101 */
        /* JADX WARN: Type inference failed for: r6v102 */
        /* JADX WARN: Type inference failed for: r6v103 */
        /* JADX WARN: Type inference failed for: r6v104 */
        /* JADX WARN: Type inference failed for: r6v105 */
        /* JADX WARN: Type inference failed for: r6v106 */
        /* JADX WARN: Type inference failed for: r6v107 */
        /* JADX WARN: Type inference failed for: r6v108 */
        /* JADX WARN: Type inference failed for: r6v109 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v110 */
        /* JADX WARN: Type inference failed for: r6v111 */
        /* JADX WARN: Type inference failed for: r6v112 */
        /* JADX WARN: Type inference failed for: r6v113 */
        /* JADX WARN: Type inference failed for: r6v114 */
        /* JADX WARN: Type inference failed for: r6v115 */
        /* JADX WARN: Type inference failed for: r6v116 */
        /* JADX WARN: Type inference failed for: r6v117 */
        /* JADX WARN: Type inference failed for: r6v118 */
        /* JADX WARN: Type inference failed for: r6v119 */
        /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v120 */
        /* JADX WARN: Type inference failed for: r6v121 */
        /* JADX WARN: Type inference failed for: r6v122 */
        /* JADX WARN: Type inference failed for: r6v123 */
        /* JADX WARN: Type inference failed for: r6v124 */
        /* JADX WARN: Type inference failed for: r6v125 */
        /* JADX WARN: Type inference failed for: r6v126 */
        /* JADX WARN: Type inference failed for: r6v127 */
        /* JADX WARN: Type inference failed for: r6v128 */
        /* JADX WARN: Type inference failed for: r6v129 */
        /* JADX WARN: Type inference failed for: r6v130 */
        /* JADX WARN: Type inference failed for: r6v131 */
        /* JADX WARN: Type inference failed for: r6v132 */
        /* JADX WARN: Type inference failed for: r6v133 */
        /* JADX WARN: Type inference failed for: r6v134 */
        /* JADX WARN: Type inference failed for: r6v135 */
        /* JADX WARN: Type inference failed for: r6v136 */
        /* JADX WARN: Type inference failed for: r6v14, types: [X.01Wf] */
        /* JADX WARN: Type inference failed for: r6v140 */
        /* JADX WARN: Type inference failed for: r6v141 */
        /* JADX WARN: Type inference failed for: r6v142 */
        /* JADX WARN: Type inference failed for: r6v143 */
        /* JADX WARN: Type inference failed for: r6v144 */
        /* JADX WARN: Type inference failed for: r6v145 */
        /* JADX WARN: Type inference failed for: r6v146 */
        /* JADX WARN: Type inference failed for: r6v147 */
        /* JADX WARN: Type inference failed for: r6v148 */
        /* JADX WARN: Type inference failed for: r6v149 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v150 */
        /* JADX WARN: Type inference failed for: r6v151 */
        /* JADX WARN: Type inference failed for: r6v152 */
        /* JADX WARN: Type inference failed for: r6v153 */
        /* JADX WARN: Type inference failed for: r6v154 */
        /* JADX WARN: Type inference failed for: r6v155 */
        /* JADX WARN: Type inference failed for: r6v156 */
        /* JADX WARN: Type inference failed for: r6v157 */
        /* JADX WARN: Type inference failed for: r6v158 */
        /* JADX WARN: Type inference failed for: r6v159 */
        /* JADX WARN: Type inference failed for: r6v160 */
        /* JADX WARN: Type inference failed for: r6v161 */
        /* JADX WARN: Type inference failed for: r6v162 */
        /* JADX WARN: Type inference failed for: r6v163 */
        /* JADX WARN: Type inference failed for: r6v164 */
        /* JADX WARN: Type inference failed for: r6v165 */
        /* JADX WARN: Type inference failed for: r6v166 */
        /* JADX WARN: Type inference failed for: r6v167 */
        /* JADX WARN: Type inference failed for: r6v168 */
        /* JADX WARN: Type inference failed for: r6v169 */
        /* JADX WARN: Type inference failed for: r6v170 */
        /* JADX WARN: Type inference failed for: r6v171 */
        /* JADX WARN: Type inference failed for: r6v172 */
        /* JADX WARN: Type inference failed for: r6v173 */
        /* JADX WARN: Type inference failed for: r6v174 */
        /* JADX WARN: Type inference failed for: r6v175 */
        /* JADX WARN: Type inference failed for: r6v176 */
        /* JADX WARN: Type inference failed for: r6v177 */
        /* JADX WARN: Type inference failed for: r6v178 */
        /* JADX WARN: Type inference failed for: r6v179 */
        /* JADX WARN: Type inference failed for: r6v180 */
        /* JADX WARN: Type inference failed for: r6v181 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v38 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v44 */
        /* JADX WARN: Type inference failed for: r6v5, types: [X.01Wf] */
        /* JADX WARN: Type inference failed for: r6v59 */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v60, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v61 */
        /* JADX WARN: Type inference failed for: r6v62, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v63, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v64, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v65, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v71 */
        /* JADX WARN: Type inference failed for: r6v72, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v75 */
        /* JADX WARN: Type inference failed for: r6v79, types: [X.01Wf] */
        /* JADX WARN: Type inference failed for: r6v82 */
        /* JADX WARN: Type inference failed for: r6v83, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v84, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v85, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v88 */
        /* JADX WARN: Type inference failed for: r6v89 */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Type inference failed for: r6v90 */
        /* JADX WARN: Type inference failed for: r6v93 */
        /* JADX WARN: Type inference failed for: r6v94 */
        /* JADX WARN: Type inference failed for: r6v95 */
        /* JADX WARN: Type inference failed for: r6v96 */
        /* JADX WARN: Type inference failed for: r6v97 */
        /* JADX WARN: Type inference failed for: r6v98 */
        /* JADX WARN: Type inference failed for: r6v99 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0433 -> B:122:0x04bc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0474 -> B:122:0x04bc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x04b9 -> B:122:0x04bc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x0580 -> B:359:0x0537). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0581 -> B:359:0x0537). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x05ec -> B:359:0x0537). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x060f -> B:359:0x0537). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x0656 -> B:359:0x0537). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:232:0x076b -> B:353:0x070a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x03c5 -> B:122:0x04bc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x03c7 -> B:122:0x04bc). Please report as a decompilation issue!!! */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 2320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.g2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object a(InterfaceC346701Wf<? super UseCaseResult<j2, f2>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            b bVar = g2.this.new b(this.k, interfaceC1364105Vn);
            bVar.i = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC346701Wf<? super UseCaseResult<j2, f2>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e2 e2Var, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.k = e2Var;
        }
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TTPErrorCode.values().length];
            try {
                iArr[TTPErrorCode.NotModified.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[TTPErrorCode.Forbidden.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[TTPErrorCode.NotFound.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[TTPErrorCode.InterceptorException.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                iArr[TTPErrorCode.Unknown.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                iArr[TTPErrorCode.IOException.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                iArr[TTPErrorCode.Exception.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                iArr[TTPErrorCode.RequestSizeLargerThanAllowed.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                iArr[TTPErrorCode.UnknownHostException.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                iArr[TTPErrorCode.BadRequest.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                iArr[TTPErrorCode.Unauthorized.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                iArr[TTPErrorCode.RequestThrottledInternally.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                iArr[TTPErrorCode.InternalServer.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                iArr[TTPErrorCode.RateLimitExceeded.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                iArr[TTPErrorCode.Unavailable.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            a = iArr;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.crashlog.CrashLogProcessUseCase", f = "CrashLogProcessUseCase.kt", l = {316}, m = "processSendCrashLogError")
    public final class c extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("g2@124e.a$2");
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objA = g2.this.a((i2.a.C0056a) null, (InterfaceC1364105Vn<? super f2>) this);
            C1C7U.LIZIZ("g2@124e.a$2");
            return objA;
        }

        public c(InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.crashlog.CrashLogProcessUseCase", f = "CrashLogProcessUseCase.kt", l = {265, 282}, m = "resolveChallenge")
    public final class d extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws n7 {
            C1C7U.LIZ("g2@124e.a$3");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = g2.this.a((k0) null, (InterfaceC1364105Vn<? super Map<String, String>>) this);
            C1C7U.LIZIZ("g2@124e.a$3");
            return objA;
        }

        public d(InterfaceC1364105Vn<? super d> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttpobfuscated.i2.a.C0056a r9, X.InterfaceC1364105Vn<? super ttpobfuscated.f2> r10) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.g2.a(ttpobfuscated.i2$a$a, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttpobfuscated.k0 r9, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, java.lang.String>> r10) throws ttpobfuscated.n7 {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ttpobfuscated.g2.d
            if (r0 == 0) goto L97
            r6 = r10
            ttpobfuscated.g2$d r6 = (ttpobfuscated.g2.d) r6
            int r2 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r6.d = r2
        L12:
            java.lang.Object r7 = r6.b
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.d
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L57
            if (r0 == r3) goto L6f
            if (r0 != r4) goto L9e
            java.lang.Object r2 = r6.a
            ttpobfuscated.h0 r2 = (ttpobfuscated.h0) r2
            X.C155000ia.LIZIZ(r7)
        L29:
            ttpobfuscated.k0 r0 = r2.a
            java.lang.String r1 = r0.b
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r0 = "challenge_id"
            r6.<init>(r0, r1)
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r0 = "challenge_result"
            r5.<init>(r0, r7)
            java.lang.Integer r0 = r2.b
            java.lang.String r1 = r0.toString()
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "challenge_seed_id"
            r2.<init>(r0, r1)
            r0 = 3
            kotlin.Pair[] r1 = new kotlin.Pair[r0]
            r0 = 0
            r1[r0] = r6
            r1[r3] = r5
            r1[r4] = r2
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r1)
            return r0
        L57:
            X.C155000ia.LIZIZ(r7)
            ttpobfuscated.k0 r0 = ttpobfuscated.k0.HashCash
            if (r9 != r0) goto Lb0
            ttpobfuscated.b6 r1 = r8.d
            ttpobfuscated.uf r0 = ttpobfuscated.uf.Sample
            r6.a = r8
            r6.d = r3
            java.lang.Object r7 = r1.a(r0, r6)
            if (r7 != r5) goto L6d
            return r5
        L6d:
            r2 = r8
            goto L76
        L6f:
            java.lang.Object r2 = r6.a
            ttpobfuscated.g2 r2 = (ttpobfuscated.g2) r2
            X.C155000ia.LIZIZ(r7)
        L76:
            ttpobfuscated.h0 r7 = (ttpobfuscated.h0) r7
            ttpobfuscated.k0 r1 = r7.a
            ttpobfuscated.k0 r0 = ttpobfuscated.k0.None
            if (r1 != r0) goto L83
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        L83:
            java.lang.Integer r0 = r7.b
            if (r0 == 0) goto La6
            ttpobfuscated.j0 r0 = r2.e
            r6.a = r7
            r6.d = r4
            java.lang.Object r0 = r0.a(r7, r6)
            if (r0 != r5) goto L94
            return r5
        L94:
            r2 = r7
            r7 = r0
            goto L29
        L97:
            ttpobfuscated.g2$d r6 = new ttpobfuscated.g2$d
            r6.<init>(r10)
            goto L12
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La6:
            ttpobfuscated.n7 r2 = new ttpobfuscated.n7
            java.lang.String r1 = "seedId"
            java.lang.String r0 = "Seed Id cannot be null"
            r2.<init>(r1, r0)
            throw r2
        Lb0:
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.g2.a(ttpobfuscated.k0, X.05Vn):java.lang.Object");
    }

    @Override // ttpobfuscated.i5
    public Object a(e2 e2Var, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends UseCaseResult<j2, f2>>> interfaceC1364105Vn) {
        return new C095D(new b(e2Var, null));
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    public Object a2(e2 e2Var, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends UseCaseResult<j2, f2>>> interfaceC1364105Vn) {
        return new C095D(new b(e2Var, null));
    }

    public g2(h5 h5Var, s4 s4Var, u1 u1Var, b6 b6Var, j0 j0Var, i2 i2Var, e5 e5Var, List<String> list) {
        this.a = h5Var;
        this.b = s4Var;
        this.c = u1Var;
        this.d = b6Var;
        this.e = j0Var;
        this.f = i2Var;
        this.g = e5Var;
        this.h = list;
    }
}
