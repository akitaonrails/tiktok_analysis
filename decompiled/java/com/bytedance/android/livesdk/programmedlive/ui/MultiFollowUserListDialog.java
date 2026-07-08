package com.bytedance.android.livesdk.programmedlive.ui;

import X.AbstractC21673619ry;
import X.C0JDJ;
import X.C426750GoL;
import X.C465220IMe;
import X.C488940JFk;
import X.C497740JfY;
import X.C500980Jkm;
import Y.ACListenerS111S0200000_7;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiFollowUserListDialog extends LiveDialogFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ODcjLj0yJSHELIOSgpLSM6PiBiPCZ9BTAgPSYVJykgJjgGOyA+BSYgPAElKCM8Lw==";
    public final List<User> LL = new ArrayList();

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        int iLIZIZ = (((int) C497740JfY.LIZIZ(68.0f)) * ((ArrayList) this.LL).size()) + ((int) C497740JfY.LIZIZ(71.0f));
        double dLJIILLIIL = ((double) C497740JfY.LJIILLIIL()) * 0.6d;
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g8v);
        c500980Jkm.LJI = 0.0f;
        if (C497740JfY.LJIL()) {
            c500980Jkm.LIZJ = R.style.ahb;
            c500980Jkm.LJII = 80;
            c500980Jkm.LJIIIZ = -1;
            if (iLIZIZ > dLJIILLIIL) {
                c500980Jkm.LJIIJJI = 60;
                return c500980Jkm;
            }
            c500980Jkm.LJIIJ = iLIZIZ + ((int) C497740JfY.LIZIZ(34.0f));
            return c500980Jkm;
        }
        Context context = getContext();
        if (context == null || !C426750GoL.LIZLLL(context)) {
            c500980Jkm.LIZJ = R.style.ahg;
            c500980Jkm.LJII = 8388613;
        } else {
            c500980Jkm.LIZJ = R.style.ahf;
            c500980Jkm.LJII = 8388611;
        }
        c500980Jkm.LJIIIZ = (int) C497740JfY.LIZIZ(375.0f);
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        final List<User> list = this.LL;
        final DataChannel dataChannel = this.dataChannel;
        AbstractC21673619ry<C488940JFk> abstractC21673619ry = new AbstractC21673619ry<C488940JFk>(dataChannel, list) { // from class: X.0Iku
            public final List<User> LL;
            public final DataChannel LLILLJJLI;

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return this.LL.size();
            }

            @Override // X.AbstractC21673619ry
            public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
                C488940JFk c488940JFk = (C488940JFk) viewHolder;
                super.onViewRecycled(c488940JFk);
                C11NJ c11nj = c488940JFk.LLIZ;
                if (c11nj != null) {
                    c11nj.dispose();
                }
                c488940JFk.LLIZ = null;
            }

            {
                this.LL = list;
                this.LLILLJJLI = dataChannel;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                boolean z;
                C488940JFk c488940JFk = (C488940JFk) viewHolder;
                User user = (User) ListProtector.get(this.LL, i);
                C11NJ c11nj = c488940JFk.LLIZ;
                if (c11nj != null && !c11nj.LLILLJJLI) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C11NJ c11nj2 = c488940JFk.LLIZ;
                    if (c11nj2 != null) {
                        c11nj2.dispose();
                    }
                    c488940JFk.LLIZ = null;
                }
                c488940JFk.LLIZ = new C11NJ();
                C1121670fIL.LJIIL(c488940JFk.LLILLJJLI, user.getAvatarThumb(), R.drawable.el9);
                c488940JFk.LLILLL.setText(C0KVU.LIZ(user));
                if (user.getAuthenticationInfo() != null) {
                    C0JSS.LJFF(c488940JFk.LLILZIL, user.getAuthenticationInfo().authenticationBadge, 0, new C522060Kdg(c488940JFk, 4));
                } else {
                    C1324720kZq c1324720kZq = c488940JFk.LLILZIL;
                    if (c1324720kZq != null) {
                        c1324720kZq.setImageDrawable(null);
                    }
                    C1324720kZq c1324720kZq2 = c488940JFk.LLILZIL;
                    if (c1324720kZq2 != null) {
                        C500260Jjc.LJIILIIL(c1324720kZq2);
                    }
                }
                C197039127h c197039127h = c488940JFk.LLILZ;
                if (user.isFollowing()) {
                    c197039127h.setButtonVariant(2);
                    c488940JFk.L5(false);
                } else {
                    c197039127h.setButtonVariant(0);
                    c488940JFk.L5(true);
                }
                C786410Ut5.U8(c488940JFk.LLILZ, new ACListenerS111S0200000_7(user, c488940JFk, 73));
                C11NJ c11nj3 = c488940JFk.LLIZ;
                if (c11nj3 != null) {
                    c11nj3.LIZ(UserService.getInstance().user().LIZIZ(user.getId()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(c488940JFk, 290), new C09JN() { // from class: X.00NB
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("FollowUserViewHolder@d8bf.bind$5");
                            C1C7U.LIZIZ("FollowUserViewHolder@d8bf.bind$5");
                        }
                    }));
                }
                C786410Ut5.R7(c488940JFk.LLILZLL, new ACListenerS111S0200000_7(user, c488940JFk, 74));
                C786410Ut5.e8(c488940JFk.LLILLJJLI, new ACListenerS111S0200000_7(user, c488940JFk, 75));
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C488940JFk c488940JFk = new C488940JFk(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gqr, viewGroup, false), this.LLILLJJLI);
                try {
                    View view2 = c488940JFk.itemView;
                    if (view2 != null) {
                        view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c488940JFk.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c488940JFk.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C488940JFk.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c488940JFk.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c488940JFk.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C488940JFk.class.getName();
                return c488940JFk;
            }
        };
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.user_list);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(abstractC21673619ry);
        }
    }
}
