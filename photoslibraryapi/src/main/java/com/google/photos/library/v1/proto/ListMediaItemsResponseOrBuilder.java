// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface ListMediaItemsResponseOrBuilder
        extends
        // @@protoc_insertion_point(interface_extends:google.photos.library.v1.ListMediaItemsResponse)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * [Output only] List of media items in the user's library.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaItem media_items = 1;</code>
     */
    java.util.List<com.google.photos.library.v1.proto.MediaItem> getMediaItemsList();

    /**
     * <pre>
     * [Output only] List of media items in the user's library.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaItem media_items = 1;</code>
     */
    com.google.photos.library.v1.proto.MediaItem getMediaItems(int index);

    /**
     * <pre>
     * [Output only] List of media items in the user's library.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaItem media_items = 1;</code>
     */
    int getMediaItemsCount();

    /**
     * <pre>
     * [Output only] List of media items in the user's library.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaItem media_items = 1;</code>
     */
    java.util.List<? extends com.google.photos.library.v1.proto.MediaItemOrBuilder>
    getMediaItemsOrBuilderList();

    /**
     * <pre>
     * [Output only] List of media items in the user's library.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaItem media_items = 1;</code>
     */
    com.google.photos.library.v1.proto.MediaItemOrBuilder getMediaItemsOrBuilder(int index);

    /**
     * <pre>
     * [Output only] Token to use to get the next set of media items. Its presence
     * is the only reliable indicator of more media items being available in the
     * next request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    java.lang.String getNextPageToken();

    /**
     * <pre>
     * [Output only] Token to use to get the next set of media items. Its presence
     * is the only reliable indicator of more media items being available in the
     * next request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    com.google.protobuf.ByteString getNextPageTokenBytes();
}
