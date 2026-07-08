package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C0O1Q;
import X.C1209980ham;
import X.C13BV;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C2153208c6;
import X.C23250099c;
import X.C737030Svd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.List;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class FriendsV3CommentSyncAssem extends BasePanelComponent {
    public final List<FriendsV3CommentProtocol> bo() {
        List<FriendsV3CommentProtocol> listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), FriendsV3CommentProtocol.class, false);
        return listLIZIZ == null ? C13BV.INSTANCE : listLIZIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        super.onDestroy();
    }

    @C14EU
    public final void onCommentEvent(C1209980ham c1209980ham) {
        Object[] objArr;
        String str;
        Comment comment;
        Object[] objArr2;
        String str2;
        String str3;
        String str4;
        if (c1209980ham != null && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            int i = c1209980ham.LIZ;
            if (i != 3) {
                if (i != 4) {
                    if (i != 8) {
                        return;
                    }
                    Object obj = c1209980ham.LIZIZ;
                    if ((obj instanceof String) && (str4 = (String) obj) != null) {
                        for (FriendsV3CommentProtocol friendsV3CommentProtocol : bo()) {
                            if (friendsV3CommentProtocol.I0(str4)) {
                                friendsV3CommentProtocol.Lw2();
                            }
                        }
                        return;
                    }
                    return;
                }
                Object obj2 = c1209980ham.LIZIZ;
                if ((obj2 instanceof Object[]) && (objArr2 = (Object[]) obj2) != null && objArr2.length == 2) {
                    Object obj3 = objArr2[0];
                    if ((obj3 instanceof String) && (str2 = (String) obj3) != null) {
                        for (FriendsV3CommentProtocol friendsV3CommentProtocol2 : bo()) {
                            if (friendsV3CommentProtocol2.I0(str2)) {
                                Object obj4 = objArr2[1];
                                if ((obj4 instanceof String) && (str3 = (String) obj4) != null) {
                                    friendsV3CommentProtocol2.U71(str3);
                                } else {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj5 = c1209980ham.LIZIZ;
            if ((obj5 instanceof Object[]) && (objArr = (Object[]) obj5) != null && objArr.length == 2) {
                Object obj6 = objArr[0];
                if ((obj6 instanceof String) && (str = (String) obj6) != null) {
                    for (FriendsV3CommentProtocol friendsV3CommentProtocol3 : bo()) {
                        if (friendsV3CommentProtocol3.I0(str)) {
                            Object obj7 = objArr[1];
                            if ((obj7 instanceof Comment) && (comment = (Comment) obj7) != null) {
                                friendsV3CommentProtocol3.Cj0(comment);
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C2153208c6.LIZ().LIZJ, null, new C0O1Q(c737030Svd, this, null), 2);
    }
}
