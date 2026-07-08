package com.bytedance.android.livesdk.feed.drawerfeed.viewholder;

import X.AbstractC468490IYt;
import X.C086I;
import X.C09CT;
import X.C0IKQ;
import X.C0IVV;
import X.C0IVW;
import X.C0IY7;
import X.C0IYA;
import X.C0KVU;
import X.C1124870fNV;
import X.C1133830fbx;
import X.C11RK;
import X.C12ES;
import X.C1324570kZb;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C16F5;
import X.C1819620xS4;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2188811AlT;
import X.C341701Uh;
import X.C467800IWc;
import X.C470340IcS;
import X.C497740JfY;
import X.C522060Kdg;
import X.C786410Ut5;
import X.C842240X2g;
import X.InterfaceC468260IXw;
import Y.ACListenerS142S0100000_7;
import Y.AfS132S0000000_7;
import Y.AfS176S0100000_7;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerNewCardUiSetting;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.ContentSpotlightRankInfo;
import com.bytedance.android.livesdkapi.depend.model.live.FeedRoomLabel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawerSmallLiveViewHolder extends AbstractC468490IYt<FeedItem> {
    public static int LLJLLL = -1;
    public final String LLILLL;
    public final C11RK<FeedItem> LLILZ;
    public final C11RK<Boolean> LLILZIL;
    public final ViewGroup LLILZLL;
    public final String LLIZ;
    public TextView LLIZLLLIL;
    public TextView LLJ;
    public C1324720kZq LLJI;
    public C1324720kZq LLJIJIL;
    public TextView LLJILJIL;
    public C1324720kZq LLJILJILJ;
    public LiveIconView LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public C16F5 LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public C1324720kZq LLJJJ;
    public C1324720kZq LLJJJIL;
    public C16F5 LLJJJJ;
    public C0IY7 LLJJJJJIL;
    public Room LLJJJJLIIL;
    public FeedItem LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public LogExtraData LLJL;
    public LogExtraData LLJLIL;
    public int LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;

    public static class LogExtraData {

        @C09CT("game_name")
        public String gameName;

        @C09CT("label_language")
        public String labelLanguage;

        @C09CT("label_rank")
        public int labelRank;

        @C09CT("label_type")
        public String labelType;

        @C09CT("show_type")
        public int showType;
    }

    @Override // X.AbstractC468490IYt
    public final void onViewAttachedToWindow() {
        this.LL = true;
        if (this.LLJLL) {
            int i = this.LLJLILLLLZIIL;
            if (i == 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onViewAttachedToWindow room");
                sbLIZ.append(this.LLJJJJLIIL.getId());
                C20441214yg.LIZIZ("onViewAttachedToWindow", C2188811AlT.LIZIZ(sbLIZ));
                S5(this.LLJJJJLIIL);
            } else if (i == 0) {
                C467800IWc c467800IWc = C467800IWc.LJIJ;
                String str = c467800IWc.LJIIIIZZ;
                if (str == null) {
                    str = "";
                }
                boolean zIsEmpty = c467800IWc.LIZIZ().isEmpty();
                if (TextUtils.equals(str, this.LLIZ)) {
                    S5(this.LLJJJJLIIL);
                } else if (!this.LLJLLIL && !zIsEmpty) {
                    S5(this.LLJJJJLIIL);
                    this.LLJLLIL = true;
                }
            }
            C467800IWc c467800IWc2 = C467800IWc.LJIJ;
            ((HashSet) c467800IWc2.LJIIZILJ.getValue()).remove(this.LLJJL);
        }
    }

    public static String P5(LogExtraData logExtraData) {
        if (logExtraData == null) {
            return "";
        }
        if (logExtraData.labelRank == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(logExtraData.labelType);
            sbLIZ.append("");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(logExtraData.labelType);
        sbLIZ2.append("_");
        sbLIZ2.append(logExtraData.labelRank);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void S5(Room room) {
        C0IVW c0ivw = new C0IVW(this.itemView.getContext(), this.LLJJL);
        c0ivw.LJ = room;
        c0ivw.LJI = getAdapterPosition();
        c0ivw.LJII = this.LLJJLIIIJLLLLLLLZ;
        c0ivw.LJIIJ = this.LLJL;
        c0ivw.LJIIJJI = this.LLJLIL;
        c0ivw.LJIIZILJ = "live_cell";
        c0ivw.LJIIIIZZ = this.LLIZ;
        C0IVV.LIZJ(c0ivw);
    }

    @Override // X.AbstractC468490IYt
    public final void I5(int i, Object obj) {
        String strLIZ;
        ContentSpotlightRankInfo contentSpotlightRankInfo;
        FeedItem feedItem = (FeedItem) obj;
        if (feedItem != null) {
            InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
            if (interfaceC468260IXw instanceof Room) {
                this.LLJJLIIIJLLLLLLLZ = i;
                this.LLJJL = feedItem;
                this.LLJJJJLIIL = (Room) interfaceC468260IXw;
                this.itemView.setOnLongClickListener(null);
                if (!TextUtils.isEmpty(this.LLJJJJLIIL.getTitle())) {
                    strLIZ = C341701Uh.LIZ("%s", this.LLJJJJLIIL.getTitle());
                } else if (this.LLJJJJLIIL.getOwner() != null && !TextUtils.isEmpty(C0KVU.LIZ(this.LLJJJJLIIL.getOwner()))) {
                    strLIZ = C0KVU.LIZ(this.LLJJJJLIIL.getOwner());
                } else {
                    strLIZ = null;
                }
                if (LiveDrawerNewCardUiSetting.INSTANCE.getValue()) {
                    this.LLJ.setText(strLIZ);
                    C786410Ut5.LLIL(this.LLJ, 0);
                    this.LLIZLLLIL.setText(C0KVU.LIZ(this.LLJJJJLIIL.getOwner()));
                    C1324720kZq c1324720kZq = this.LLJI;
                    Room room = this.LLJJJJLIIL;
                    if (room != null && room.getOwner() != null && this.LLJJJJLIIL.getOwner().getAvatarThumb() != null) {
                        C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(this.LLJJJJLIIL.getOwner().getAvatarThumb().getUrls());
                        int iLIZIZ = (int) C497740JfY.LIZIZ(13.0f);
                        int iLIZIZ2 = (int) C497740JfY.LIZIZ(13.0f);
                        c1324610kZfLIZJ.LJI = iLIZIZ;
                        c1324610kZfLIZJ.LJII = iLIZIZ2;
                        Boolean bool = Boolean.TRUE;
                        c1324610kZfLIZJ.LJJ = bool;
                        c1324610kZfLIZJ.LJIILIIL = bool;
                        c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                        c1324610kZfLIZJ.LJJI(c1324720kZq);
                    }
                    C786410Ut5.LLJJIII(this.LLJI, 0);
                } else {
                    this.LLJ.setText((CharSequence) null);
                    C786410Ut5.LLIL(this.LLJ, 8);
                    this.LLIZLLLIL.setText(strLIZ);
                    C786410Ut5.LLJJIII(this.LLJI, 8);
                }
                if (C497740JfY.LJJ()) {
                    this.LLIZLLLIL.setGravity(5);
                    this.LLJ.setGravity(5);
                } else {
                    this.LLIZLLLIL.setGravity(3);
                    this.LLJ.setGravity(3);
                }
                ImageModel cover = this.LLJJJJLIIL.getCover();
                if (this.LLJJJJLIIL.getSquareCoverImg() != null && !C0IKQ.LIZ(this.LLJJJJLIIL.getSquareCoverImg().getUrls())) {
                    cover = this.LLJJJJLIIL.getSquareCoverImg();
                } else {
                    ImageModel imageModel = this.LLJJJJLIIL.streamSnapshotCover;
                    if (imageModel != null && !C0IKQ.LIZ(imageModel.getUrls())) {
                        cover = this.LLJJJJLIIL.streamSnapshotCover;
                    }
                }
                if (cover != null && !C0IKQ.LIZ(cover.getUrls())) {
                    final Room room2 = this.LLJJJJLIIL;
                    T5(cover.getWidth(), cover.getHeight());
                    final long[] jArr = new long[1];
                    this.LLJJJJJIL = new C0IY7();
                    C1324610kZf c1324610kZfLJIIIIZZ = C1819620xS4.LIZ().LJIIIIZZ("drawer_cover", C842240X2g.LIZ(cover));
                    c1324610kZfLJIIIIZZ.LJI = -1;
                    c1324610kZfLJIIIIZZ.LJII = -1;
                    c1324610kZfLJIIIIZZ.LJIJI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                    c1324610kZfLJIIIIZZ.LJIIL = new C0IYA() { // from class: X.0IY4
                        @Override // X.C0IYA, X.InterfaceC1142670fqD
                        public final void LIZ() {
                            jArr[0] = SystemClock.currentThreadTimeMillis();
                            HashMap map = new HashMap();
                            map.put("enter_from_merge", "live_merge");
                            map.put("enter_method", "live_cover");
                            map.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                            map.put("request_id", room2.getRequestId());
                            map.put("room_id", String.valueOf(room2.getId()));
                            map.put("event_belong", "live_view");
                            map.put("event_page", "live");
                            map.put("event_type", "core");
                            map.put("event_module", "live_live");
                            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("live_cover_show_start", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                            c474500IjALIZIZ.LJJIIZI(map);
                            c474500IjALIZIZ.LIZ();
                            C0IY7 c0iy7 = this.LIZJ.LLJJJJJIL;
                            c0iy7.getClass();
                            c0iy7.LIZIZ = SystemClock.uptimeMillis();
                        }

                        @Override // X.C0IYA, X.InterfaceC1142670fqD
                        public final void LIZLLL(String str, Exception exc) {
                            HashMap map = new HashMap();
                            map.put("enter_from_merge", "live_merge");
                            map.put("enter_method", "live_cover");
                            map.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                            map.put("request_id", room2.getRequestId());
                            map.put("room_id", String.valueOf(room2.getId()));
                            map.put("is_success", CardStruct.IStatusCode.DEFAULT);
                            map.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - jArr[0]));
                            map.put("event_belong", "live_view");
                            map.put("event_page", "live");
                            map.put("event_type", "core");
                            map.put("event_module", "live_live");
                            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("live_cover_show_finish", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                            c474500IjALIZIZ.LJJIIZI(map);
                            c474500IjALIZIZ.LIZ();
                            this.LIZJ.LLJJJJJIL.LJIIJ(str, exc);
                        }

                        @Override // X.C0IYA, X.InterfaceC1142670fqD
                        public final void LIZJ(int i2, int i3, String str) {
                            HashMap map = new HashMap();
                            map.put("enter_from_merge", "live_merge");
                            map.put("enter_method", "live_cover");
                            map.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                            map.put("request_id", room2.getRequestId());
                            map.put("room_id", String.valueOf(room2.getId()));
                            map.put("is_success", "1");
                            map.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - jArr[0]));
                            map.put("event_belong", "live_view");
                            map.put("event_page", "live");
                            map.put("event_type", "core");
                            map.put("event_module", "live_live");
                            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("live_cover_show_finish", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                            c474500IjALIZIZ.LJJIIZI(map);
                            c474500IjALIZIZ.LIZ();
                            this.LIZJ.LLJJJJJIL.LJIIJJI(str);
                            String str2 = this.LIZJ.LLIZ;
                            if (C467820IWe.LIZLLL <= 0 && !C467820IWe.LJ) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                C467820IWe.LIZLLL = jCurrentTimeMillis;
                                long j = C467820IWe.LIZJ;
                                if (1 <= j && j < jCurrentTimeMillis) {
                                    C467820IWe.LIZJ().put("draw_duration", String.valueOf(C467820IWe.LIZLLL - C467820IWe.LIZJ));
                                }
                                C467820IWe.LIZJ().put("draw_over_timestamp", String.valueOf(C467820IWe.LIZLLL));
                                if (!TextUtils.isEmpty(str2)) {
                                    C467820IWe.LIZJ().put("drawer_tab", str2);
                                }
                            }
                            C467820IWe.LJFF(false);
                        }
                    };
                    c1324610kZfLJIIIIZZ.LJJI(this.LLJIJIL);
                } else {
                    this.LLJIJIL.setImageResource(R.drawable.ehd);
                    View view = this.LLJJ;
                    if (view != null && this.LLJJI != null) {
                        C786410Ut5.LJLLLLLL(8, view);
                        C786410Ut5.LJLLLLLL(8, this.LLJJI);
                    }
                    if (cover == null) {
                        T5(0, 0);
                    } else {
                        T5(cover.width, cover.height);
                    }
                }
                C786410Ut5.LLJJJJ(this.LLJJIJI, 8);
                C786410Ut5.LJLLLLLL(8, this.LLJJIII);
                C786410Ut5.LJLLLLLL(8, this.LLJJIJIIJIL);
                C786410Ut5.LJLLLLLL(8, this.LLJJIJIL);
                Room room3 = this.LLJJJJLIIL;
                this.LLJL = null;
                this.LLJLIL = null;
                if (!C086I.LIZIZ(room3.getFeedRoomLabelList())) {
                    for (FeedRoomLabel feedRoomLabel : room3.getFeedRoomLabelList()) {
                        if (feedRoomLabel != null) {
                            long j = feedRoomLabel.location;
                            if (j == 0) {
                                try {
                                    this.LLJL = (LogExtraData) C19748512Ol.LIZJ.LJII(feedRoomLabel.logExtra, LogExtraData.class);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            } else if (j == 3) {
                                try {
                                    this.LLJLIL = (LogExtraData) C19748512Ol.LIZJ.LJII(feedRoomLabel.logExtra, LogExtraData.class);
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            }
                        }
                    }
                }
                List<FeedRoomLabel> feedRoomLabelList = this.LLJJJJLIIL.getFeedRoomLabelList();
                if (!C086I.LIZIZ(feedRoomLabelList)) {
                    for (FeedRoomLabel feedRoomLabel2 : feedRoomLabelList) {
                        if (feedRoomLabel2 != null) {
                            long j2 = feedRoomLabel2.location;
                            if (j2 == 3) {
                                LogExtraData logExtraData = this.LLJLIL;
                                if (logExtraData != null && "game_name".equals(logExtraData.labelType)) {
                                    U5(this.LLJJIJI, feedRoomLabel2.text);
                                    C786410Ut5.LLJJJJ(this.LLJJIJI, 0);
                                }
                            } else if (j2 == 0) {
                                C786410Ut5.LJLLLLLL(0, this.LLJJIJIL);
                                ImageModel imageModel2 = feedRoomLabel2.bgImage;
                                if (imageModel2 != null) {
                                    R5(imageModel2, this.LLJJJIL);
                                } else {
                                    C786410Ut5.LJLLLLLL(0, this.LLJJIJIIJIL);
                                    if (!TextUtils.isEmpty(feedRoomLabel2.backgroundColor)) {
                                        GradientDrawable gradientDrawable = (GradientDrawable) this.LLJJIJIIJIL.getBackground();
                                        gradientDrawable.mutate();
                                        gradientDrawable.setColor(ColorProtector.parseColor(feedRoomLabel2.backgroundColor));
                                    }
                                    LogExtraData logExtraData2 = this.LLJL;
                                    if (logExtraData2 != null && ("drops_game".equals(logExtraData2.labelType) || "new_game".equals(this.LLJL.labelType))) {
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LLJJJJ.getLayoutParams());
                                        layoutParams.leftMargin = 0;
                                        layoutParams.setMarginStart(0);
                                        C786410Ut5.y6(this.LLJJJJ, layoutParams);
                                        this.LLJJJJ.setTextSize(12.0f);
                                    }
                                    U5(this.LLJJJJ, feedRoomLabel2.text);
                                    R5(feedRoomLabel2.icon, this.LLJJJ);
                                }
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.LLJJL.drawerGameTag)) {
                    this.LLJJIJI.setText(this.LLJJL.drawerGameTag);
                    C786410Ut5.LLJJJJ(this.LLJJIJI, 0);
                }
                if ("music_spotlight".equals(this.LLIZ) && (contentSpotlightRankInfo = this.LLJJJJLIIL.contentSpotlightRankInfo) != null) {
                    this.LLJILJIL.setText(C470340IcS.LIZ(contentSpotlightRankInfo.score));
                    C786410Ut5.LLJJIJIL(this.LLJILLL, 8);
                    C786410Ut5.LLJJIII(this.LLJILJILJ, 0);
                    if (this.LLJJJJLIIL.contentSpotlightRankInfo.scoreIcon != null) {
                        C1819620xS4.LIZ().LIZJ(this.LLJJJJLIIL.contentSpotlightRankInfo.scoreIcon.getUrls()).LJJI(this.LLJILJILJ);
                    }
                } else {
                    if (this.LLJJJJLIIL.getStatus() == 4) {
                        this.LLJILJIL.setText(C470340IcS.LIZ(0L));
                    } else {
                        this.LLJILJIL.setText(C470340IcS.LIZ(this.LLJJJJLIIL.getUserCount()));
                    }
                    C786410Ut5.LLJJIJIL(this.LLJILLL, 0);
                    C786410Ut5.LLJJIII(this.LLJILJILJ, 8);
                }
                C786410Ut5.I7(new ACListenerS142S0100000_7(this, 173), this.itemView);
                this.LLJJJJLIIL.setLog_pb(this.LLJJL.logPb);
                this.LLJJJJLIIL.setRequestId(this.LLJJL.resId);
                C11RK<Boolean> c11rk = this.LLILZIL;
                if (c11rk != null) {
                    N5(c11rk.LJJLL(new AfS176S0100000_7(this, 142), new AfS132S0000000_7(23)));
                }
                C786410Ut5.LJLLLLLL(8, this.LLJJ);
                this.LLJJ.setBackgroundResource(0);
                if (LiveDrawerNewCardUiSetting.INSTANCE.getValue()) {
                    C786410Ut5.LJLLLLLL(0, this.LLJJI);
                    this.LLJJI.setBackgroundResource(R.drawable.dxo);
                    C12ES.LJIIZILJ(-3, (int) C497740JfY.LIZIZ(90.0f), this.LLJJI);
                    return;
                } else {
                    C786410Ut5.LJLLLLLL(8, this.LLJJI);
                    this.LLJJI.setBackgroundResource(0);
                    return;
                }
            }
        }
        this.itemView.setOnLongClickListener(null);
        this.LLJJJJLIIL = null;
    }

    public final void R5(ImageModel imageModel, C1324720kZq c1324720kZq) {
        if (imageModel != null && !C0IKQ.LIZ(imageModel.getUrls())) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
            C1324570kZb.LIZJ(c1324720kZq, imageModel, null, null, new C522060Kdg(c1324720kZq, 1), imageModel.isAnimated());
            return;
        }
        C786410Ut5.LLJJIII(c1324720kZq, 8);
    }

    public final void T5(int i, int i2) {
        int measuredWidth = (this.LLILZLL.getMeasuredWidth() - 3) / 2;
        LLJLLL = measuredWidth;
        if (i > 0 && i2 > 0) {
            measuredWidth = (measuredWidth * i2) / i;
        }
        ViewGroup.LayoutParams layoutParams = this.LLJIJIL.getLayoutParams();
        C467800IWc c467800IWc = C467800IWc.LJIJ;
        if (C467800IWc.LJIJ.LJI()) {
            int i3 = layoutParams.width;
            int i4 = LLJLLL;
            if (i3 == i4 && layoutParams.height == ((int) (i4 * 0.625f))) {
                return;
            }
            layoutParams.width = i4;
            layoutParams.height = (int) (i4 * 0.625f);
        } else {
            int i5 = layoutParams.width;
            int i6 = LLJLLL;
            if (i5 == i6 && layoutParams.height == measuredWidth) {
                return;
            }
            layoutParams.width = i6;
            layoutParams.height = measuredWidth;
        }
        C786410Ut5.u6(this.LLJIJIL, layoutParams);
    }

    public final void U5(C16F5 c16f5, Text text) {
        String strLIZIZ;
        if (c16f5 != null && text != null) {
            String str = text.defaultPattern;
            if (!TextUtils.isEmpty(text.key)) {
                C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                String str2 = text.key;
                c1124870fNVLIZJ.getClass();
                strLIZIZ = C1124870fNV.LIZIZ(str2);
            } else {
                strLIZIZ = null;
            }
            if (!TextUtils.isEmpty(strLIZIZ)) {
                str = strLIZIZ;
            }
            c16f5.setText(C1133830fbx.LJIILJJIL(str, text, null));
        }
    }

    public DrawerSmallLiveViewHolder(View view, String str, C11RK<FeedItem> c11rk, C11RK<Boolean> c11rk2, ViewGroup viewGroup, String str2) {
        super(view);
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLJLL = true;
        this.LLILLL = str;
        this.LLILZ = c11rk;
        this.LLILZIL = c11rk2;
        this.LLIZ = str2;
        this.LLILZLL = viewGroup;
        this.LLIZLLLIL = (TextView) this.itemView.findViewById(R.id.title);
        this.LLJ = (TextView) this.itemView.findViewById(R.id.tv_title_upper);
        this.LLJI = (C1324720kZq) this.itemView.findViewById(R.id.mtx);
        this.LLJIJIL = (C1324720kZq) this.itemView.findViewById(R.id.mvv);
        this.LLJILLL = (LiveIconView) this.itemView.findViewById(R.id.b_y);
        this.LLJILJILJ = (C1324720kZq) this.itemView.findViewById(R.id.b_z);
        this.LLJILJIL = (TextView) this.itemView.findViewById(R.id.b_x);
        this.LLJJ = this.itemView.findViewById(R.id.o1m);
        this.LLJJI = this.itemView.findViewById(R.id.o12);
        this.LLJJIII = this.itemView.findViewById(R.id.mjh);
        this.itemView.findViewById(R.id.mjj);
        this.itemView.findViewById(R.id.mji);
        this.LLJJIJIL = this.itemView.findViewById(R.id.mlg);
        this.LLJJIJIIJIL = this.itemView.findViewById(R.id.mle);
        this.LLJJJ = (C1324720kZq) this.itemView.findViewById(R.id.mlh);
        this.LLJJJIL = (C1324720kZq) this.itemView.findViewById(R.id.mlf);
        this.LLJJJJ = (C16F5) this.itemView.findViewById(R.id.mli);
        this.LLJJIJI = (C16F5) this.itemView.findViewById(R.id.pvi);
    }
}
