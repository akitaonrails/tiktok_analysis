package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC1366540lfI;
import X.AbstractC1375550ltp;
import X.C01GW;
import X.C09RB;
import X.C09RD;
import X.C0M7Y;
import X.C0XQ7;
import X.C1106210etP;
import X.C1369580lkC;
import X.C1388190mED;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C419910GdJ;
import X.C421640Gg6;
import X.C423520Gj8;
import X.C452501pT;
import X.InterfaceC1361560lXG;
import X.InterfaceC1363540laS;
import X.InterfaceC1369790lkX;
import X.InterfaceC1842140y2O;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.RepostInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.share.improve.channel.LiveRepostChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveRepostChannel extends PureLogicChannel {
    public final Context LL;
    public final C1106210etP LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public C421640Gg6 LLILZIL;
    public TuxTextView LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(323));
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        return null;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "live_repost";
    }

    public final InterfaceC1363540laS LIZ() {
        return (InterfaceC1363540laS) this.LLIZLLLIL.getValue();
    }

    public final Map<String, String> LJ() {
        String requestId;
        RepostInfo repostInfo;
        User owner;
        FollowInfo followInfo;
        Pair[] pairArr = new Pair[11];
        pairArr[0] = new Pair("user_id", C0XQ7.LJFF().getCurUserId());
        pairArr[1] = new Pair("panel_source", "share_panel");
        pairArr[2] = new Pair("button_status", this.LLILZ ? "repost" : "cancel_repost");
        pairArr[3] = new Pair("enter_from_merge", this.LLILLJJLI.LJIL);
        pairArr[4] = new Pair("enter_method", this.LLILLJJLI.LJJ);
        pairArr[5] = new Pair("action_type", this.LLILLJJLI.LJIJI);
        Room room = this.LLILLJJLI.LJJIIZ;
        Long lValueOf = null;
        pairArr[6] = new Pair("room_id", room != null ? room.getIdStr() : null);
        Room room2 = this.LLILLJJLI.LJJIIZ;
        pairArr[7] = new Pair("anchor_id", String.valueOf(room2 != null ? Long.valueOf(room2.getOwnerUserId()) : null));
        Room room3 = this.LLILLJJLI.LJJIIZ;
        pairArr[8] = new Pair("follow_status", String.valueOf((room3 == null || (owner = room3.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) ? null : Long.valueOf(followInfo.getFollowStatus())));
        Room room4 = this.LLILLJJLI.LJJIIZ;
        if (room4 != null && (repostInfo = room4.repostInfo) != null) {
            lValueOf = Long.valueOf(repostInfo.repostersCnt);
        }
        pairArr[9] = new Pair("reposted_user_cnt", String.valueOf(lValueOf));
        Room room5 = this.LLILLJJLI.LJJIIZ;
        if (room5 == null || (requestId = room5.getRequestId()) == null) {
            requestId = "";
        }
        pairArr[10] = new Pair("request_id", requestId);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LJJLIIIJJI() {
        return ((Boolean) this.LLIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        int iLIZIZ = 0;
        if (this.LLILZ) {
            InterfaceC1363540laS interfaceC1363540laSLIZ = LIZ();
            if (interfaceC1363540laSLIZ != null) {
                iLIZIZ = interfaceC1363540laSLIZ.LJFF();
            }
        } else {
            InterfaceC1363540laS interfaceC1363540laSLIZ2 = LIZ();
            if (interfaceC1363540laSLIZ2 != null) {
                iLIZIZ = interfaceC1363540laSLIZ2.LIZIZ();
            }
        }
        return this.LL.getString(iLIZIZ);
    }

    public final void LJFF(C421640Gg6 c421640Gg6) {
        if (this.LLILZ) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = ((InterfaceC1361560lXG) this.LLJ.getValue()).LIZIZ();
            c421640Gg6.setImageDrawable(c419910GdJ.LIZ(c421640Gg6.getContext()));
            InterfaceC1363540laS interfaceC1363540laSLIZ = LIZ();
            if (interfaceC1363540laSLIZ != null && !interfaceC1363540laSLIZ.LJIIJ()) {
                c421640Gg6.setImageDrawable(null);
                c421640Gg6.setAnimation(((InterfaceC1361560lXG) this.LLJ.getValue()).LJIIJJI());
                c421640Gg6.setRepeatCount(((InterfaceC1361560lXG) this.LLJ.getValue()).LJIIIIZZ());
                c421640Gg6.playAnimation();
                InterfaceC1363540laS interfaceC1363540laSLIZ2 = LIZ();
                if (interfaceC1363540laSLIZ2 != null) {
                    interfaceC1363540laSLIZ2.LJ();
                    return;
                }
                return;
            }
            return;
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = ((InterfaceC1361560lXG) this.LLJ.getValue()).LJFF();
        c421640Gg6.setImageDrawable(c419910GdJ2.LIZ(c421640Gg6.getContext()));
    }

    public final void LJJ(boolean z) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Dialog dialog;
        Window window;
        ViewGroup viewGroup;
        List listLJJII;
        Object next;
        Activity activityLIZ = C1388190mED.LIZ(this.LL);
        InterfaceC1369790lkX interfaceC1369790lkX = null;
        if ((activityLIZ instanceof C19GS) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("SKELETON_SHARE_FRAGMENT");
            if ((fragmentLJJJJZI instanceof DialogFragment) && (dialog = ((DialogFragment) fragmentLJJJJZI).getDialog()) != null && (window = dialog.getWindow()) != null) {
                View viewFindViewById = window.getDecorView().findViewById(R.id.nhk);
                if ((viewFindViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById) != null && (listLJJII = C09RB.LJJII(new C09RD(viewGroup))) != null) {
                    Iterator it2 = listLJJII.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next instanceof C1369580lkC) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    View view = (View) next;
                    if (view != null) {
                        C1369580lkC c1369580lkC = (C1369580lkC) view;
                        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.doe);
                        C423520Gj8 c423520Gj8 = new C423520Gj8();
                        c423520Gj8.LLILLL = 150L;
                        c423520Gj8.LLILZ = 150L;
                        recyclerView.setItemAnimator(c423520Gj8);
                        if (z) {
                            ArrayList arrayList = new ArrayList(c1369580lkC.getCurrentChannel());
                            Iterator it3 = arrayList.iterator();
                            int i = 0;
                            while (it3.hasNext()) {
                                if (Intrinsics.LJFF(it3.next(), this)) {
                                    if (i != -1) {
                                        int i2 = i + 1;
                                        LiveRepostAddNoteChannel liveRepostAddNoteChannel = new LiveRepostAddNoteChannel(this.LL, this.LLILLJJLI);
                                        ListProtector.add(arrayList, i2, liveRepostAddNoteChannel);
                                        ArrayList arrayList2 = new ArrayList(c1369580lkC.LLJILLL);
                                        ListProtector.add(arrayList2, i2, liveRepostAddNoteChannel);
                                        c1369580lkC.LLJILLL = arrayList2;
                                        AbstractC1366540lfI abstractC1366540lfI = c1369580lkC.LLJJI;
                                        if (abstractC1366540lfI != null) {
                                            abstractC1366540lfI.LLLFZ(liveRepostAddNoteChannel, i2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                i++;
                            }
                            return;
                        }
                        Iterator<InterfaceC1369790lkX> it4 = c1369580lkC.getCurrentChannel().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            InterfaceC1369790lkX next2 = it4.next();
                            if (next2 instanceof LiveRepostAddNoteChannel) {
                                interfaceC1369790lkX = next2;
                                break;
                            }
                        }
                        InterfaceC1369790lkX interfaceC1369790lkX2 = interfaceC1369790lkX;
                        if (interfaceC1369790lkX2 == null) {
                            return;
                        }
                        int iIndexOf = c1369580lkC.LLJILLL.indexOf(interfaceC1369790lkX2);
                        if (iIndexOf != -1) {
                            ArrayList arrayList3 = new ArrayList(c1369580lkC.LLJILLL);
                            ListProtector.remove(arrayList3, iIndexOf);
                            c1369580lkC.LLJILLL = arrayList3;
                        }
                        AbstractC1366540lfI abstractC1366540lfI2 = c1369580lkC.LLJJI;
                        if (abstractC1366540lfI2 == null) {
                            return;
                        }
                        abstractC1366540lfI2.LLLI(interfaceC1369790lkX2);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final void LJJIIJZLJL(int i) {
        if (!this.LLILLL) {
            C20684815ws.LJIILLIIL("livesdk_repost_icon_show", LJ());
            this.LLILLL = true;
        }
    }

    public LiveRepostChannel(Context context, C1106210etP c1106210etP) {
        this.LL = context;
        this.LLILLJJLI = c1106210etP;
        this.LLILZ = true;
        Room room = c1106210etP.LJJIIZ;
        boolean z = false;
        if (room != null && room.reposted) {
            z = true;
        }
        this.LLILZ = true ^ z;
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(324));
        this.LLJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(325));
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final void LJJIJIL(View view, boolean z) {
        C421640Gg6 c421640Gg6;
        int i;
        TuxTextView tuxTextView = null;
        if ((view instanceof ViewGroup) && view != null && (c421640Gg6 = (C421640Gg6) view.findViewById(R.id.av1)) != null) {
            if (z) {
                i = R.dimen.az;
            } else {
                i = R.dimen.b4;
            }
            float dimensionPixelSize = this.LL.getResources().getDimensionPixelSize(i);
            RadiusLayout radiusLayout = (RadiusLayout) view.findViewById(R.id.kc7);
            if (radiusLayout != null) {
                radiusLayout.LIZ(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            }
            LJFF(c421640Gg6);
            this.LLILZIL = c421640Gg6;
            if (view instanceof ViewGroup) {
                tuxTextView = (TuxTextView) view.findViewById(R.id.uyz);
            }
            this.LLILZLL = tuxTextView;
        }
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
        Map<String, String> mapLJ = LJ();
        long id = 0;
        if (this.LLILZ) {
            InterfaceC1363540laS interfaceC1363540laSLIZ = LIZ();
            if (interfaceC1363540laSLIZ != null) {
                Room room = this.LLILLJJLI.LJJIIZ;
                if (room != null) {
                    id = room.getId();
                }
                interfaceC1363540laSLIZ.LJIIJJI(id, new InterfaceC1842140y2O() { // from class: X.0lfG
                    @Override // X.InterfaceC1842140y2O
                    public final void onFailure() {
                    }

                    @Override // X.InterfaceC1842140y2O
                    public final void onSuccess() {
                        if (((Boolean) this.LIZ.LLIZ.getValue()).booleanValue()) {
                            this.LIZ.LJJ(true);
                            LiveRepostChannel liveRepostChannel = this.LIZ;
                            liveRepostChannel.LLILZ = false;
                            C421640Gg6 c421640Gg6 = liveRepostChannel.LLILZIL;
                            if (c421640Gg6 != null) {
                                liveRepostChannel.LJFF(c421640Gg6);
                            }
                            LiveRepostChannel liveRepostChannel2 = this.LIZ;
                            TuxTextView tuxTextView = liveRepostChannel2.LLILZLL;
                            if (tuxTextView != null) {
                                tuxTextView.setText(liveRepostChannel2.label());
                            }
                        }
                    }
                }, mapLJ);
            }
        } else {
            InterfaceC1363540laS interfaceC1363540laSLIZ2 = LIZ();
            if (interfaceC1363540laSLIZ2 != null) {
                Room room2 = this.LLILLJJLI.LJJIIZ;
                if (room2 != null) {
                    id = room2.getId();
                }
                interfaceC1363540laSLIZ2.LIZ(id, new InterfaceC1842140y2O() { // from class: X.0lfH
                    @Override // X.InterfaceC1842140y2O
                    public final void onFailure() {
                    }

                    @Override // X.InterfaceC1842140y2O
                    public final void onSuccess() {
                        if (((Boolean) this.LIZ.LLIZ.getValue()).booleanValue()) {
                            this.LIZ.LJJ(false);
                            LiveRepostChannel liveRepostChannel = this.LIZ;
                            liveRepostChannel.LLILZ = true;
                            C421640Gg6 c421640Gg6 = liveRepostChannel.LLILZIL;
                            if (c421640Gg6 != null) {
                                liveRepostChannel.LJFF(c421640Gg6);
                            }
                            LiveRepostChannel liveRepostChannel2 = this.LIZ;
                            TuxTextView tuxTextView = liveRepostChannel2.LLILZLL;
                            if (tuxTextView != null) {
                                tuxTextView.setText(liveRepostChannel2.label());
                            }
                        }
                    }
                }, mapLJ);
            }
        }
        C20684815ws.LJIILLIIL("livesdk_repost_icon_click", mapLJ);
        return true;
    }
}
