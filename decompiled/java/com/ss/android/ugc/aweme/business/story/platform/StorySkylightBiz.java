package com.ss.android.ugc.aweme.business.story.platform;

import X.C1596950rev;
import X.EnumC1597060rf6;
import X.InterfaceC1596570reJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC714040Rze;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.platform.SkylightBiz;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class StorySkylightBiz implements SkylightBiz<InterfaceC1891350zJl> {
    public final EnumC1597060rf6 LIZ = EnumC1597060rf6.STORY;

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final InterfaceC1596570reJ<InterfaceC1891350zJl> LIZIZ() {
        return new InterfaceC1596570reJ<InterfaceC1891350zJl>() { // from class: X.0rfR
            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597700rg8<InterfaceC1891350zJl> LIZ(int i) {
                this.LIZ.getClass();
                if (C1569180qw8.LIZ(i)) {
                    return C1596960rew.LIZ;
                }
                return C1596710reX.LIZ;
            }

            @Override // X.InterfaceC1596570reJ
            public final List<C1597160rfG<?>> LIZIZ(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return C13BV.INSTANCE;
                            }
                            return Collections.singletonList(new C1597160rfG(C13LE.LIZ(C1597390rfd.class), new C1597260rfQ()));
                        }
                        return C1697810uHb.LJIIJJI(new C1597160rfG(C13LE.LIZ(C1597390rfd.class), new C1597260rfQ()), new C1597160rfG(C13LE.LIZ(C1597400rfe.class), new C1597230rfN()));
                    }
                    return C1697810uHb.LJIIJJI(new C1597160rfG(C13LE.LIZ(C1597410rff.class), new C1597250rfP()), new C1597160rfG(C13LE.LIZ(C1597390rfd.class), new C1597260rfQ()));
                }
                return Collections.singletonList(new C1597160rfG(C13LE.LIZ(C1597380rfc.class), new C1597220rfM()));
            }

            @Override // X.InterfaceC1596570reJ
            public final InterfaceC1597360rfa<InterfaceC1891350zJl> LIZJ(int i) {
                return new InterfaceC1597360rfa<InterfaceC1891350zJl>(i) { // from class: X.0rfO
                    public final int LIZ;
                    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(20));

                    @Override // X.InterfaceC1597360rfa
                    public final List<EnumC1597060rf6> LIZ() {
                        return C1697810uHb.LJIIJJI(EnumC1597060rf6.LIVE, EnumC1597060rf6.LIVE_EVENT);
                    }

                    {
                        this.LIZ = i;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:46:0x008b A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x0032 A[SYNTHETIC] */
                    @Override // X.InterfaceC1597360rfa
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.util.List<X.InterfaceC1160280gIc<X.InterfaceC1891350zJl>> LIZIZ(java.util.List<? extends X.InterfaceC1891350zJl> r7) {
                        /*
                            r6 = this;
                            int r1 = r6.LIZ
                            r0 = 3
                            r5 = 1
                            if (r1 != r0) goto L2c
                            boolean r0 = X.C295190Bhd.LIZJ()
                            if (r0 == 0) goto L2c
                        Lc:
                            java.util.ArrayList r2 = new java.util.ArrayList
                            r2.<init>()
                            java.util.ArrayList r4 = new java.util.ArrayList
                            r4.<init>()
                            java.util.Iterator r3 = r7.iterator()
                        L1a:
                            boolean r0 = r3.hasNext()
                            if (r0 == 0) goto L2e
                            java.lang.Object r1 = r3.next()
                            boolean r0 = r1 instanceof X.InterfaceC714040Rze
                            if (r0 == 0) goto L1a
                            r4.add(r1)
                            goto L1a
                        L2c:
                            r5 = 0
                            goto Lc
                        L2e:
                            java.util.Iterator r4 = r4.iterator()
                        L32:
                            boolean r0 = r4.hasNext()
                            if (r0 == 0) goto L94
                            java.lang.Object r3 = r4.next()
                            X.0Rze r3 = (X.InterfaceC714040Rze) r3
                            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.getStoryCollection()
                            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
                            if (r0 == 0) goto L4e
                            java.lang.String r1 = r0.getUid()
                            if (r1 != 0) goto L50
                        L4e:
                            java.lang.String r1 = ""
                        L50:
                            X.0rf6 r0 = X.EnumC1597060rf6.STORY
                            java.lang.String r1 = X.C1596950rev.LIZJ(r0, r1)
                            if (r5 == 0) goto L61
                            X.0gId r0 = new X.0gId
                            r0.<init>(r1)
                            r2.add(r0)
                            goto L32
                        L61:
                            boolean r0 = r3 instanceof X.C1596360rdy
                            if (r0 == 0) goto L75
                            r0 = r3
                            X.0rdy r0 = (X.C1596360rdy) r0
                            boolean r0 = r0.LL
                        L6a:
                            if (r0 == 0) goto L81
                            X.0gId r0 = new X.0gId
                            r0.<init>(r1)
                            r2.add(r0)
                            goto L32
                        L75:
                            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.story.inbox.StoryInboxItem
                            if (r0 == 0) goto L81
                            r0 = r3
                            com.ss.android.ugc.aweme.story.inbox.StoryInboxItem r0 = (com.ss.android.ugc.aweme.story.inbox.StoryInboxItem) r0
                            boolean r0 = r0.isMe()
                            goto L6a
                        L81:
                            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.getStoryCollection()
                            boolean r0 = X.C729510SjV.LJJII(r0)
                            if (r0 == 0) goto L32
                            X.0gId r0 = new X.0gId
                            r0.<init>(r1)
                            r2.add(r0)
                            goto L32
                        L94:
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1597240rfO.LIZIZ(java.util.List):java.util.List");
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:107:0x0216, code lost:
                    
                        if (com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityOptConfig.LIZ() != false) goto L108;
                     */
                    @Override // X.InterfaceC1597360rfa
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.util.List LIZJ(X.C1597310rfV r23, java.util.List r24) {
                        /*
                            Method dump skipped, instruction units count: 590
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1597240rfO.LIZJ(X.0rfV, java.util.List):java.util.List");
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final EnumC1597060rf6 getBizType() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.platform.SkylightBiz
    public final String LIZ(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC714040Rze interfaceC714040Rze;
        Aweme storyCollection;
        if ((interfaceC1891350zJl instanceof InterfaceC714040Rze) && (interfaceC714040Rze = (InterfaceC714040Rze) interfaceC1891350zJl) != null && (storyCollection = interfaceC714040Rze.getStoryCollection()) != null) {
            return C1596950rev.LIZIZ(storyCollection);
        }
        return C1596950rev.LIZJ(this.LIZ, "");
    }
}
