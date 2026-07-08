package com.ss.android.ugc.aweme.inbox.bulletin.data.item;

import X.AnonymousClass0501;
import X.C09CT;
import X.C0C64;
import X.C0OK6;
import X.C0OQ8;
import X.C0OQC;
import X.C13LP;
import X.C1697810uHb;
import X.C619660OSe;
import X.EnumC618810OOx;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemBottomStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BulletinBaseItem implements InterfaceC1891350zJl {
    public static final int LLILZIL = C0C64.LJIILLIIL().LJIJ(31744, 3, "bulletin_emoji_interaction_num_setting", true);
    public transient String LL;
    public int LLILLJJLI = -1;
    public boolean LLILLL;
    public boolean LLILZ;

    @C09CT("bottom_struct")
    public final BulletinItemBottomStruct bottomStruct;

    @C09CT("bulletin_content_type")
    public final EnumC618810OOx bulletinContentType;

    @C09CT("bulletin_style_struct")
    public final BulletinStyleStruct bulletinStyleStruct;

    @C09CT("comments")
    public BulletinCommentUIOverview commentUIOverView;

    @C09CT("bulletin_creator_time")
    public final long creatorTime;

    @C09CT("bulletin_emoji_list")
    public List<BulletinEmojiItem> emojiList;

    @C09CT("bulletin_emoji_list_order")
    public int emojiOrderNum;

    @C09CT("bulletin_emoji_show_count")
    public int emojiShowCnt;

    @C09CT("bulletin_emoji_snapshot")
    public List<InterfaceC1891350zJl> emojiSnapshot;

    @C09CT("bulletin_event_map")
    public final Map<String, String> eventMap;

    @C09CT("bulletin_group_max_view_count")
    public final int groupMaxViewCount;

    @C09CT("bulletin_has_read")
    public final boolean hasRead;

    @C09CT("bulletin_has_send")
    public final boolean hasSend;

    @C09CT("bulletin_item_id")
    public final Long id;

    @C09CT("bulletin_is_first_in_sequence")
    public final boolean isFirstInSequence;

    @C09CT("bulletin_is_last_in_sequence")
    public final boolean isLastInSequence;

    @C09CT("bulletin_item_type")
    public final C0OK6 itemType;

    @C09CT("need_emoji")
    public final boolean needEmoji;

    @C09CT("bulletin_need_show_view_count")
    public final boolean needShowViewCount;

    @C09CT("bulletin_padding_bottom")
    public final int paddingBottom;

    @C09CT("publish_from_bulletin_id")
    public final String publishFrom;

    @C09CT("bulletin_publish_user")
    public final User publishUser;

    @C09CT("bulletin_status")
    public final int status;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("style_id")
    public final String styleId;

    @C09CT("update_time")
    public final Long updateTime;

    @C09CT("bulletin_view_count")
    public int viewCount;

    public Long LJI() {
        return null;
    }

    public String LJIIIIZZ() {
        return null;
    }

    public boolean LJJLJ(BulletinBaseItem bulletinBaseItem) {
        return false;
    }

    public boolean LJLL(BulletinBaseItem bulletinBaseItem) {
        return false;
    }

    public final boolean LIZ() {
        Long lLJJJ;
        return this.needEmoji && (lLJJJ = LJJJ()) != null && lLJJJ.longValue() > 0;
    }

    public boolean LJLZ() {
        if (this.itemType == C0OK6.CONTENT && LJJIL() && !this.LLILLL) {
            return LJJJLIIL() == 3 || LJJJLIIL() == 2;
        }
        return false;
    }

    static {
        C0C64.LJIILLIIL().LJIJ(31744, 9, "bulletin_emoji_interaction_latest_num_setting", true);
    }

    public BulletinItemBottomStruct LIZIZ() {
        return this.bottomStruct;
    }

    public EnumC618810OOx LIZLLL() {
        return this.bulletinContentType;
    }

    public BulletinStyleStruct LJ() {
        return this.bulletinStyleStruct;
    }

    public BulletinCommentUIOverview LJIILIIL() {
        return this.commentUIOverView;
    }

    public long LJIIZILJ() {
        return this.creatorTime;
    }

    public List<BulletinEmojiItem> LJIJJLI() {
        return this.emojiList;
    }

    public int LJIL() {
        return this.emojiOrderNum;
    }

    public List<InterfaceC1891350zJl> LJJ() {
        return this.emojiSnapshot;
    }

    public Map<String, String> LJJIFFI() {
        return this.eventMap;
    }

    public int LJJIJL() {
        return this.groupMaxViewCount;
    }

    public boolean LJJIJLIJ() {
        return this.hasRead;
    }

    public boolean LJJIL() {
        return this.hasSend;
    }

    public Long LJJJ() {
        return this.id;
    }

    public String LJJJIL() {
        return this.LL;
    }

    public boolean LJJJJ() {
        return this.needShowViewCount;
    }

    public int LJJJJI() {
        return this.paddingBottom;
    }

    public String LJJJJLI() {
        return this.publishFrom;
    }

    public User LJJJJZI() {
        return this.publishUser;
    }

    public int LJJJLIIL() {
        return this.status;
    }

    public int LJJJLZIJ() {
        return this.statusCode;
    }

    public String LJJL() {
        return this.styleId;
    }

    public Long LJJLIIIIJ() {
        return this.updateTime;
    }

    public int LJJLIIIJ() {
        return this.viewCount;
    }

    public boolean LJJZZIII() {
        return this.isFirstInSequence;
    }

    public boolean LJLIIIL() {
        return this.isLastInSequence;
    }

    public boolean LJJLIIIJJI(BulletinBaseItem bulletinBaseItem) {
        if (LJJZZIII() == bulletinBaseItem.LJJZZIII() && LJLIIIL() == bulletinBaseItem.LJLIIIL()) {
            return false;
        }
        return true;
    }

    public final boolean LJJLIIIJL(BulletinBaseItem bulletinBaseItem) {
        String str;
        if (LJJIJL() == bulletinBaseItem.LJJIJL() && LJJJJ() == bulletinBaseItem.LJJJJ()) {
            BulletinItemBottomStruct bulletinItemBottomStructLIZIZ = LIZIZ();
            String str2 = null;
            if (bulletinItemBottomStructLIZIZ != null) {
                str = bulletinItemBottomStructLIZIZ.bottomTip;
            } else {
                str = null;
            }
            BulletinItemBottomStruct bulletinItemBottomStructLIZIZ2 = bulletinBaseItem.LIZIZ();
            if (bulletinItemBottomStructLIZIZ2 != null) {
                str2 = bulletinItemBottomStructLIZIZ2.bottomTip;
            }
            if (Intrinsics.LJFF(str, str2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean LJJZ(BulletinBaseItem bulletinBaseItem) {
        if (LJJIL() != bulletinBaseItem.LJJIL() || bulletinBaseItem.LJJ().size() != LJJ().size()) {
            return true;
        }
        int i = 0;
        for (InterfaceC1891350zJl interfaceC1891350zJl : LJJ()) {
            int i2 = i + 1;
            if (i >= 0) {
                if (interfaceC1891350zJl instanceof BulletinEmojiItem) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, bulletinBaseItem.LJJ());
                    if (!(objLJJJLZIJ instanceof BulletinEmojiItem) || !Intrinsics.LJFF(interfaceC1891350zJl, objLJJJLZIJ)) {
                        return true;
                    }
                } else if (interfaceC1891350zJl instanceof AnonymousClass0501) {
                    Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i, bulletinBaseItem.LJJ());
                    if (!(objLJJJLZIJ2 instanceof AnonymousClass0501) || !Intrinsics.LJFF(interfaceC1891350zJl, objLJJJLZIJ2)) {
                        return true;
                    }
                } else if (interfaceC1891350zJl instanceof C0OQ8) {
                    Object objLJJJLZIJ3 = C13LP.LJJJLZIJ(i, bulletinBaseItem.LJJ());
                    if (!(objLJJJLZIJ3 instanceof C0OQ8) || !Intrinsics.LJFF(interfaceC1891350zJl, objLJJJLZIJ3)) {
                        return true;
                    }
                } else {
                    if (interfaceC1891350zJl instanceof C0OQC) {
                        Object objLJJJLZIJ4 = C13LP.LJJJLZIJ(i, bulletinBaseItem.LJJ());
                        if (!(objLJJJLZIJ4 instanceof C0OQC) || !Intrinsics.LJFF(interfaceC1891350zJl, objLJJJLZIJ4)) {
                            return true;
                        }
                    }
                    return true;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return false;
    }

    public final boolean LJLLLL(BulletinBaseItem bulletinBaseItem) {
        if (Intrinsics.LJFF(LJJJJZI(), bulletinBaseItem.LJJJJZI()) && LJJZZIII() == bulletinBaseItem.LJJZZIII() && LJLIIIL() == bulletinBaseItem.LJLIIIL()) {
            return false;
        }
        return true;
    }

    public void LJZ(BulletinCommentUIOverview bulletinCommentUIOverview) {
        this.commentUIOverView = bulletinCommentUIOverview;
    }

    public void LJZL(List<BulletinEmojiItem> list) {
        this.emojiList = list;
    }

    public void LL(int i) {
        this.emojiOrderNum = i;
    }

    public void LLFFF(List<InterfaceC1891350zJl> list) {
        this.emojiSnapshot = list;
    }

    public void LLFII(String str) {
        this.LL = str;
    }

    public void LLIIIJ(int i) {
        this.viewCount = i;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof BulletinBaseItem)) {
            return false;
        }
        BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(LJJJ(), bulletinBaseItem.LJJJ()) || LIZLLL() != bulletinBaseItem.LIZLLL() || LJJLJ(bulletinBaseItem) || LJJLIIIJL(bulletinBaseItem) || LJJLIIIJJI(bulletinBaseItem) || LJJIL() != bulletinBaseItem.LJJIL() || LJJJJI() != bulletinBaseItem.LJJJJI() || LJLLLL(bulletinBaseItem) || LJJZ(bulletinBaseItem) || LJLL(bulletinBaseItem) || (!Intrinsics.LJFF(LJIILIIL(), bulletinBaseItem.LJIILIIL()))) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof BulletinBaseItem) {
            BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) interfaceC1891350zJl;
            if (Intrinsics.LJFF(LJJJ(), bulletinBaseItem.LJJJ()) && LIZLLL() == bulletinBaseItem.LIZLLL() && this.itemType == bulletinBaseItem.itemType) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean z2;
        boolean z3;
        if (interfaceC1891350zJl instanceof BulletinBaseItem) {
            BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) interfaceC1891350zJl;
            boolean zLJJLJ = LJJLJ(bulletinBaseItem);
            boolean zLJJLIIIJL = LJJLIIIJL(bulletinBaseItem);
            boolean zLJJLIIIJJI = LJJLIIIJJI(bulletinBaseItem);
            if (LJJIL() != bulletinBaseItem.LJJIL()) {
                z = true;
            } else {
                z = false;
            }
            if (LJJJJI() != bulletinBaseItem.LJJJJI()) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJLLLL = LJLLLL(bulletinBaseItem);
            boolean zLJJZ = LJJZ(bulletinBaseItem);
            boolean zLJLL = LJLL(bulletinBaseItem);
            if (Intrinsics.LJFF(LJJL(), bulletinBaseItem.LJJL()) && Intrinsics.LJFF(LJ(), bulletinBaseItem.LJ())) {
                z3 = false;
            } else {
                z3 = true;
            }
            return new C619660OSe(zLJJLJ, zLJJLIIIJL, zLJJLIIIJJI, z, z2, zLJLLLL, zLJJZ, zLJLL, z3, !Intrinsics.LJFF(LJIILIIL(), bulletinBaseItem.LJIILIIL()));
        }
        return null;
    }

    public BulletinBaseItem(EnumC618810OOx enumC618810OOx, C0OK6 c0ok6, int i, boolean z, long j, Long l, Long l2, String str, BulletinStyleStruct bulletinStyleStruct, int i2, Map<String, String> map, boolean z2, boolean z3, boolean z4, int i3, int i4, User user, boolean z5, List<BulletinEmojiItem> list, int i5, int i6, List<InterfaceC1891350zJl> list2, boolean z6, String str2, int i7, BulletinItemBottomStruct bulletinItemBottomStruct, String str3, BulletinCommentUIOverview bulletinCommentUIOverview) {
        this.bulletinContentType = enumC618810OOx;
        this.itemType = c0ok6;
        this.viewCount = i;
        this.hasSend = z;
        this.creatorTime = j;
        this.updateTime = l;
        this.id = l2;
        this.styleId = str;
        this.bulletinStyleStruct = bulletinStyleStruct;
        this.status = i2;
        this.eventMap = map;
        this.isFirstInSequence = z2;
        this.isLastInSequence = z3;
        this.needShowViewCount = z4;
        this.groupMaxViewCount = i3;
        this.paddingBottom = i4;
        this.publishUser = user;
        this.hasRead = z5;
        this.emojiList = list;
        this.emojiShowCnt = i5;
        this.emojiOrderNum = i6;
        this.emojiSnapshot = list2;
        this.needEmoji = z6;
        this.publishFrom = str2;
        this.statusCode = i7;
        this.bottomStruct = bulletinItemBottomStruct;
        this.LL = str3;
        this.commentUIOverView = bulletinCommentUIOverview;
    }
}
