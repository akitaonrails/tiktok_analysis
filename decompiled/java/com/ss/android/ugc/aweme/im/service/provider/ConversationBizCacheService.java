package com.ss.android.ugc.aweme.im.service.provider;

import X.C01GW;
import X.C08I7;
import X.C0XQ7;
import X.C0YSQ;
import X.C452501pT;
import X.InterfaceC586170Myt;
import X.InterfaceC866830XzV;
import X.InterfaceC876950Yaj;
import com.ss.android.ugc.aweme.im.service.IConversationBizCacheService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ConversationBizCacheService implements IConversationBizCacheService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(520));
    public boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.service.IConversationBizCacheService
    public final void initService() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.061k
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (i == 2 || i == 3) {
                        this.LL.LIZ("");
                    }
                }
            }
        });
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJI(new InterfaceC866830XzV() { // from class: X.061j
            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJJJJL(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJLJLI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJLL(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJZZI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLI(String str, List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLILLLLZI(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLL(C1711306n1 c1711306n1) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJZI(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LLIIII(int i, String str) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LLIILZL(int i, String str, List list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final int LLLIIII() {
                return 0;
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC867280Y0o
            public final void LLLIZZ(Map<String, C0Y8T> map) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJLIIIJ(C0Y8T c0y8t) {
                String conversationId;
                if (c0y8t != null && (conversationId = c0y8t.getConversationId()) != null) {
                    Iterator it2 = ((ConcurrentHashMap) this.LL.LIZ.getValue()).entrySet().iterator();
                    while (it2.hasNext()) {
                        ((C08I7) ((Map.Entry) it2.next()).getValue()).LJ(conversationId);
                    }
                }
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLJI(int i, C0Y8T c0y8t) {
                String str;
                C08I7 c08i7;
                if (c0y8t == null) {
                    return;
                }
                Iterator it2 = ((ConcurrentHashMap) this.LL.LIZ.getValue()).entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        if (((C08I7) entry.getValue()).LIZIZ(c0y8t.getConversationId()) != null) {
                            str = (String) entry.getKey();
                            break;
                        }
                    } else {
                        str = "";
                        break;
                    }
                }
                if (str.length() > 0 && (c08i7 = (C08I7) ((ConcurrentHashMap) this.LL.LIZ.getValue()).get(str)) != null) {
                    c08i7.LIZLLL(c0y8t.getConversationId(), c0y8t);
                }
            }
        });
    }

    public final void LIZ(String str) {
        if (str.length() == 0) {
            Iterator it2 = ((ConcurrentHashMap) this.LIZ.getValue()).entrySet().iterator();
            while (it2.hasNext()) {
                ((C08I7) ((Map.Entry) it2.next()).getValue()).LIZ();
            }
        } else {
            C08I7 c08i7 = (C08I7) ((ConcurrentHashMap) this.LIZ.getValue()).get(str);
            if (c08i7 != null) {
                c08i7.LIZ();
            }
        }
    }
}
