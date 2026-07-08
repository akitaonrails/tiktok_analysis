package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C01GW;
import X.C0P7S;
import X.C0PFM;
import X.C0PFU;
import X.C2097808Js;
import X.C452501pT;
import X.C661470Px3;
import X.C661490Px5;
import X.C661510Px7;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class InternalPlayerSyncAbilityImpl implements InternalPlayerSyncAbility, C0PFM {
    public final List<C0PFU> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(153));

    /* JADX WARN: Multi-variable type inference failed */
    public InternalPlayerSyncAbilityImpl(List<? extends C0PFU> list) {
        this.LL = list;
    }

    @Override // X.C0PFM
    public final void LIZ(Aweme aweme) {
        Object aid;
        C661470Px3 c661470Px3;
        C661490Px5 dataProvider;
        Aweme aweme2;
        Iterator<Object> it2 = C2097808Js.LJIJJLI((HashMap) this.LLILLJJLI.getValue()).iterator();
        while (true) {
            aid = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Map.Entry entry = (Map.Entry) next;
            if (((Boolean) ((Function1) entry.getValue()).invoke(aweme)).booleanValue()) {
                C661490Px5 dataProvider2 = ((C661470Px3) entry.getKey()).getDataProvider();
                if (dataProvider2 != null && (aweme2 = dataProvider2.LIZJ) != null) {
                    aid = aweme2.getAid();
                }
                if (Intrinsics.LJFF(aid, aweme.getAid())) {
                    aid = next;
                    break;
                }
            }
        }
        Map.Entry entry2 = (Map.Entry) aid;
        if (entry2 != null && (c661470Px3 = (C661470Px3) entry2.getKey()) != null && (dataProvider = c661470Px3.getDataProvider()) != null) {
            C661510Px7.LIZ.getClass();
            C661510Px7.LIZ(dataProvider, true, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.InternalPlayerSyncAbility
    public final void e70(C661470Px3 c661470Px3) {
        ((HashMap) this.LLILLJJLI.getValue()).remove(c661470Px3);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.InternalPlayerSyncAbility
    public final void pI1(C661470Px3 c661470Px3, Function1<? super Aweme, Boolean> function1) {
        ((HashMap) this.LLILLJJLI.getValue()).put(c661470Px3, function1);
    }

    @Override // X.C0PFM
    public final boolean LIZIZ(long j, long j2, Aweme aweme, boolean z) {
        C0PFU next;
        String identifier;
        List<C0PFU> list = this.LL;
        if (list != null) {
            Iterator<C0PFU> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZIZ().invoke(aweme).booleanValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0PFU c0pfu = next;
            if (c0pfu != null && (identifier = c0pfu.getIdentifier()) != null) {
                String strLIZ = C0P7S.LIZ(identifier, aweme.getAid());
                C661510Px7.LIZ.getClass();
                C661510Px7.LIZJ(j, j2, aweme, strLIZ, z);
                return true;
            }
            return false;
        }
        return false;
    }
}
