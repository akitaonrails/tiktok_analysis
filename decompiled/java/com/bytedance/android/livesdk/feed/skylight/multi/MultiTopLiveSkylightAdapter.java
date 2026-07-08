package com.bytedance.android.livesdk.feed.skylight.multi;

import X.AbstractC21673619ry;
import X.C0GSX;
import X.C0JBN;
import X.C0KVU;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C13LP;
import X.C1819620xS4;
import X.C1AF0;
import X.C20441214yg;
import X.C20612085q;
import X.C2081408Dk;
import X.C21569819bE;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C472490Ifv;
import X.C472610Ig7;
import X.C472650IgB;
import X.C472660IgC;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C842240X2g;
import X.C946803n0;
import X.EnumC21569519bB;
import X.InterfaceC2262081DgM;
import X.InterfaceC472680IgE;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendShowUser;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomViewHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutSkylightShowInviteRoomSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS93S0201000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLiveSkylightAdapter extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final InterfaceC472680IgE LL;
    public final List<RecommendItem> LLILLJJLI = new ArrayList();
    public boolean LLILLL;
    public int LLILZ;

    public static final class CoLiveViewHolder extends LiveRoomViewHolder {
        public final InterfaceC472680IgE LLJJJIL;
        public final C1324720kZq LLJJJJ;
        public final C1324720kZq LLJJJJJIL;
        public final C0GSX LLJJJJLIIL;
        public final TuxTextView LLJJL;
        public final TuxTextView LLJJLIIIJLLLLLLLZ;
        public final C1324720kZq LLJL;
        public final C0GSX LLJLIL;

        @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
        public final void I5(FeedItem feedItem, FeedExtra feedExtra, String str, int i) {
        }

        @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
        public final void clearAnimation() {
        }

        @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomViewHolder, com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
        public final void onViewAttachedToWindow() {
            super.onViewAttachedToWindow();
            this.LLJJJIL.LIZIZ(getLayoutPosition());
        }

        public CoLiveViewHolder(View view, InterfaceC472680IgE interfaceC472680IgE) {
            super(view, C472490Ifv.LIZIZ, null, null);
            this.LLJJJIL = interfaceC472680IgE;
            this.LLJJJJ = (C1324720kZq) view.findViewById(R.id.oqm);
            this.LLJJJJJIL = (C1324720kZq) view.findViewById(R.id.oql);
            this.LLJJJJLIIL = (C0GSX) view.findViewById(R.id.oqr);
            this.LLJJL = (TuxTextView) view.findViewById(R.id.oqv);
            this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.oqw);
            this.LLJL = (C1324720kZq) view.findViewById(R.id.oqq);
            this.LLJLIL = (C0GSX) view.findViewById(R.id.oqr);
        }
    }

    public static final class SingleViewHolder extends LiveRoomViewHolder {
        public final InterfaceC472680IgE LLJJJIL;
        public final C1324720kZq LLJJJJ;
        public final C0GSX LLJJJJJIL;
        public final TuxTextView LLJJJJLIIL;
        public final TuxTextView LLJJL;
        public final C1324720kZq LLJJLIIIJLLLLLLLZ;
        public final C0GSX LLJL;

        @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
        public final void I5(FeedItem feedItem, FeedExtra feedExtra, String str, int i) {
        }

        @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
        public final void clearAnimation() {
        }

        @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomViewHolder, com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
        public final void onViewAttachedToWindow() {
            super.onViewAttachedToWindow();
            this.LLJJJIL.LIZIZ(getLayoutPosition());
        }

        public SingleViewHolder(View view, InterfaceC472680IgE interfaceC472680IgE) {
            C21569819bE c21569819bE;
            super(view, C472490Ifv.LIZIZ, null, null);
            this.LLJJJIL = interfaceC472680IgE;
            this.LLJJJJ = (C1324720kZq) view.findViewById(R.id.oqi);
            this.LLJJJJJIL = (C0GSX) view.findViewById(R.id.oqr);
            this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.oqv);
            this.LLJJL = (TuxTextView) view.findViewById(R.id.oqw);
            this.LLJJLIIIJLLLLLLLZ = (C1324720kZq) view.findViewById(R.id.oqq);
            this.LLJL = (C0GSX) view.findViewById(R.id.oqr);
            if (S5()) {
                C21569819bE c21569819bE2 = (C21569819bE) view.findViewById(R.id.oqs);
                this.LLJJI = c21569819bE2;
                if (c21569819bE2 != null) {
                    c21569819bE2.LIZJ(EnumC21569519bB.LIVE_TOPLIVE_SKY_LIVING_ICON_NEW);
                }
                C21569819bE c21569819bE3 = this.LLJJI;
                if (c21569819bE3 != null) {
                    c21569819bE3.setOuterCircleColors(-16777216);
                }
                if (C472610Ig7.LIZ() > 0 && (c21569819bE = this.LLJJI) != null) {
                    c21569819bE.setRenderInterval(C472610Ig7.LIZ());
                }
                C500260Jjc.LLFFF(this.LLJJI);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL ? this.LLILZ : ((ArrayList) this.LLILLJJLI).size();
    }

    public MultiTopLiveSkylightAdapter(InterfaceC472680IgE interfaceC472680IgE) {
        this.LL = interfaceC472680IgE;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (this.LLILLL) {
            return 0;
        }
        return ((RecommendItem) ListProtector.get(this.LLILLJJLI, i)).skylightItemType;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof SingleViewHolder) || (viewHolder instanceof CoLiveViewHolder) || (viewHolder instanceof C472660IgC)) {
            this.LL.LIZIZ(viewHolder.getBindingAdapterPosition());
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        User user;
        User user2;
        ImageModel avatarThumb;
        ImageModel avatarThumb2;
        int iIntValue;
        Integer numLIZJ;
        User user3;
        ImageModel avatarThumb3;
        int iIntValue2;
        Integer numLIZJ2;
        InterfaceC2262081DgM curUser;
        ImageModel avatarThumb4;
        List<String> listLIZ;
        String str;
        if (this.LLILLL) {
            C786410Ut5.I7(null, viewHolder.itemView);
            viewHolder.itemView.setClickable(false);
            return;
        }
        RecommendItem recommendItem = (RecommendItem) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if (recommendItem == null) {
            return;
        }
        if (viewHolder instanceof C472660IgC) {
            C472660IgC c472660IgC = (C472660IgC) viewHolder;
            c472660IgC.getClass();
            IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
            if (iHostUser != null && (curUser = iHostUser.getCurUser()) != null && (avatarThumb4 = curUser.getAvatarThumb()) != null && (listLIZ = C842240X2g.LIZ(avatarThumb4)) != null && (str = (String) C13LP.LJJJLL(listLIZ)) != null && str.length() != 0) {
                C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
                url.LJIILIIL = Boolean.TRUE;
                url.LJJI(c472660IgC.LL);
            }
        } else if (viewHolder instanceof SingleViewHolder) {
            SingleViewHolder singleViewHolder = (SingleViewHolder) viewHolder;
            Context context = singleViewHolder.itemView.getContext();
            RecommendShowUser recommendShowUser = recommendItem.user;
            if (recommendShowUser != null) {
                user3 = recommendShowUser.user;
            } else {
                user3 = null;
            }
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            if (user3 != null) {
                avatarThumb3 = user3.getAvatarThumb();
            } else {
                avatarThumb3 = null;
            }
            C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(avatarThumb3);
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJJI(singleViewHolder.LLJJJJ);
            C0GSX c0gsx = singleViewHolder.LLJJJJJIL;
            if (c0gsx != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.c5t, context)) != null) {
                int iIntValue3 = numLIZJ2.intValue();
                c0gsx.LIZ(iIntValue3, iIntValue3);
            }
            String strLIZ = C0KVU.LIZ(user3);
            if (strLIZ != null && strLIZ.length() > 10) {
                TuxTextView tuxTextView = singleViewHolder.LLJJJJLIIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZ.substring(0, 10));
                sbLIZ.append("...");
                tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                singleViewHolder.LLJJJJLIIL.setText(strLIZ);
            }
            singleViewHolder.LLJJL.setCompoundDrawablesRelative(null, null, null, null);
            int i2 = recommendItem.skylightItemType;
            if (i2 != 6) {
                if (i2 != 7) {
                    String str2 = recommendItem.recallReason;
                    if (str2 != null && str2.length() != 0 && str2.length() <= 12) {
                        C786410Ut5.LLLLZLL(singleViewHolder.LLJJL, 0);
                        singleViewHolder.LLJJL.setText(str2);
                    } else {
                        C786410Ut5.LLLLZLL(singleViewHolder.LLJJL, 8);
                    }
                } else if (HangoutSkylightShowInviteRoomSetting.INSTANCE.getValue()) {
                    C472650IgB.LIZJ(singleViewHolder.LLJJL, R.attr.eyp);
                    C786410Ut5.LLLLZLL(singleViewHolder.LLJJL, 0);
                    singleViewHolder.LLJJL.setText(C497740JfY.LJIJI(2131854288));
                } else {
                    String str3 = recommendItem.recallReason;
                    if (str3 != null && str3.length() != 0 && str3.length() <= 12) {
                        C786410Ut5.LLLLZLL(singleViewHolder.LLJJL, 0);
                        singleViewHolder.LLJJL.setText(str3);
                    } else {
                        C786410Ut5.LLLLZLL(singleViewHolder.LLJJL, 8);
                    }
                }
            } else {
                CharSequence charSequenceLIZIZ = C472650IgB.LIZIZ(singleViewHolder.LLJJL, recommendItem.guestApplyInfo);
                if (charSequenceLIZIZ != null && ((String) charSequenceLIZIZ).length() != 0) {
                    C786410Ut5.LLLLZLL(singleViewHolder.LLJJL, 0);
                    singleViewHolder.LLJJL.setText(charSequenceLIZIZ);
                } else {
                    C786410Ut5.LLLLZLL(singleViewHolder.LLJJL, 8);
                }
            }
            if (!singleViewHolder.S5()) {
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.c5t, context);
                if (numLIZJ3 != null) {
                    iIntValue2 = numLIZJ3.intValue();
                } else {
                    iIntValue2 = -16777216;
                }
                C0GSX c0gsx2 = singleViewHolder.LLJL;
                if (c0gsx2 != null) {
                    c0gsx2.LIZ(iIntValue2, iIntValue2);
                }
                C0GSX c0gsx3 = singleViewHolder.LLJL;
                if (c0gsx3 != null) {
                    C500260Jjc.LLFFF(c0gsx3);
                }
                C21569819bE c21569819bE = singleViewHolder.LLJJI;
                if (c21569819bE != null) {
                    C500260Jjc.LJIILIIL(c21569819bE);
                }
            } else {
                C0GSX c0gsx4 = singleViewHolder.LLJL;
                if (c0gsx4 != null) {
                    C500260Jjc.LJIILIIL(c0gsx4);
                }
            }
            singleViewHolder.U5(singleViewHolder.LLJJLIIIJLLLLLLLZ);
            InterfaceC472680IgE interfaceC472680IgE = singleViewHolder.LLJJJIL;
            singleViewHolder.getLayoutPosition();
            interfaceC472680IgE.onBind();
        } else if (viewHolder instanceof CoLiveViewHolder) {
            CoLiveViewHolder coLiveViewHolder = (CoLiveViewHolder) viewHolder;
            Context context2 = coLiveViewHolder.itemView.getContext();
            RecommendShowUser recommendShowUser2 = (RecommendShowUser) C13LP.LJJJLL(recommendItem.showUserList);
            if (recommendShowUser2 != null) {
                user = recommendShowUser2.user;
            } else {
                user = null;
            }
            RecommendShowUser recommendShowUser3 = recommendItem.user;
            if (recommendShowUser3 != null) {
                user2 = recommendShowUser3.user;
            } else {
                user2 = null;
            }
            C0JBN c0jbnLIZ2 = C1819620xS4.LIZ();
            if (user != null) {
                avatarThumb = user.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            C1324610kZf c1324610kZfLJIIIZ2 = c0jbnLIZ2.LJIIIZ(avatarThumb);
            Boolean bool = Boolean.TRUE;
            c1324610kZfLJIIIZ2.LJIILIIL = bool;
            c1324610kZfLJIIIZ2.LJJI(coLiveViewHolder.LLJJJJ);
            C0JBN c0jbnLIZ3 = C1819620xS4.LIZ();
            if (user2 == null || (avatarThumb2 = user2.getAvatarThumb()) == null) {
                if (user != null) {
                    avatarThumb2 = user.getAvatarThumb();
                } else {
                    avatarThumb2 = null;
                }
            }
            C1324610kZf c1324610kZfLJIIIZ3 = c0jbnLIZ3.LJIIIZ(avatarThumb2);
            c1324610kZfLJIIIZ3.LJIILIIL = bool;
            c1324610kZfLJIIIZ3.LJJI(coLiveViewHolder.LLJJJJJIL);
            C0GSX c0gsx5 = coLiveViewHolder.LLJJJJLIIL;
            if (c0gsx5 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c5t, context2)) != null) {
                int iIntValue4 = numLIZJ.intValue();
                c0gsx5.LIZ(iIntValue4, iIntValue4);
            }
            String strLIZ2 = C0KVU.LIZ(user2);
            if (strLIZ2 != null && strLIZ2.length() > 10) {
                TuxTextView tuxTextView2 = coLiveViewHolder.LLJJL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZ2.substring(0, 10));
                sbLIZ2.append("...");
                tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                coLiveViewHolder.LLJJL.setText(strLIZ2);
            }
            coLiveViewHolder.LLJJLIIIJLLLLLLLZ.setCompoundDrawablesRelative(null, null, null, null);
            int i3 = recommendItem.skylightItemType;
            if (i3 != 6) {
                if (i3 != 7) {
                    String str4 = recommendItem.recallReason;
                    if (str4 != null && str4.length() != 0 && str4.length() <= 12) {
                        C786410Ut5.LLLLZLL(coLiveViewHolder.LLJJLIIIJLLLLLLLZ, 0);
                        coLiveViewHolder.LLJJLIIIJLLLLLLLZ.setText(str4);
                    } else {
                        C786410Ut5.LLLLZLL(coLiveViewHolder.LLJJLIIIJLLLLLLLZ, 8);
                    }
                } else if (HangoutSkylightShowInviteRoomSetting.INSTANCE.getValue()) {
                    C472650IgB.LIZJ(coLiveViewHolder.LLJJLIIIJLLLLLLLZ, R.attr.eyp);
                    C786410Ut5.LLLLZLL(coLiveViewHolder.LLJJLIIIJLLLLLLLZ, 0);
                    coLiveViewHolder.LLJJLIIIJLLLLLLLZ.setText(C497740JfY.LJIJI(2131854288));
                } else {
                    String str5 = recommendItem.recallReason;
                    if (str5 != null && str5.length() != 0 && str5.length() <= 12) {
                        C786410Ut5.LLLLZLL(coLiveViewHolder.LLJJLIIIJLLLLLLLZ, 0);
                        coLiveViewHolder.LLJJLIIIJLLLLLLLZ.setText(str5);
                    } else {
                        C786410Ut5.LLLLZLL(coLiveViewHolder.LLJJLIIIJLLLLLLLZ, 8);
                    }
                }
            } else {
                CharSequence charSequenceLIZIZ2 = C472650IgB.LIZIZ(coLiveViewHolder.LLJJLIIIJLLLLLLLZ, recommendItem.guestApplyInfo);
                if (charSequenceLIZIZ2 != null && ((String) charSequenceLIZIZ2).length() != 0) {
                    C786410Ut5.LLLLZLL(coLiveViewHolder.LLJJLIIIJLLLLLLLZ, 0);
                    coLiveViewHolder.LLJJLIIIJLLLLLLLZ.setText(charSequenceLIZIZ2);
                } else {
                    C786410Ut5.LLLLZLL(coLiveViewHolder.LLJJLIIIJLLLLLLLZ, 8);
                }
            }
            if (!coLiveViewHolder.S5()) {
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.c5t, context2);
                if (numLIZJ4 != null) {
                    iIntValue = numLIZJ4.intValue();
                } else {
                    iIntValue = -16777216;
                }
                C0GSX c0gsx6 = coLiveViewHolder.LLJLIL;
                if (c0gsx6 != null) {
                    c0gsx6.LIZ(iIntValue, iIntValue);
                }
                C0GSX c0gsx7 = coLiveViewHolder.LLJLIL;
                if (c0gsx7 != null) {
                    C500260Jjc.LLFFF(c0gsx7);
                }
                C21569819bE c21569819bE2 = coLiveViewHolder.LLJJI;
                if (c21569819bE2 != null) {
                    C500260Jjc.LJIILIIL(c21569819bE2);
                }
            } else {
                C0GSX c0gsx8 = coLiveViewHolder.LLJLIL;
                if (c0gsx8 != null) {
                    C500260Jjc.LJIILIIL(c0gsx8);
                }
            }
            coLiveViewHolder.U5(coLiveViewHolder.LLJL);
        }
        C500260Jjc.LJLIIIL(500L, viewHolder.itemView, new AwS93S0201000_7(this, i, recommendItem, 0));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder singleViewHolder;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3 && i != 4 && i != 5) {
                    if (i != 100) {
                        C20441214yg.LIZIZ("MultiTopLiveSkylightAdapter", "onCreateViewHolder: default item type");
                        singleViewHolder = new SingleViewHolder(C786410Ut5.Td(layoutInflaterNe, R.layout.hbk, viewGroup, false), this.LL);
                    } else {
                        C20441214yg.LIZIZ("MultiTopLiveSkylightAdapter", "onCreateViewHolder: go-live item");
                        singleViewHolder = new C472660IgC(C786410Ut5.Td(layoutInflaterNe, R.layout.hbi, viewGroup, false), this.LL);
                    }
                } else {
                    C20441214yg.LIZIZ("MultiTopLiveSkylightAdapter", "onCreateViewHolder: co-live item");
                    singleViewHolder = new CoLiveViewHolder(C786410Ut5.Td(layoutInflaterNe, R.layout.hbh, viewGroup, false), this.LL);
                }
            } else {
                C20441214yg.LIZIZ("MultiTopLiveSkylightAdapter", "onCreateViewHolder: single-live item");
                singleViewHolder = new SingleViewHolder(C786410Ut5.Td(layoutInflaterNe, R.layout.hbk, viewGroup, false), this.LL);
            }
        } else if (this.LLILLL) {
            C20441214yg.LIZIZ("MultiTopLiveSkylightAdapter", "onCreateViewHolder: placeholder item");
            final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hbj, viewGroup, false);
            singleViewHolder = new RecyclerView.ViewHolder(viewTd) { // from class: X.0IgD
            };
        } else {
            C20441214yg.LIZIZ("MultiTopLiveSkylightAdapter", "onCreateViewHolder: unknown item type");
            singleViewHolder = new SingleViewHolder(C786410Ut5.Td(layoutInflaterNe, R.layout.hbk, viewGroup, false), this.LL);
        }
        try {
            View view = singleViewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        singleViewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (singleViewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(singleViewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) singleViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(singleViewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = singleViewHolder.getClass().getName();
        return singleViewHolder;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
            return;
        }
        if (ListProtector.get(list, 0) instanceof Integer) {
            int iIntValue = ((Integer) ListProtector.get(list, 0)).intValue();
            if (!this.LLILLL) {
                if (viewHolder instanceof SingleViewHolder) {
                    SingleViewHolder singleViewHolder = (SingleViewHolder) viewHolder;
                    CharSequence charSequenceLIZ = C472650IgB.LIZ(singleViewHolder.LLJJL, iIntValue);
                    if (charSequenceLIZ != null && ((String) charSequenceLIZ).length() != 0) {
                        C786410Ut5.LLLLZLL(singleViewHolder.LLJJL, 0);
                        singleViewHolder.LLJJL.setText(charSequenceLIZ);
                        return;
                    } else {
                        C786410Ut5.LLLLZLL(singleViewHolder.LLJJL, 8);
                        return;
                    }
                }
                if (!(viewHolder instanceof CoLiveViewHolder)) {
                    return;
                }
                CoLiveViewHolder coLiveViewHolder = (CoLiveViewHolder) viewHolder;
                CharSequence charSequenceLIZ2 = C472650IgB.LIZ(coLiveViewHolder.LLJJLIIIJLLLLLLLZ, iIntValue);
                if (charSequenceLIZ2 != null && ((String) charSequenceLIZ2).length() != 0) {
                    C786410Ut5.LLLLZLL(coLiveViewHolder.LLJJLIIIJLLLLLLLZ, 0);
                    coLiveViewHolder.LLJJLIIIJLLLLLLLZ.setText(charSequenceLIZ2);
                } else {
                    C786410Ut5.LLLLZLL(coLiveViewHolder.LLJJLIIIJLLLLLLLZ, 8);
                }
            }
        }
    }
}
