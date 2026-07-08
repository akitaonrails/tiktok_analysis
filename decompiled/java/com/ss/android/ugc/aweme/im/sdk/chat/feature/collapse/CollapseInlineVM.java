package com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse;

import X.C08CX;
import X.C0YUT;
import X.C0ZTJ;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C234400vO;
import X.C869590Y9l;
import X.C880080Yfm;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class CollapseInlineVM extends AssemViewModel<C234400vO> {
    public static final List<Integer> LLIZ = C1697810uHb.LJIIJJI(1, 1031, 4007, 4058, 4011, 4008, 4052, 4063);
    public Long LL;
    public final Set<String> LLILLJJLI = new LinkedHashSet();
    public final Map<Integer, Integer> LLILLL = new LinkedHashMap();
    public Set<Integer> LLILZ = C08CX.INSTANCE;
    public Map<Integer, ? extends Set<String>> LLILZIL = C2097608Jq.LJ();
    public Map<String, Integer> LLILZLL = C2097608Jq.LJ();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C234400vO(null);
    }

    public final boolean vQ2(C869590Y9l c869590Y9l) {
        if (this.LLILLJJLI.contains(c869590Y9l.getUuid()) || Intrinsics.LJFF(c869590Y9l.getExt().get("a:is_expand"), "1")) {
            return false;
        }
        if (!LLIZ.contains(Integer.valueOf(c869590Y9l.getMsgType())) && ((c869590Y9l.getMessageStatus() != C0YUT.RECALLED || !Intrinsics.LJFF(c869590Y9l.getLocalExt().get("is_recalled_msg_seen"), "1") || this.LLILLJJLI.contains(c869590Y9l.getUuid())) && ((!C0ZTJ.LIZJ(c869590Y9l) || C0ZTJ.LJ(c869590Y9l)) && !C880080Yfm.LIZ(c869590Y9l)))) {
            return false;
        }
        return true;
    }
}
