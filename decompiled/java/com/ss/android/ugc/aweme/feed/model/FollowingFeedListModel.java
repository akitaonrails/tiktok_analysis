package com.ss.android.ugc.aweme.feed.model;

import X.AbstractC1255880imo;
import X.C09JN;
import X.C0CQT;
import X.C0QST;
import X.C0QSU;
import X.C0QSV;
import X.C11S5;
import X.C1440005kM;
import X.C1701940uOG;
import X.C1C7U;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestFeedResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: loaded from: classes11.dex */
public final class FollowingFeedListModel extends AbstractC1255880imo<Aweme, FollowingInterestFeedResponse> {
    public final List<String> blueDotList;
    public int footerNextCursor;
    public boolean hasMoreFooter;
    public boolean hasMoreHeader;
    public int headerNextCursor;
    public final List<String> uidList;
    public String headerUid = "";
    public String footerUid = "";

    @Override // X.AbstractC666100QAu
    public boolean checkParams(Object... objArr) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public List<Aweme> getItems() {
        FollowingInterestFeedResponse followingInterestFeedResponse = (FollowingInterestFeedResponse) this.mData;
        if (followingInterestFeedResponse != null) {
            return followingInterestFeedResponse.getAwemeList();
        }
        return null;
    }

    public final boolean isHasLatest() {
        return this.hasMoreHeader;
    }

    @Override // X.AbstractC1255880imo
    public boolean isHasMore() {
        return this.hasMoreFooter;
    }

    @Override // X.AbstractC1255880imo
    public void loadLatestList(Object... objArr) {
        if (!this.hasMoreHeader) {
            Message messageObtainMessage = this.mHandler.obtainMessage(0);
            messageObtainMessage.obj = new Exception() { // from class: X.0QBq
            };
            this.mHandler.sendMessage(messageObtainMessage);
            return;
        }
        loadList(this.headerNextCursor, this.headerUid, 3);
    }

    @Override // X.AbstractC1255880imo
    public void loadMoreList(Object... objArr) {
        if (!this.hasMoreFooter) {
            return;
        }
        loadList(this.footerNextCursor, this.footerUid, 2);
    }

    @Override // X.AbstractC1255880imo
    public void refreshList(Object... objArr) {
        String str;
        Object obj = objArr[1];
        if ((obj instanceof String) && (str = (String) obj) != null) {
            loadList(0, str, 1);
        }
    }

    public FollowingFeedListModel(List<String> list, List<String> list2) {
        this.uidList = list;
        this.blueDotList = list2;
    }

    private final void loadList(final int i, final String str, final int i2) {
        int i3;
        boolean z;
        if (i2 == 3) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        Iterator<String> it2 = this.uidList.iterator();
        int i4 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (u.LJIJI(it2.next(), str, true)) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 < this.blueDotList.size() && u.LJIJI((String) ListProtector.get(this.blueDotList, i4), "true", true)) {
            z = true;
        } else {
            z = false;
        }
        C0QST.LIZ.getClass();
        final boolean z2 = z;
        ((C0QST) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C0CQT.LIZJ).create(C0QST.class)).LIZ(i, 8, str, i3, 2, z).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel.loadList.1
            public final void accept(FollowingInterestFeedResponse followingInterestFeedResponse) {
                boolean z3 = true;
                if (followingInterestFeedResponse.getCode() != 0) {
                    Message messageObtainMessage = FollowingFeedListModel.this.mHandler.obtainMessage(0);
                    messageObtainMessage.obj = new RuntimeException(followingInterestFeedResponse.getMsg());
                    FollowingFeedListModel.this.mHandler.sendMessage(messageObtainMessage);
                    FollowingFeedListModel.this.mIsNewDataEmpty = true;
                    return;
                }
                int i5 = i2;
                int i6 = -1;
                if (i5 == 1) {
                    List<String> list = FollowingFeedListModel.this.uidList;
                    String str2 = str;
                    Iterator<String> it3 = list.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (u.LJIJI(it3.next(), str2, true)) {
                            i6 = i7;
                            break;
                        }
                        i7++;
                    }
                    FollowingFeedListModel followingFeedListModel = FollowingFeedListModel.this;
                    followingFeedListModel.hasMoreHeader = true;
                    if (i6 == 0) {
                        followingFeedListModel.hasMoreHeader = false;
                    } else {
                        followingFeedListModel.headerUid = (String) ListProtector.get(followingFeedListModel.uidList, i6 - 1);
                        FollowingFeedListModel.this.headerNextCursor = 0;
                    }
                    FollowingFeedListModel.this.hasMoreFooter = true;
                    if (followingInterestFeedResponse.getHasMore()) {
                        FollowingFeedListModel followingFeedListModel2 = FollowingFeedListModel.this;
                        followingFeedListModel2.footerUid = str;
                        followingFeedListModel2.footerNextCursor = followingInterestFeedResponse.getNextCursor();
                    } else if (i6 == FollowingFeedListModel.this.uidList.size() - 1) {
                        FollowingFeedListModel.this.hasMoreFooter = false;
                    } else {
                        FollowingFeedListModel followingFeedListModel3 = FollowingFeedListModel.this;
                        followingFeedListModel3.footerUid = (String) ListProtector.get(followingFeedListModel3.uidList, i6 + 1);
                        FollowingFeedListModel.this.footerNextCursor = 0;
                    }
                    C0QSU.LIZ.put(str, ((Aweme) ListProtector.get(followingInterestFeedResponse.getAwemeList(), 0)).aid);
                    if (!followingInterestFeedResponse.getHasMore()) {
                        C0QSU.LIZIZ.put(str, ((Aweme) ListProtector.get(followingInterestFeedResponse.getAwemeList(), followingInterestFeedResponse.getAwemeList().size() - 1)).aid);
                    }
                    if (z2) {
                        C1440005kM.LIZ(new C0QSV());
                    }
                } else if (i5 == 3) {
                    if (followingInterestFeedResponse.getHasMore()) {
                        FollowingFeedListModel followingFeedListModel4 = FollowingFeedListModel.this;
                        followingFeedListModel4.headerUid = str;
                        followingFeedListModel4.headerNextCursor = followingInterestFeedResponse.getNextCursor();
                    } else {
                        List<String> list2 = FollowingFeedListModel.this.uidList;
                        String str3 = str;
                        Iterator<String> it4 = list2.iterator();
                        int i8 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (u.LJIJI(it4.next(), str3, true)) {
                                i6 = i8;
                                if (i8 == 0) {
                                    FollowingFeedListModel.this.hasMoreHeader = false;
                                }
                            } else {
                                i8++;
                            }
                        }
                        FollowingFeedListModel followingFeedListModel5 = FollowingFeedListModel.this;
                        followingFeedListModel5.headerUid = (String) ListProtector.get(followingFeedListModel5.uidList, i6 - 1);
                        FollowingFeedListModel.this.headerNextCursor = 0;
                    }
                    if (i == 0) {
                        C0QSU.LIZIZ.put(str, ((Aweme) ListProtector.get(followingInterestFeedResponse.getAwemeList(), followingInterestFeedResponse.getAwemeList().size() - 1)).aid);
                    }
                    if (!followingInterestFeedResponse.getHasMore()) {
                        C0QSU.LIZ.put(str, ((Aweme) ListProtector.get(followingInterestFeedResponse.getAwemeList(), 0)).aid);
                    }
                } else {
                    if (followingInterestFeedResponse.getHasMore()) {
                        FollowingFeedListModel followingFeedListModel6 = FollowingFeedListModel.this;
                        followingFeedListModel6.footerUid = str;
                        followingFeedListModel6.footerNextCursor = followingInterestFeedResponse.getNextCursor();
                    } else {
                        List<String> list3 = FollowingFeedListModel.this.uidList;
                        String str4 = str;
                        Iterator<String> it5 = list3.iterator();
                        int i9 = 0;
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            if (u.LJIJI(it5.next(), str4, true)) {
                                i6 = i9;
                                break;
                            }
                            i9++;
                        }
                        if (i6 == FollowingFeedListModel.this.uidList.size() - 1) {
                            FollowingFeedListModel.this.hasMoreFooter = false;
                        } else {
                            FollowingFeedListModel followingFeedListModel7 = FollowingFeedListModel.this;
                            followingFeedListModel7.footerUid = (String) ListProtector.get(followingFeedListModel7.uidList, i6 + 1);
                            FollowingFeedListModel.this.footerNextCursor = 0;
                        }
                    }
                    if (i == 0) {
                        C0QSU.LIZ.put(str, ((Aweme) ListProtector.get(followingInterestFeedResponse.getAwemeList(), 0)).aid);
                    }
                    if (!followingInterestFeedResponse.getHasMore()) {
                        C0QSU.LIZIZ.put(str, ((Aweme) ListProtector.get(followingInterestFeedResponse.getAwemeList(), followingInterestFeedResponse.getAwemeList().size() - 1)).aid);
                    }
                }
                FollowingFeedListModel followingFeedListModel8 = FollowingFeedListModel.this;
                List<Aweme> awemeList = followingInterestFeedResponse.getAwemeList();
                if (awemeList != null && !awemeList.isEmpty()) {
                    z3 = false;
                }
                followingFeedListModel8.mIsNewDataEmpty = z3;
                Message messageObtainMessage2 = FollowingFeedListModel.this.mHandler.obtainMessage(0);
                messageObtainMessage2.obj = followingInterestFeedResponse;
                FollowingFeedListModel.this.mHandler.sendMessage(messageObtainMessage2);
            }

            @Override // X.C09JN
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FollowingFeedListModel@67b9.loadList$1");
                accept((FollowingInterestFeedResponse) obj);
                C1C7U.LIZIZ("FollowingFeedListModel@67b9.loadList$1");
            }
        }, new C09JN() { // from class: com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel.loadList.2
            public final void accept(Throwable th) {
                Message messageObtainMessage = FollowingFeedListModel.this.mHandler.obtainMessage(0);
                messageObtainMessage.obj = new RuntimeException(th);
                FollowingFeedListModel.this.mHandler.sendMessage(messageObtainMessage);
            }

            @Override // X.C09JN
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FollowingFeedListModel@67b9.loadList$2");
                accept((Throwable) obj);
                C1C7U.LIZIZ("FollowingFeedListModel@67b9.loadList$2");
            }
        });
    }
}
