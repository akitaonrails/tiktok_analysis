package com.ss.android.ugc.aweme.services.storage;

import X.C09AY;
import X.C13VR;
import X.C580060Mp2;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes36.dex */
public final class AVStorageManagerImpl$allowListService$2 extends C09AY implements Function0<C580060Mp2> {
    public AVStorageManagerImpl$allowListService$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Mp2] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C580060Mp2 invoke() {
        return new C13VR() { // from class: X.0Mp2
            public final C01GW LIZ = C452501pT.LIZIZ(new C0CLY());
            public final C377010EqJ LIZIZ = new C377010EqJ(new C580070Mp3());
            public final C377010EqJ LIZJ = new C377010EqJ(new C580030Moz());
            public final C377010EqJ LIZLLL;
            public final Set<String> LJ;

            @Override // X.C13VR
            public final Set<String> LIZIZ() {
                return ((C580070Mp3) this.LIZIZ.getValue()).LIZIZ;
            }

            @Override // X.C13VR
            public final Set<String> getPrefixAllowList() {
                C1EPC c1epcLIZIZ;
                if (!((C580070Mp3) this.LIZIZ.getValue()).LIZ.get()) {
                    this.LIZJ.getValue().getClass();
                    if (!((InterfaceC580040Mp0) this.LIZLLL.getValue()).LIZJ()) {
                        return this.LJ;
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.addAll(((C580070Mp3) this.LIZIZ.getValue()).LIZIZ);
                linkedHashSet.addAll(((C580030Moz) this.LIZJ.getValue()).LIZ());
                linkedHashSet.addAll(((InterfaceC580050Mp1) this.LIZLLL.getValue()).LIZ());
                C19881812qe c19881812qe = new C19881812qe(linkedHashSet, new InterfaceC19882712qn() { // from class: X.13Vk
                    @Override // X.InterfaceC19882712qn
                    public final Object apply(Object obj) {
                        String str = (String) obj;
                        if (str != null) {
                            return new Regex("/data/data/").replaceFirst(str, "/data/user/0/");
                        }
                        return null;
                    }
                });
                C19881812qe c19881812qe2 = new C19881812qe(linkedHashSet, new InterfaceC19882712qn() { // from class: X.13Vj
                    @Override // X.InterfaceC19882712qn
                    public final Object apply(Object obj) {
                        String str = (String) obj;
                        if (str != null) {
                            return new Regex("/data/user/0/").replaceFirst(str, "/data/data/");
                        }
                        return null;
                    }
                });
                this.LJ.clear();
                this.LJ.addAll(linkedHashSet);
                this.LJ.addAll(c19881812qe);
                this.LJ.addAll(c19881812qe2);
                this.LJ.add(new C20022113Vr().LJIIJ(EnumC20227914Cv.LOCAL_EXTRACT_MUSIC, "", false).getAbsolutePath());
                this.LJ.add(new C20022113Vr().LJIIJ(EnumC20227914Cv.STYLE_EFFECT, "", false).getAbsolutePath());
                this.LJ.add(new C20022113Vr().LJIIJ(EnumC20227914Cv.ALBUM_AI, "", false).getAbsolutePath());
                this.LJ.add(C2298208zU.LJ(new C20022113Vr(), C1445850njD.LIZJ, C0MI0.STORY_THOUGHT_COVER, "", 8));
                IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
                if (iAiChatFeatureService != null && (c1epcLIZIZ = iAiChatFeatureService.LIZIZ()) != null && c1epcLIZIZ.isFeatureEnabled()) {
                    this.LJ.add(new C20022113Vr().LJIILIIL(EnumC20227914Cv.AI_CHAT, ""));
                }
                return this.LJ;
            }

            {
                this.LIZLLL = new C377010EqJ(((Boolean) C0AUL.LIZ.getValue()).booleanValue() ? new C2216061BoK() : new C571800Mbi());
                this.LJ = C1664790tQL.LIZJ();
            }

            @Override // X.C13VR
            public final boolean LIZLLL(String str) {
                if (str == null) {
                    return false;
                }
                C580070Mp3 c580070Mp3 = (C580070Mp3) this.LIZIZ.getValue();
                c580070Mp3.getClass();
                if (a0.LJJJIL(str)) {
                    return false;
                }
                boolean zAdd = c580070Mp3.LIZIZ.add(str);
                c580070Mp3.LIZ.set(zAdd);
                return zAdd;
            }

            @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
            public final void onDeleted(AwemeDraft awemeDraft) {
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_open_storage_opt", true) == 1 || C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_open_storage_opt", true) == 2) {
                    ((IDraftListener) this.LIZLLL.getValue()).onDeleted(awemeDraft);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
            public final void onUpdated(IDraftListener.UpdateParams updateParams) {
                ((IDraftListener) this.LIZLLL.getValue()).onUpdated(updateParams);
            }
        };
    }
}
